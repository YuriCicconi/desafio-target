package org.challenge.desafio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite algo para ser invertido: ");
        String stringOriginal = sc.next();

        char[] letras = new char[stringOriginal.length()];
        int j = 0;

        for (int i = stringOriginal.length() - 1; i >= 0; i--) {
            letras[j] = stringOriginal.charAt(i);
            j++;
        }

        String stringInvertida = new String(letras);

        System.out.println(stringOriginal);
        System.out.println(stringInvertida);
    }
}
