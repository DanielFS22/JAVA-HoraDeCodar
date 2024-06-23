import java.util.Scanner;

public class Exercicio6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos lá, Queremos 4 números. Digite o primeiro número: ");
        double primeiroNum = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double segundoNum = scanner.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double terceiroNum = scanner.nextDouble();

        System.out.println("Digite o quarto número: ");
        double quartoNum = scanner.nextDouble();

        double maiorNumero = primeiroNum; // Inicializa com o primeiro número

        if (segundoNum > maiorNumero) {
            maiorNumero = segundoNum;
        }
        if (terceiroNum > maiorNumero) {
            maiorNumero = terceiroNum;
        }
        if (quartoNum > maiorNumero) {
            maiorNumero = quartoNum;
        }

        System.out.println("O maior número entre os números informados (" + primeiroNum + ", " + segundoNum + ", " + terceiroNum + ", " + quartoNum + ") é: " + maiorNumero);

        scanner.close();
    }
}
