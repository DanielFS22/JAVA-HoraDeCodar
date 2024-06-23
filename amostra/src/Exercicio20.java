/*
20. CPF na nota?
Faça um programa para ler:
O nome do produto,
A quantidade adquirida do produto,
O preço unitário do produto.
Agora o programa deve calcular e escrever:
O valor da venda (valor da venda = quantidade adquirida * preço unitário),
O percentual de desconto,
O valor fixo de imposto que é 20%.
O total a pagar (total a pagar = valor da venda - desconto).
Sabendo-se que:
Se quantidade <= 5 o desconto será de 2%
 -
Se quantidade > 5 e quantidade <=10 o desconto será de 3%
 -
Se quantidade > 10 o desconto será de 5%
No fim, escreva um recibo que detalhe a compra como uma nota fiscal.
 */

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do nome do produto
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        // Leitura da quantidade adquirida
        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        // Leitura do preço unitário
        System.out.print("Digite o preço unitário do produto: R$ ");
        double precoUnitario = scanner.nextDouble();

        // Cálculo do valor da venda
        double valorVenda = quantidade * precoUnitario;

        // Determinação do percentual de desconto
        double percentualDesconto;
        if (quantidade <= 5) {
            percentualDesconto = 0.02;
        } else if (quantidade <= 10) {
            percentualDesconto = 0.03;
        } else {
            percentualDesconto = 0.05;
        }

        // Cálculo do valor do desconto
        double valorDesconto = valorVenda * percentualDesconto;

        // Cálculo do valor fixo de imposto (20%)
        double valorImposto = valorVenda * 0.20;

        // Cálculo do total a pagar
        double totalPagar = valorVenda - valorDesconto + valorImposto;

        // Impressão do recibo
        System.out.println("\n--- Recibo de Compra ---");
        System.out.printf("Produto: %s%n", nomeProduto);
        System.out.printf("Quantidade: %d%n", quantidade);
        System.out.printf("Preço unitário: R$ %.2f%n", precoUnitario);
        System.out.printf("Valor da venda: R$ %.2f%n", valorVenda);
        System.out.printf("Percentual de desconto: %.0f%%%n", percentualDesconto * 100);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor do imposto (20%%): R$ %.2f%n", valorImposto);
        System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);
        System.out.println("------------------------");

        // Fechar o scanner
        scanner.close();
    }
}
