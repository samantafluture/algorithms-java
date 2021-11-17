package br.com.algoritmos.buscabinaria;

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

public class BuscaBinariaExercicio {
    public static void main(String args[]) {
        Scanner scann = new Scanner(System.in);
        int tamanho = Integer.parseInt(scann.nextLine());
        Estudante[] estudantes = new Estudante[tamanho];

        for (int i = 0; i < estudantes.length; i++) {
            int id = scann.nextInt();
            String nome = scann.next();
            double nota = scann.nextDouble();
            estudantes[i] = new Estudante(id, nome, nota);
        }

        // ordenação
        for (int i = 0; i < estudantes.length; i++) {
            int indice = i;
            for (int j = i + 1; j < estudantes.length; j++) {
                if (estudantes[j].getNota() > estudantes[indice].getNota())
                    indice = j;
                else if (estudantes[j].getNota() == estudantes[indice].getNota()) {
                    int comparacao = estudantes[j].getNome().compareTo(estudantes[indice].getNome());
                    if (comparacao < 0)
                        indice = j;
                    else if (comparacao == 0)
                        if (estudantes[j].getId() > estudantes[indice].getId())
                            indice = j;
                }
            }

            Estudante temp = estudantes[i];
            estudantes[i] = estudantes[indice];
            estudantes[indice] = temp;
        }

        // busca binária

        Estudante estudante = null;
        int inicio = 0;
        int fim = estudantes.length - 1;
        int meio = 0;
        double nota = scann.nextDouble();
        
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (estudantes[meio].getNota() > nota)
                inicio = meio + 1;
            else if (estudantes[meio].getNota() < nota)
                fim = meio - 1;
            else if (estudantes[meio].getNota() == nota) {
                estudante = estudantes[meio];
                break;
            }
        }

        if (estudante != null) {
            System.out.println(estudante.getNome());
        }

        scann.close();
    }
}
