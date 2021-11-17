package br.com.alura.algoritmos;

// selection sort (ordenação por seleção)
// seleciona o menor a partir da posição atual e o reposiciona na lista
// selecionando quem deveria ficar em cada casinha

public class SelectionSort {
    public static void main(String[] args) {
        Produto[] produtos = { new Produto("Lamborghini", 1000000), new Produto("Jipe", 46000),
                new Produto("Brasília", 16000), new Produto("Smart", 46000), new Produto("Fusca", 17000) };

        selectionSort(produtos, produtos.length);

        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " custa R$ " + produto.getPreco());
        }
    }

    // método para buscar o menor elemento
    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;
        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    // método para ordenar
    private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            // log -> posição atual
            System.out.println("Estou na casinha " + atual);

            // 1. encontra o menor elemento
            int menor = buscaMenor(produtos, atual, produtos.length - 1);

            // log -> trocando a posição atual com a posição do elemento menor
            System.out.println("Trocando " + atual + " com o " + menor);

            // 2. troca os elementos de lugar -> menor fica à esquerda
            troca(produtos, atual, menor);
        }
    }

    // método para trocar
    private static void troca(Produto[] produtos, int primeiro, int segundo) {
        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];
        System.out.println("Estou trocando " + primeiroProduto.getNome() + " com " + segundoProduto.getNome());
        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }
}
