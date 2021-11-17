package br.com.alura.algoritmos;

// insertion sort (ordenação por inserção)
// encontrando a casinha onde deveríamos inserir um elemento

public class InsertionSort {
    public static void main(String[] args) {
        Produto[] produtos = { new Produto("Lamborghini", 1000000), new Produto("Jipe", 46000),
                new Produto("Brasília", 16000), new Produto("Smart", 46000), new Produto("Fusca", 17000) };

        insertionSort(produtos, produtos.length);

        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " custa R$ " + produto.getPreco());
        }
    }

    // método para ordenar
    private static void insertionSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 1; atual < quantidadeDeElementos; atual++) {
            System.out.println("Estou na casinha " + atual);
            int analise = atual;

            // analisa o elemento anterior (à esquerda) -> se o analisado for menor que o
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                System.out.println("Estou trocando " + analise + " com " + (analise - 1));
                troca(produtos, analise, analise - 1); // trocando o atual com o anterior
                analise--; // continua comparando com os elementos da esquerda até encontrar a posição
            }
        }
    }

    private static void troca(Produto[] produtos, int analise, int i) {
        Produto produtoAnalise = produtos[analise];
        Produto produtoAnaliseMenos1 = produtos[analise - 1];
        System.out.println("Estou trocando " + produtoAnalise.getNome() + " com " + produtoAnaliseMenos1.getNome());
        produtos[analise] = produtoAnaliseMenos1;
        produtos[analise - 1] = produtoAnalise;
    }

}
