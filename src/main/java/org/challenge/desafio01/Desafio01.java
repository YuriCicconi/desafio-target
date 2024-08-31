package org.challenge.desafio01;

public class Desafio01 {

    public static void main(String[] args) {
        int indice = 13;
        int k = 0;
        int soma = 0;

        while (k < indice) {
            k++;

            soma+= k;
        }

        System.out.println(soma);
    }
}
