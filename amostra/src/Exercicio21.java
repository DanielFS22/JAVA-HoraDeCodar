/*
21. Descanso merecido
 Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para estar em condições, um
 dos seguintes requisitos deve ser satisfeito:

 - Ter no mínimo 65 anos de idade.
 - Ter trabalhado no mínimo 30 anos.
 - Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano de seu
nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do
empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.
 */

import java.util.Scanner;
public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados do empregado
        System.out.print("Digite o código do empregado: ");
        int codigoEmpregado = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso do empregado na empresa: ");
        int anoIngresso = scanner.nextInt();

        // Ano atual
        int anoAtual = java.time.Year.now().getValue();

        // Cálculo da idade e do tempo de trabalho
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        // Verificação dos critérios de aposentadoria
        boolean requerAposentadoria = (idade >= 65) ||
                (tempoTrabalho >= 30) ||
                (idade >= 60 && tempoTrabalho >= 25);

        // Impressão dos resultados
        System.out.println("\n--- Dados do Empregado ---");
        System.out.printf("Código do Empregado: %d%n", codigoEmpregado);
        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Tempo de Trabalho: %d anos%n", tempoTrabalho);

        if (requerAposentadoria) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer aposentadoria");
        }

        // Fechar o scanner
        scanner.close();
    }
}
