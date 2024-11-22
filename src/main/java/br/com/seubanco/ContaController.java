// src/main/java/com/banco/api/ContaController.java
package br.com.seubanco;

import io.micronaut.http.annotation.*;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import java.util.List;

@Controller("/contas")
public class ContaController {

    @Inject
    private ContaServico contaServico;

    @Get
    public List<Conta> listarContas() {
        return contaServico.getContas();
    }

    @Post
    @Status(HttpStatus.CREATED)
    public Conta criarConta(@Body Conta conta) {
        return contaServico.criarConta(conta);
    }
}
