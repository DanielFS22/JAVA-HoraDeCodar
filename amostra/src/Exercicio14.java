/*
14 - Passou no Teste?
Escreva um programa para ler 6 notas de um aluno, calcular e imprimir a média final. Considere que a nota de
aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta.
Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a
quantidade de alunos aprovados.
 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprovados = 0;

        while (true) {
            double soma = 0;
            for (int i = 1; i <=6; i++){
                System.out.println("Digite a nota" + i + ": ");
                double nota = scanner.nextDouble();
                soma += nota;
            }
            double media = soma / 6;
            System.out.println("Média final: " + media);

            if (media > 6.5) {
                System.out.println("Parabéns, você foi aprovado!");
                aprovados++;
            } else {
                System.out.println("Infelizmente, você não foi aprovado.");
            }
            System.out.println("Deseja calcular a média de outro aluno? (S/N: ");
            char resposta = scanner.next().charAt(0);
            if (resposta!= 'S' && resposta != 's') {
                break;
            }

            System.out.println("Quantidade de alunos aprovados: " + aprovados);
            scanner.close();
        }
    }
}
