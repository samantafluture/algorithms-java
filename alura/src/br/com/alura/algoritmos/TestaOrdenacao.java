package br.com.alura.algoritmos;

public class TestaOrdenacao {
    public static void main(String[] args) {
        Produto[] produtos = { 
            new Produto("Lamborghini", 1000000), 
            new Produto("Jipe", 46000),
            new Produto("Brasília", 16000), 
            new Produto("Smart", 46000), 
            new Produto("Fusca", 17000) 
        };

        ordena(produtos, produtos.length);

        for(Produto produto : produtos) {
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
    private static void ordena(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            // log -> posição atual
            System.out.println("Estou na casinha " + atual);

            // 1. encontra o menor elemento
            int menor = buscaMenor(produtos, atual, produtos.length - 1);

            // log -> trocando a posição atual com a posição do elemento menor
            System.out.println("Trocando " + atual + " com o " + menor);

            // 2. troca os elementos de lugar -> menor fica à esquerda
            Produto produtoAtual = produtos[atual]; // posição atual
            Produto produtoMenor = produtos[menor]; // posição do menor

            // log -> trocando os elementos
            System.out.println("Trocando "+ produtoAtual.getNome() + " " + produtoMenor.getNome());

            produtos[atual] = produtoMenor; 
            produtos[menor] = produtoAtual; 
        }
    }
}
