/*
10 - Parabéns
Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e
escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se
o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
 */

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];
        double soma = 0;

        // Ler as 4 notas do aluno
        for (int i = 0; i < 4; i++) {
            System.out.print("Informe a nota da avaliação " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Calcular a média do semestre
        double media = soma / 4;

        // Exibir a média do semestre
        System.out.println("Média do semestre: " + media);

        // Verificar se o aluno foi aprovado e exibir a mensagem
        if (media >= 6.0) {
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else if (media == 5){
            System.out.println("Você foi aprovado.");
        } else {
            System.out.println("Você foi reprovado. Espero que se esforce mais ano que vem!");
        }

        // Fechar o Scanner
        scanner.close();
    }
}