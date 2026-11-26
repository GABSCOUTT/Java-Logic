package Java.fundamentals;

public class operators {
    public static void main(String[] args){

        // Projeto: Sistema de Cálculo de Salário
        // Objetivo: Calcular o salário líquido de um funcionário considerando
        // salário base, comissão, descontos em folha e pagamento de horas extras.
        // Ao final, o programa apresenta um resumo dos valores calculados.

        // Valores utilizados no cálculo salarial.
        double salario = 2000;
        double comissao = 700;
        double descontosFolha = 10.89;
        double horaextra = 15;
        double valorHoraExtra = 9.50;

        // Calcula o salário bruto somando o salário base e a comissão.
        double salarioComissao = salario + comissao;

        // Calcula o valor do desconto em folha sobre o salário bruto.
        double valorDesconto= salarioComissao * descontosFolha / 100;

        // Subtrai os descontos do salário bruto.
        double salarioDescoto = salarioComissao - valorDesconto;

        // Calcula o pagamento correspondente às horas extras.
        double salarioHoraExtra = horaextra * valorHoraExtra;

        // Calcula o salário líquido após descontos e acréscimo das horas extras.
        double salarioliquido = salarioDescoto + salarioHoraExtra;

        // Exibe o resumo do cálculo salarial.
        System.out.println("Valor Bruto: R$"+ salarioComissao);
        System.out.println("Comissão: R$"+ comissao);
        System.out.println("Descontos da folda: R$"+ valorDesconto);
        System.out.println("Horas extra remunerada: R$"+ salarioHoraExtra);
        System.out.printf("Salario liquido: R$ %.2f%n", salarioliquido);


    }
}
