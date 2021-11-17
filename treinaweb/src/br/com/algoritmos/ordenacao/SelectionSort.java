package br.com.algoritmos.ordenacao;

import java.util.Scanner;

// seleciono o menor elemento
// e o posiciono em seu devido lugar (à esquerda)
// e repito o processo até estar ordenado

public class SelectionSort {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = leitor.nextInt();
        }

        // ** Selection Sort **
        // 1. varrer todo o vetor -> posição atual [i]
        for (int i = 0; i < numeros.length; i++) {
            int indiceDoMenor = i;
            // 2. varrer o vetor a partir do i + 1 para descobrir o menor
            // posição [j] ao lado direito da [i]
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceDoMenor]) {
                    indiceDoMenor = j;
                }
            }
            // 3. permutação (entre elemento analisado [i] e o menor elemento
            // [indiceDoMenor])
            int temp = numeros[indiceDoMenor]; // variável temporária na posição do menor elemento
            numeros[indiceDoMenor] = numeros[i]; // posiciono o menor elemento na posição i
            numeros[i] = temp; // posiciono o elemento i na posição do menor elemento
        }

        System.out.println("Vetor ordenado: ");
        imprimirArray(numeros);

        // ** Fim **
        leitor.close();
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
