/*
9 -  Cansar de Digitar
Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados
e escreva a média aritmética desses valores lidos.
 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar os 10 valores informados pelo usuário
        double[] valores = new double[10];
        double soma = 0;

        // Ler os 10 valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            soma += valores[i];
        }

        // Calcular a média aritmética
        double media = soma / 10;

        // Exibir os valores informados
        System.out.println("Valores informados:");
        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        // Exibir a média aritmética
        System.out.println("\nMédia aritmética dos valores informados: " + media);

        // Fechar o Scanner
        scanner.close();
    }
}