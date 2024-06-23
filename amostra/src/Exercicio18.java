/*
18. A pagar
Desenvolva um programa para uma revendedora de carros usados que calcula o salário final de seus funcionários vendedores.
O algoritmo deve receber como entrada o número de carros vendidos, o valor total das vendas, o salário fixo mensal do
vendedor e a comissão fixa por carro vendido.

O salário final do vendedor é calculado somando o salário fixo mensal, a comissão fixa por carro vendido e 5% do
valor total das vendas realizadas pelo vendedor.


Considere que o salário inicial é de R$ 5.000,00.
O Programa deve exibir e detalhar cada venda, a comissão e o percentual e exibir o valor final.
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double salarioFixo = 5000.00;

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite a comissão fixa por carro vendido: ");
        double comissãoPorCarroVendido = scanner.nextDouble();

        double comissaoTotal =  carrosVendidos * comissãoPorCarroVendido;
        double percentualVendas = 0.05 * valorTotalVendas;

        double SalarioFinal = salarioFixo + comissaoTotal + percentualVendas;

        System.out.println("Detalhamento das Vendas e do Salário:");
        System.out.printf("Salário fixo mensal: R$ %.2f%n", salarioFixo);
        System.out.printf("Comissão fixa por carro vendido: R$ %.2f%n", comissãoPorCarroVendido);
        System.out.printf("Número de carros vendidos: %d%n", carrosVendidos);
        System.out.printf("Comissão total: R$ %.2f%n", comissaoTotal);
        System.out.printf("Percentual sobre o valor total das vendas (5%%): R$ %.2f%n", percentualVendas);
        System.out.printf("Salário final do vendedor: R$ %.2f%n", SalarioFinal);


        scanner.close();
    }

}
