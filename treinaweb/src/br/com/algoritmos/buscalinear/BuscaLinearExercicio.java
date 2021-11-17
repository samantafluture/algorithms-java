package br.com.algoritmos.buscalinear;

import java.util.*;

public class BuscaLinearExercicio {
    public static void main(String args[]) {
        Scanner scann = new Scanner(System.in);
        int tamanho = Integer.parseInt(scann.nextLine());
        String[] paises = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            paises[i] = scann.nextLine();
        }

        // busca linear
        String pais = scann.nextLine();
        int index = -1;

        for (int i = 0; i < tamanho; i++) {
            if (paises[i].equals(pais)) {
                index = i;
                break;
            }
        }

        System.out.println(index);
        scann.close();
    }
}
