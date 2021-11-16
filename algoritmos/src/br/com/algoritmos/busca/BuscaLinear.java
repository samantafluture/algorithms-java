package br.com.algoritmos.busca;

import java.util.Scanner;

public class BuscaLinear {

    // varre o vetor de inteiros como se fosse uma linha
    // e retorna o índice do elemento procurado
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número: ");
            numeros[i] = leitor.nextInt();
        }

        // ** Busca linear **
        System.out.println("** Busca Linear **");
        System.out.println("Digite um número a ser pesquisado: ");

        int alvo = leitor.nextInt(); // o que o usuário digitar
        int posicaoResultado = -1; // -1 pois array não tem esta posição

        // checa para cada posição do array, se o valor é igual ao alvo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == alvo) {
                posicaoResultado = i;
                break; // interrompe caso encontre o elemento
            }
        }

        // se a posição do resultado for -1, significa que não encontrou
        // se encontrou, imprimir o elemento e o índice
        if (posicaoResultado < 0) {
            System.out.println("Elemento não encontrado");
        } else {
            System.out.println(String.format("O número %d foi encontrado na posição %d", alvo, posicaoResultado));
        }

        // ** Fim **
        System.out.println("Vetor: ");
        imprimirArray(numeros);
        leitor.close();

    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
