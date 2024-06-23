/*
8 - Enquanto isso
Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser
lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa
 deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preciso que você digite dois valores. Primeiro valor: ");
        double valor1 = scanner.nextDouble();

        double valor2;
        while (true) {
            System.out.print("Digite o segundo valor: ");
            valor2 = scanner.nextDouble();

            if (valor2 > 0) {
                break;
            } else {
                System.out.print("Digite outro valor (o valor não pode ser negativou ou igual a 0).");
            }

        }
        double resultado = valor1 / valor2;

        System.out.println("O resultado da divisão entre os dois numeros é de: " + resultado);

        scanner.close();
    }
}
