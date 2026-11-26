package Java.fundamentals;

import java.util.Scanner;

// Projeto: Sistema de Pedidos de Lanchonete
// Objetivo: Simular um sistema de pedidos em que o cliente escolhe um lanche
// e uma bebida através de um cardápio. O programa utiliza estruturas switch
// para identificar as opções selecionadas, calcular os preços e apresentar
// o valor total da conta.

public class conditionals02 {
    public static void main(String[] args){

        // Variáveis utilizadas para armazenar os preços e o valor total.
        Scanner scanner = new Scanner(System.in);

        double precoLanche = 0;
        double precoBebida = 0;
        double conta;

        // Exibição do cardápio de lanches.
        System.out.println("-----------------------");
        System.out.println("------- CARDAPIO ------");
        System.out.println("-----------------------");

        System.out.println("LANCHES: ");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Quando escolher, digite o numero correspondente a su escolha");
        System.out.println("batata frita - 1\nhamburger - 2\nPizza - 3\nPastel - 4\nCoxinha - 5");

        System.out.println("Digite o numero do seu pedido");
        int lanche = scanner.nextInt();

        // Identifica o lanche escolhido e define seu preço.
        switch (lanche){
            case 1:
                System.out.println("batata frita - R$8,00");
                precoLanche = 8;
                break;
            case 2:
                System.out.println("hamburger - R20,00");
                precoLanche = 20;
                break;
            case 3:
                System.out.println("Pizza - R$16,00");
                precoLanche = 16;
                break;
            case 4:
                System.out.println("Pastel - R$14,00");
                precoLanche = 14;
                break;
            case 5:
                System.out.println("Coxinha - R$8,00");
                precoLanche = 8;
                break;
            default:
                System.out.println("Opção invalida");
        }

        // Exibição das opções de bebidas.
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Ecolha o numero correspodnente a sua bebida");
        System.out.println("Agua - 1\nRefrigerante - 2\nSucos - 3\nCerveja - 4\nVinhos - 5\nNão quero bebidas - 6");
        System.out.println("--------------------------------------------------------------------------------");

        // Recebe a opção de bebida escolhida pelo cliente.
        System.out.println("Digite o numero da sua bebida de escolha");
        int bebida = scanner.nextInt();

        // Identifica a bebida escolhida e define seu preço.
        switch (bebida){
            case 1:
                System.out.println("Agua - R$6,00");
                precoBebida = 6;
                break;
            case 2:
                System.out.println("Refrigerante - R$8,00");
                precoBebida = 8;
                break;
            case 3:
                System.out.println("Sucos - R$12,00");
                precoBebida = 12;
                break;
            case 4:
                System.out.println("Cerveja - R$13,00");
                precoBebida = 13;
                break;
            case 5:
                System.out.println("Vinhos - R$18,00");
                precoBebida = 18;
                break;
            case 6:
                System.out.println("tudo bem!");
                break;
            default:
                System.out.println("Opção invalida");
        }

        // Soma os preços do lanche e da bebida.
        conta = precoLanche + precoBebida;

        // Apresenta o valor total do pedido.
        System.out.println("A sua conta ficou: R$ " + conta);


        scanner.close();

    }
}
