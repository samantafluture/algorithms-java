package br.com.algoritmos.buscabinaria;

import java.util.Scanner;

public class BuscaBinaria {

    // dividir para conquistar
    // precisa ter um array ordenado
    // chama binária pois divide o vetor em dois
    // para verificar onde o elemento está
    // exemplo -> alvo = 6; array = [1, 2, 4, 5, 6]
    // resposta -> divido no meio (4) -> é maior ou menor?
    // maior -> então vá para a direita
    // vai dividir de novo [5, 6] e assim por diante...
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

        // ** Busca Binária **
        int resultado = -1; // posição do elemento a ser encontrado
        int inicio = 0; // 1a posição do vetor
        int fim = numeros.length - 1; // última posição do vetor
        int meio = 0; // controla o elemento central

        System.out.println("Digite o elemento a ser encontrado: ");
        int alvo = leitor.nextInt(); // elemento digitado pelo usuário

        // iterar enquanto o início for menor ou igual ao fim (ou seja, tiver índices válidos)
        while (inicio <= fim) {
            meio = (inicio + fim) / 2; // pega o elemento central
            if (numeros[meio] < alvo) {
                inicio = meio + 1; // se o elemento central for menor, vai para a direita
            } else if (numeros[meio] > alvo) {
                fim = meio - 1; // se o elemento central for maior, vai para a esquerda
            } else if (numeros[meio] == alvo) {
                resultado = meio; // se o elemento for encontrado, retorna a posição
                break;
            }
        }  

        if (resultado < 0) {
            System.out.println("Elemento não encontrado!");
        } else {
            System.out.println(String.format("O elemento %d está na posição %d", alvo, resultado));
        }

        // ** Fim **
        // System.out.println("Vetor: ");
        // imprimirArray(numeros);
        leitor.close();
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
