// src/main/java/com/banco/api/ContaServico.java
package br.com.seubanco;

import jakarta.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class ContaServico {

    private final List<Conta> contas = new ArrayList<>();

    public List<Conta> getContas() {
        return contas;
    }

    public Conta criarConta(Conta conta) {
        contas.add(conta);
        return conta;
    }
}
