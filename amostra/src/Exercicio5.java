/*
5 - 1, 2 e 3
Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou neutro.
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Criar uma instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //solicitar um valor ao Usuario
        System.out.println("Digite um número: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("O número " + valor + " é positivo.");
        } else if (valor < 0) {
            System.out.println("O número " + valor + " é negativo.");
        } else {
            System.out.println("O número " + valor + " é neutro.");
        }

        scanner.close();

        }

}
