/*
4 - A Bit of Geometry
Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas
respectivas áreas. O usuário irá informar os valores de cada variável. Crie um arquivo para cada fórmula e poste os
arquivos no GitHub. Link do repositório abaixo
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Retângulo
        System.out.print("Informe a largura do retângulo: ");
        double larguraRetangulo = scanner.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        double alturaRetangulo = scanner.nextDouble();
        System.out.println("A area do Retângulo: " + calcularAreaRetangulo(alturaRetangulo, larguraRetangulo));

        // Quadrado
        System.out.print("informe o lado do Quadrado");
        double ladoQuadrado = scanner.nextDouble();
        System.out.println("Area do Quadrado: " + calcularAreaQuadrado(ladoQuadrado));

        // Losango
        System.out.print("Informe a diagonal maior do losango: ");
        double diagonalMaiorLosango = scanner.nextDouble();
        System.out.print("Informe a diagonal menor do losango: ");
        double diagonalMenorLosango = scanner.nextDouble();
        System.out.println("Área do losango: " + calcularAreaLosango(diagonalMaiorLosango, diagonalMenorLosango));

        // Trapézio
        System.out.print("Informe a base maior do trapézio: ");
        double baseMaiorTrapezio = scanner.nextDouble();
        System.out.print("Informe a base menor do trapézio: ");
        double baseMenorTrapezio = scanner.nextDouble();
        System.out.print("Informe a altura do trapézio: ");
        double alturaTrapezio = scanner.nextDouble();
        System.out.println("Área do trapézio: " + calcularAreaTrapezio(baseMaiorTrapezio, baseMenorTrapezio, alturaTrapezio));

        // Paralelogramo
        System.out.print("Informe a base do paralelogramo: ");
        double baseParalelogramo = scanner.nextDouble();
        System.out.print("Informe a altura do paralelogramo: ");
        double alturaParalelogramo = scanner.nextDouble();
        System.out.println("Área do paralelogramo: " + calcularAreaParalelogramo(baseParalelogramo, alturaParalelogramo));

        // Triângulo
        System.out.print("Informe a base do triângulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Informe a altura do triângulo: ");
        double alturaTriangulo = scanner.nextDouble();
        System.out.println("Área do triângulo: " + calcularAreaTriangulo(baseTriangulo, alturaTriangulo));

        // Círculo
        System.out.print("Informe o raio do círculo: ");
        double raioCirculo = scanner.nextDouble();
        System.out.println("Área do círculo: " + calcularAreaCirculo(raioCirculo));

        scanner.close();

    }

    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }
    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public static double calcularAreaLosango(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }

    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) / 2) * altura;
    }

    public static double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
    }
