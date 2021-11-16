package br.com.algoritmos.basico;

import java.util.Scanner;

// Escrevendo e lendo dados a partir de arrays

public class WriteReadArray {
    public static void main(String[] args) {
        // 1. Criar um array de inteiros com 5 posições
        int[] numeros = new int[5];

        // 2. Variável leitor lê os dados do teclado usando Scanner
        Scanner leitor = new Scanner(System.in);

        // 3. Para cada posição do array: ler o número do teclado
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = leitor.nextInt();
        }

        // 4. Imprimir os valores do array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // 5. Finalizar o programa
        leitor.close();
    }
}
