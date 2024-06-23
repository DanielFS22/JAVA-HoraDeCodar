/*
16. O Voto é secreto
Escreva um programa para ler:
o número total de eleitores de um município.
Agora o programa deve receber a quantindade (percentual):
o número de votos brancos;
o número de votos válidos;
o número de votos nulos.
Por fim, o programa vai calcular e escrever a quantidade de votos que cada categoria (brancos, nulos e válidos) representa em relação ao total
de eleitores.
 */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Leitura do número total de eleitores
        System.out.println("Digite o total de números de eleitores do município: ");
        int totalEleitores = scanner.nextInt();

        // Leitura das porcentagens de votos
        System.out.println("Digite a porcentagem de votos em branco: ");
        double percentualBrancos = scanner.nextDouble();

        System.out.println("Digite a porcentagem de votos válidos: ");
        double percentualValidos = scanner.nextDouble();

        System.out.println("Digite a porcentagem de votos nulos ");
        double percentualNulo = scanner.nextDouble();

        // Cálculo das quantidades de votos

        int votosBrancos = (int) ((percentualBrancos / 100) * totalEleitores);
        int votosValidos = (int) ((percentualValidos / 100) * totalEleitores);
        int votosNulos = (int) ((percentualNulo / 100) * totalEleitores);

        // Exibição dos resultados
        System.out.println("Quantidade de votos em Branco: " + votosBrancos);
        System.out.println("Quantidade de votos Validos: " + votosValidos);
        System.out.println("Quantidade de votos Nulos: " + votosNulos);

        scanner.close();
    }
}
