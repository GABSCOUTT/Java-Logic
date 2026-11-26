package Java.fundamentals;

public class arrays {
    public static void main(String[] args){
        // Sistema de Relatório de Vendas
// Projeto desenvolvido para analisar as vendas de uma loja.
// Funcionalidades:
// - Listagem de produtos e quantidades vendidas.
// - Cálculo do total de vendas.
// - Identificação do produto mais vendido.
// - Contagem de produtos com mais de 10 vendas.
// - Cálculo da média de vendas por produto.

        String[] produtos = {"Camiseta", "Calça", "Tênis", "Boné", "Mochila"};
        int[] vendas = {15, 8, 23, 18, 5};

        int soma = 0;
        int maiorVenda = vendas[0];
        int contador = 0;
        String maiorProdutoVendido = produtos[0];
        int media;

        for (int i = 0; i < vendas.length; i++){
            // soma de todas as vendas
            soma += vendas[i];

            //Produto mais vendito e quanto vendeu desse produto
            if (vendas[i] > maiorVenda){
                maiorVenda = vendas[i];
                maiorProdutoVendido = produtos[i];
            }
            //Produtos que venderam mais de 10
            if (vendas[i] > 10) {
                contador++;
            }

        }
        System.out.println("------ RELATÓRIO DE VENDAS ------");

        for (int i =0; i < vendas.length ; i++){
            System.out.println("Produtos: " + produtos[i]);
            System.out.println("Vendas: " + vendas[i]);
        }
        System.out.println("Total de vendas: "+ soma);
        System.out.println("Maior produto vendido: " + maiorProdutoVendido);
        System.out.println("Maior quantidade vendida: " + maiorVenda);
        System.out.println("Produtos com mais de 10 vendas: " + contador);

        media = soma/vendas.length;
        System.out.println("A media produtos vendidos: " + media);

    }
}
