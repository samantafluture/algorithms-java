package br.com.algoritmos.basico;

import java.util.*;

// Escrevendo e lendo dados a partir de arrays

public class WriteReadString {
    public static void main(String[] args) {
        // 1. cria objeto scanner
        Scanner scanner = new Scanner(System.in);
        // 2. cria tamanho do array a partir do int digitado
        int tamanho = Integer.parseInt(scanner.nextLine());
        // 3. cria array de strings com o tamanho digitado
        String[] paises = new String[tamanho];

        // 4. para cada posição do array: ler o nome do país
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um país: ");
            paises[i] = scanner.nextLine();
        }

        // 5. para cada posição do array: mostrar o nome do país na mesma linha
        for (int i = 0; i < tamanho; i++) {
            System.out.print(paises[i] + " ");
        }

        // 6. fecha o programa
        scanner.close();
    }
}
