/*
17. Custa quanto?
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
e dos impostos (aplicados ao custo de fábrica).

Supondo que o percentual do distribuidor seja de 28% e os impostos de 45% sobre o valor da fábrica, escreva um
programa para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura do custo de fábrica do carro
        System.out.println("Digite o custo da fabricação do carro: ");
        double custoFabrica = scanner.nextDouble();

        // Percentuais do distribuidor e dos impostos
        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;

        // Cálculo do custo do distribuidor e dos impostos

        double custoDistribuidor = custoFabrica * percentualDistribuidor;
        double custoImposto = custoFabrica * percentualImpostos;

        // Cálculo do custo final ao consumidor
        double custoFinal = custoFabrica + custoDistribuidor + custoImposto;

        // Exibição do resultado
        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}
