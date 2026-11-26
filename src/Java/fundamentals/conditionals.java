package Java.fundamentals;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args){

        // Sistema de aprovação escolar utilizado pelos professores
// O aluno recebe três notas: A1, A2 e A3
// Média 6 ou mais: aluno aprovado diretamente
// Média abaixo de 4: aluno reprovado
// Média entre 4 e 5,99: aluno vai para recuperação
// A nota da recuperação substitui a menor nota entre A1, A2 e A3
// Após a substituição, a média é calculada novamente
// Média final 6 ou mais: aluno aprovado
// Média final abaixo de 6: aluno reprovado

        Scanner scanner = new Scanner(System.in);

        // Recebe o nome do aluno.
        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        // Recebe as três notas iniciais.
        System.out.print("Nota da A1: ");
        double notaA1 = scanner.nextDouble();

        System.out.print("Nota da A2: ");
        double notaA2 = scanner.nextDouble();

        System.out.print("Nota da A3: ");
        double notaA3 = scanner.nextDouble();

        // Calcula a média das três avaliações.
        double notaFinal = (notaA1 + notaA2 + notaA3) / 3;

        // Verifica a situação do aluno de acordo com a média.
        if (notaFinal >= 6) {

            System.out.println("Aluno " + nome + " está APROVADO");

        } else if (notaFinal < 4) {

            System.out.println("Aluno " + nome + " está REPROVADO");

        } else {

            // Alunos com média entre 4 e 5,99 podem realizar a recuperação.
            System.out.println("Aluno " + nome + " está em RECUPERAÇÃO");

            System.out.print("Nota da A4 (recuperação): ");
            double notaA4 = scanner.nextDouble();

            // Identifica a menor nota entre A1, A2 e A3
            // para substituí-la pela nota da recuperação.
            if (notaA1 <= notaA2 && notaA1 <= notaA3) {

                double notaRecuperacaoFinal = (notaA2 + notaA3 + notaA4) / 3;

                // Verifica se o aluno atingiu a média necessária após a recuperação.
                if (notaRecuperacaoFinal >= 6) {
                    System.out.println("Com a nota " + notaA4 +
                            " da recuperação, o aluno está APROVADO");
                } else {
                    System.out.println("Com a nota " + notaA4 +
                            " da recuperação, o aluno está REPROVADO");
                }

            } else if (notaA2 <= notaA1 && notaA2 <= notaA3) {

                double notaRecuperacaoFinal = (notaA1 + notaA3 + notaA4) / 3;

                if (notaRecuperacaoFinal >= 6) {
                    System.out.println("Com a nota " + notaA4 +
                            " da recuperação, o aluno está APROVADO");
                } else {
                    System.out.println("Com a nota " + notaA4 +
                            " da recuperação, o aluno está REPROVADO");
                }

            } else {

                double notaRecuperacaoFinal = (notaA1 + notaA2 + notaA4) / 3;

                if (notaRecuperacaoFinal >= 6) {
                    System.out.println("Com a nota " + notaA4 +
                            " da recuperação, o aluno está APROVADO");
                } else {
                    System.out.println("Com a nota " + notaA4 +
                            " da recuperação, o aluno está REPROVADO");
                }
            }
        }

        scanner.close();


    }
}


