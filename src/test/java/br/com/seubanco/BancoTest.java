// src/test/java/com/banco/api/ContaControllerTest.java
package br.com.seubanco;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import io.micronaut.http.HttpResponse;

@MicronautTest
public class BancoTest {

    @Inject
    @Client("/contas")
    HttpClient client;

    @Test
    void testCriarEListarContas() {
        Conta novaConta = new Conta("1", "João Silva", 500.0);
        HttpResponse<Conta> resposta = client.toBlocking()
                .exchange(HttpRequest.POST("", novaConta), Conta.class);

        assertEquals(201, resposta.getStatus().getCode());

        Conta[] contas = client.toBlocking().retrieve(HttpRequest.GET("/"), Conta[].class);
        assertEquals(1, contas.length);
        assertEquals("João Silva", contas[0].getNomeTitular());
    }
}
