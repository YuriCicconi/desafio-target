package org.challenge.desafio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        int opcao = 0;

        List<Faturamento> faturamentos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("*** Bem vindo ***");

        do {
            System.out.println("\nO que deseja fazer?\n");
            System.out.println("1- Cadastrar novo faturamento");
            System.out.println("2- Ver menor faturamento de um mês" );
            System.out.println("3- Ver maior faturamento de um mês");
            System.out.println("4- Dias de um mês onde o faturamento foi maior que a média");
            System.out.println("5- Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nInforme o mês que deseja cadastrar");
                    String mes = sc.next();
                    System.out.println("\nQuantos dias deseja cadastrar?");
                    int qtdDias = sc.nextInt();
                    for (int i = 0; i < qtdDias; i++) {
                        System.out.println("\nInforme o dia que deseja cadastrar");
                        int dia = sc.nextInt();
                        System.out.println("\nPor fim, informe qual foi o faturamento desse dia");
                        double fatDia = sc.nextDouble();

                        Faturamento fat = new Faturamento(fatDia, mes, dia);
                        faturamentos.add(fat);
                    }
                    break;
                case 2:
                    System.out.println("\nInforme o mês que deseja obter o menor faturamento");
                    mes = sc.next();

                    boolean existe = false;

                    for (int i = 0; i < faturamentos.size(); i++) {
                        if (faturamentos.get(i).getMes().equalsIgnoreCase(mes)) {
                            existe = true;
                        }
                    }

                    if (!existe) {
                        System.out.println("\nNão há nenhum registro para o mês selecionado. Tente novamente.");
                        break;
                    }

                    int piorDia = 0;
                    double menor = Double.MAX_VALUE;
                    for (Faturamento faturamento : faturamentos) {
                        if (faturamento.getMes().equalsIgnoreCase(mes)) {
                            if (faturamento.getFaturamento() < menor) {
                                menor = faturamento.getFaturamento();
                                piorDia = faturamento.getDia();
                            }
                        }
                    }

                    System.out.println("\nO menor faturamento para o mês de " + mes +
                            " foi no dia " + piorDia +
                            " e foi de R$" + menor);
                    break;
                case 3:
                    System.out.println("\nInforme o mês que deseja obter o maior faturamento");
                    mes = sc.next();

                    existe = false;

                    for (int i = 0; i < faturamentos.size(); i++) {
                        if (faturamentos.get(i).getMes().equalsIgnoreCase(mes)) {
                            existe = true;
                        }
                    }

                    if (!existe) {
                        System.out.println("\nNão há nenhum registro para o mês selecionado. Tente novamente.");
                        break;
                    }

                    int melhorDia = 0;
                    double maior = Double.MIN_VALUE;
                    for (Faturamento faturamento : faturamentos) {
                        if (faturamento.getMes().equalsIgnoreCase(mes)) {
                            if (faturamento.getFaturamento() > maior) {
                                maior = faturamento.getFaturamento();
                                melhorDia = faturamento.getDia();
                            }
                        }
                    }

                    System.out.println("\nO maior faturamento para o mês de " + mes + " foi no dia " + melhorDia + " e foi de R$" + maior);
                    break;
                case 4:
                    System.out.println("\nInforme o mês que deseja obter o maior faturamento");
                    mes = sc.next();

                    existe = false;

                    for (int i = 0; i < faturamentos.size(); i++) {
                        if (faturamentos.get(i).getMes().equalsIgnoreCase(mes)) {
                            existe = true;
                        }
                    }

                    if (!existe) {
                        System.out.println("\nNão há nenhum registro para o mês selecionado. Tente novamente.");
                        break;
                    }

                    List<Faturamento> faturamentosDoMes = new ArrayList<>();

                    for (int i = 0; i < faturamentos.size(); i++) {
                        if (faturamentos.get(i).getMes().equalsIgnoreCase(mes)) {
                            faturamentosDoMes.add(faturamentos.get(i));
                        }
                    }

                    int diasAcimaDaMedia = maioresFaturamentos(faturamentosDoMes);

                    System.out.println("\nNo mês de " + mes + " tivemos " + diasAcimaDaMedia + " meses com faturamento acima da média.");
            }
        } while (opcao != 5);
    }

    static int maioresFaturamentos(List<Faturamento> faturamentos) {
        int quantidade = 0;
        double faturamentoTotal = 0;
        int maioresQueMedia = 0;

        for (Faturamento faturamento: faturamentos) {
            faturamentoTotal += faturamento.getFaturamento();
            quantidade++;
        }

        double media = faturamentoTotal / quantidade;

        for (Faturamento faturamento: faturamentos) {
            if (faturamento.getFaturamento() > media) {
                maioresQueMedia++;
            }
        }

        return maioresQueMedia;
    }
}
