package org.challenge.desafio02;

public class Desafio02 {

    public static void main(String[] args) {

        int numeroDesejado = 21;
        boolean achou = false;

        if (numeroDesejado <= 3) {
            for (int i = 0; i <= numeroDesejado*2; i++) {
                int resultado = fibonacci(i);

                if (resultado == numeroDesejado) {
                    System.out.println("O número " + numeroDesejado + " está na sequência Fibonacci.");
                    achou = true;
                    break;
                }
            }
        } else {
            for (int i = 0; i <= numeroDesejado; i++) {
                int resultado = fibonacci(i);

                if (resultado == numeroDesejado) {
                    System.out.println("O número " + numeroDesejado + " está na sequência Fibonacci.");
                    achou = true;
                    break;
                }
            }
        }


        if (!achou) System.out.println("O número " + numeroDesejado + " não está na sequência Fibonacci.");
    }

    static int fibonacci (int n) {

        int atual = 0;
        int anterior = 0;

        for (int i = 0; i <= n; i++) {

            if (i == 1) {
                atual = 1;
                anterior = 0;
            } else {
                atual += anterior;
                anterior = atual - anterior;
            }
        }

        return atual;
    }
}
