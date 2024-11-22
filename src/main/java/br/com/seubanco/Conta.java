// src/main/java/com/banco/api/Conta.java
package br.com.seubanco;

public class Conta {
    private String id;
    private String nomeTitular;
    private double saldo;

    public Conta(String id, String nomeTitular, double saldo) {
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
