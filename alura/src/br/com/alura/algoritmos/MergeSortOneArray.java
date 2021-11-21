package br.com.alura.algoritmos;

public class MergeSortOneArray {
    public static void main(String[] args) {
        Nota[] notas = { new Nota("Mariana", 5), new Nota("André", 7.5), new Nota("Roger", 8), new Nota("Samanta", 9.5),
                new Nota("Rodrigo", 4.5), new Nota("Vitor", 5.5), new Nota("Lúcia", 7), new Nota("Ana", 9) };

        // quando receber 1 array -> passa o array e: inicio, a posição "miolo" e o termino que é o tamanho
        Nota[] notasOrdenadas = intercala(notas, 1, 4, notas.length);

        for (Nota nota : notasOrdenadas) {
            System.out.println(nota.getAluno() + ": " + nota.getValor());
        }
    }

    private static Nota[] intercala(Nota[] notas, int inicio, int miolo, int termino) {
        Nota[] resultado = new Nota[termino - inicio];

        int atual = 0;
        int atual1 = inicio;
        int atual2 = miolo;

        while (atual1 < miolo && atual2 < termino) {
            Nota nota1 = notas[atual1];
            Nota nota2 = notas[atual2];

            if(nota1.getValor() < nota2.getValor()){
                resultado[atual] = nota1;
                atual1++;
            } else {
                resultado[atual] = nota2;
                atual2++;
            }
            atual++;
        }

        while (atual1 < miolo) {
            resultado[atual] = notas[atual1];
            atual1++;
            atual++;
        }

        while (atual2 < termino) {
            resultado[atual] = notas[atual2];
            atual2++;
            atual++;
        }

        for (int i = 0; i < atual; i++) {
            notas[inicio + i] = resultado[i];
        }

        return notas;
    }
}
