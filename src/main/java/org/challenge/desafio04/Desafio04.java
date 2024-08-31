package org.challenge.desafio04;

import java.util.ArrayList;
import java.util.List;

public class Desafio04 {
    public static void main(String[] args) {
        List<Faturamento> faturamentos = new ArrayList<>();

        Faturamento faturamentoSP = new Faturamento(67836.43, "SP");
        Faturamento faturamentoRJ = new Faturamento(36678.66, "RJ");
        Faturamento faturamentoMG = new Faturamento(29229.88, "MG");
        Faturamento faturamentoES = new Faturamento(27165.48, "ES");
        Faturamento faturamentoOutros = new Faturamento(19849.53, "Outros");

        faturamentos.add(faturamentoSP);
        faturamentos.add(faturamentoRJ);
        faturamentos.add(faturamentoMG);
        faturamentos.add(faturamentoES);
        faturamentos.add(faturamentoOutros);

        participacaoDeCadaEstado(faturamentos);
    }

    static void participacaoDeCadaEstado(List<Faturamento> faturamentos) {
        double faturamentoTotal = 0;
        double faturamentoSP = 0;
        double faturamentoRJ = 0;
        double faturamentoMG = 0;
        double faturamentoES = 0;
        double faturamentoOutros = 0;


        for (Faturamento faturamento : faturamentos) {
            faturamentoTotal += faturamento.getFaturamento();
            String estado = faturamento.getUf();

            switch (estado) {
                case "SP":
                    faturamentoSP = faturamento.getFaturamento();
                    break;
                case "RJ":
                    faturamentoRJ = faturamento.getFaturamento();
                    break;
                case "MG":
                    faturamentoMG = faturamento.getFaturamento();
                    break;
                case "ES":
                    faturamentoES = faturamento.getFaturamento();
                    break;
                default:
                    faturamentoOutros = faturamento.getFaturamento();
            }

        }
        faturamentoSP = (faturamentoSP / faturamentoTotal) * 100;
        faturamentoRJ = (faturamentoRJ / faturamentoTotal) * 100;
        faturamentoMG = (faturamentoMG / faturamentoTotal) * 100;
        faturamentoES = (faturamentoES / faturamentoTotal) * 100;
        faturamentoOutros = (faturamentoOutros / faturamentoTotal) * 100;
        System.out.println(faturamentoTotal);
        System.out.printf("A participação de SP no faturamento total da empresa foi de %.2f%% do total.\n", faturamentoSP);
        System.out.printf("A participação do RJ no faturamento total da empresa foi de %.2f%% do total.\n", faturamentoRJ);
        System.out.printf("A participação de MG no faturamento total da empresa foi de %.2f%% do total.\n", faturamentoMG);
        System.out.printf("A participação do ES no faturamento total da empresa foi de %.2f%% do total.\n", faturamentoES);
        System.out.printf("A participação dos demais estados no faturamento total da empresa foi de %.2f%% do total.\n", faturamentoOutros);
        }
}
