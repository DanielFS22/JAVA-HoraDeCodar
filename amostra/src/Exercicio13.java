/*
13 - De quanto até quanto?
Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os
 números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário dois números inteiros
        System.out.print("Informe o primeiro número (menor): ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Informe o segundo número (maior): ");
        int segundoNumero = scanner.nextInt();

        int soma = 0;
        int contador = 0;

        // Calcula a soma de todos os números entre primeiroNumero e segundoNumero, inclusive eles
        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            soma += i;
            contador++;
        }

        // Calcula a média aritmética
        double media = (double) soma / contador;

        // Exibe a média aritmética
        System.out.println("A média aritmética dos números entre " + primeiroNumero + " e " + segundoNumero + " (inclusive) é: " + media);

        // Fecha o Scanner
        scanner.close();
    }
}
