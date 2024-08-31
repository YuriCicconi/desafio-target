package org.challenge.desafio03;

import java.util.List;

class Faturamento {
    private double faturamento;
    private String mes;
    private int dia;
    protected Faturamento(double faturamento, String mes, int dia) {
        this.faturamento = faturamento;
        this.mes = mes;
        this.dia = dia;
    }

    protected double getFaturamento() {
        return faturamento;
    }

    public String getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    @Override
    public String toString() {
        String fat = String.format("%.2f", faturamento);
        return "Faturamento do dia " + dia + " de " + mes + ": R$" + fat;
    }
}
