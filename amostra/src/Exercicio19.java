/*
19. É o quê?
Crie um programa para ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e
escrever se formam ou não um triângulo.

Obs: para formar um triângulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
 */

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        // Leitura dos lados do triângulo
        System.out.println("Digite o valor de A: ");
        double ladoA = scanner.nextDouble();

        System.out.println("Digite o valor de B :");
        double ladoB = scanner.nextDouble();

        System.out.println("Digite o valor de C: ");
        double ladoC = scanner.nextDouble();

        // Verificação se os lados formam um triângulo
        if (formaTriangulo(ladoA, ladoB, ladoC)) {
            System.out.println("Os valores formam um triangulo.");
        } else {
            System.out.println("Os valores informados não formam um triangulo.");
        }

        scanner.close();
    }

    public static boolean formaTriangulo(double a, double b, double c){
        return (a < b + c ) && (b < a + c) && (c < a +b);
    }

}
