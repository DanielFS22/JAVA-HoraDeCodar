/*
6 - Qual o maior?
Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos lá, Queremos 3 números. Digite o primeiro número: ");
        double PrimeiroNum = scanner.nextDouble();

        System.out.println("Digite o segunto número: ");
        double SegundoNum = scanner.nextDouble();

        System.out.println("Digite o último número: ");
        double TerceiroNumero = scanner.nextDouble();

        if (PrimeiroNum > SegundoNum || PrimeiroNum > TerceiroNumero) {
            System.out.println("O numero " + PrimeiroNum + " é o maior numero entre os numero informados (" + PrimeiroNum + ", " + SegundoNum + ", " + TerceiroNumero + ")." );
        } else if (SegundoNum > PrimeiroNum || SegundoNum > TerceiroNumero) {
            System.out.println("O numero " + SegundoNum + " é o maior numero entre os numero informados (" + PrimeiroNum + ", " + SegundoNum + ", " + TerceiroNumero + ")." );
        } else {
            System.out.println("O numero " + TerceiroNumero + " é o maior numero entre os numero informados (" + PrimeiroNum + ", " + SegundoNum + ", " + TerceiroNumero + ")." );
        }

        scanner.close();
    }
}
