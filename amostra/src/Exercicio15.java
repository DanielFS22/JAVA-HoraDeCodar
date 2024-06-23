/*
15 - Uma Brincadeira Sobre Alturas
Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.

Construa um programa que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.
 */

public class Exercicio15 {
        public static void main(String[] args) {
            // Alturas iniciais em metros
            double alturaAnacleto = 1.50;
            double alturaFelisberto = 1.10;

            // Crescimento anual em metros
            double crescimentoAnacleto = 0.02;
            double crescimentoFelisberto = 0.03;

            // Inicializa o contador de anos
            int anos = 0;

            // Enquanto Felisberto não for maior que Anacleto
            while (alturaFelisberto <= alturaAnacleto) {
                // Incrementa a altura de cada um
                alturaAnacleto += crescimentoAnacleto;
                alturaFelisberto += crescimentoFelisberto;

                // Incrementa o contador de anos
                anos++;
            }

            // Imprime o número de anos necessários
            System.out.println("Serão necessários " + anos + " anos para que Felisberto seja maior que Anacleto.");
        }
}
