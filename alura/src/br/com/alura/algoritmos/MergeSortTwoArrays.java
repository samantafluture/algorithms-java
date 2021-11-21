package br.com.alura.algoritmos;

// fundir duas listas ordenadas em uma só, ordenada

public class MergeSortTwoArrays {
    public static void main(String[] args) {
        Nota[] notas1 = { new Nota("Mariana", 5), new Nota("André", 7.5), new Nota("Roger", 8),
                new Nota("Samanta", 9.5) };

        Nota[] notas2 = { new Nota("Rodrigo", 4.5), new Nota("Vitor", 5.5), new Nota("Lúcia", 7),
                new Nota("Ana", 9) };

        Nota[] notasOrdenadas = intercala(notas1, notas2);

        for (Nota nota : notasOrdenadas) {
            System.out.println(nota.getAluno() + ": " + nota.getValor());
        }
    }

    private static Nota[] intercala(Nota[] notas1, Nota[] notas2) {
        // cria um novo array resultado do tamanho da soma dos dois arrays
        int tamanho = notas1.length + notas2.length;
        Nota[] resultadoNotas = new Nota[tamanho];

        // contadores -> começa no zero
        int atual1 = 0;
        int atual2 = 0;
        int atualDoResultado = 0;

        // enquanto tiver posição no array para percorrer e não tiver chegado no final
        while (atual1 < notas1.length && atual2 < notas2.length) {
            Nota nota1 = notas1[atual1];
            Nota nota2 = notas2[atual2];

            // se a nota do array 1 for menor que a do array 2
            if (nota1.getValor() < nota2.getValor()) {
                resultadoNotas[atualDoResultado] = nota1;
                atual1++;
            } else {
                resultadoNotas[atualDoResultado] = nota2;
                atual2++;
            }
            atualDoResultado++;
        }

        // se o array 1 não terminou, copia o restante do array 1
        while (atual1 < notas1.length) {
            resultadoNotas[atualDoResultado] = notas1[atual1];
            atualDoResultado++;
            atual1++;
        }

        // se o array 2 não terminou, copia o restante do array 2
        while (atual2 < notas2.length) {
            resultadoNotas[atualDoResultado] = notas2[atual2];
            atualDoResultado++;
            atual2++;
        }

        return resultadoNotas;
    }
}
