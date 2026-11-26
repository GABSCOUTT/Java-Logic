package Java.fundamentals;

public class repeated {
    public static void main(String[] args){

        // Projeto: Sequência de Fibonacci
        // Objetivo: Gerar e exibir os 10 primeiros números da sequência
        // de Fibonacci, em que cada número é resultado da soma dos dois anteriores.

        // Define os dois primeiros números da sequência.
        int primeiroNumero = 0;
        int segundoNumero = 1;

        // Controla a quantidade de números que serão exibidos.
        int quantidadeNumeros = 10;

        for (int i = 0; i < quantidadeNumeros; i++) {

            // Exibe o número atual da sequência.
            System.out.println(primeiroNumero);

            // Calcula o próximo número somando os dois anteriores.
            int proximoNumero = primeiroNumero + segundoNumero;

            // Atualiza os valores para a próxima repetição.
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
        }
    }

}
