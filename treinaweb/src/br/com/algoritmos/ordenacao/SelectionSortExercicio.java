package br.com.algoritmos.ordenacao;

import java.util.Scanner;

class Estudante {
    private int id;
    private String nome;
    private double nota;

    public Estudante(int id, String nome, double nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
}

public class SelectionSortExercicio {
    public static void main(String args[]) {
        Scanner scann = new Scanner(System.in);
        int tamanho = Integer.parseInt(scann.nextLine()); // digito o tamanho do array
        Estudante[] estudantes = new Estudante[tamanho];

        for (int i = 0; i < estudantes.length; i++) {
            int id = scann.nextInt(); // insiro o id
            String nome = scann.next(); // insiro o nome
            double nota = scann.nextDouble(); // insiro a nota

            estudantes[i] = new Estudante(id, nome, nota); 
        }

        for (int i = 0; i < estudantes.length; i++) {
            int indice = i;
            for (int j = i + 1; j < estudantes.length; j++) { // descubro o menor
                if (estudantes[j].getNota() > estudantes[indice].getNota())
                    indice = j;
                else if (estudantes[j].getNota() == estudantes[indice].getNota()) { // se a nota for a mesma
                    int comparacao = estudantes[j].getNome().compareTo(estudantes[indice].getNome()); // comparo o nome
                    if (comparacao < 0) 
                        indice = j; // ordem alfabética pelo nome
                    else if (comparacao == 0) // se o nome começar com a mesma letra
                        if (estudantes[j].getId() < estudantes[indice].getId())
                            indice = j; // ordem pelo id
                }
            }

            // permutação
            Estudante temp = estudantes[i];
            estudantes[i] = estudantes[indice];
            estudantes[indice] = temp;
        }

        // imprimir os nomes dos estudantes na ordem ordenada
        for (Estudante e : estudantes) {
            System.out.println(e.getNome());
        }

        scann.close();
    }
}

/* dados de entrada
5
33 Samanta 3.68
85 Maria 3.85
56 João 3.75
19 Fernanda 3.75
22 Renata 3.76
*/