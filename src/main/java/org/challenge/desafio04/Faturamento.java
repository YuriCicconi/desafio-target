package org.challenge.desafio04;

public class Faturamento {
    private double faturamento;
    private String uf;

    public Faturamento(double faturamento, String uf) {
        this.faturamento = faturamento;
        this.uf = uf;
    }

    protected double getFaturamento() {
        return faturamento;
    }

    protected String getUf() {
        return uf;
    }
}
