import java.util.Scanner;

public class Exercicio7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os cinco valores ao usuário
        System.out.println("Digite 5 valores. Primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        System.out.println("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();

        System.out.println("Digite o quinto valor: ");
        double valor5 = scanner.nextDouble();

        // Inicializar as variáveis para os dois maiores valores
        double maior1, maior2;

        // Encontrar o maior e o segundo maior valor
        if (valor1 > valor2) {
            maior1 = valor1;
            maior2 = valor2;
        } else {
            maior1 = valor2;
            maior2 = valor1;
        }

        if (valor3 > maior1) {
            maior2 = maior1;
            maior1 = valor3;
        } else if (valor3 > maior2) {
            maior2 = valor3;
        }

        if (valor4 > maior1) {
            maior2 = maior1;
            maior1 = valor4;
        } else if (valor4 > maior2) {
            maior2 = valor4;
        }

        if (valor5 > maior1) {
            maior2 = maior1;
            maior1 = valor5;
        } else if (valor5 > maior2) {
            maior2 = valor5;
        }

        // Calcular a soma dos dois maiores valores
        double somaDosMaiores = maior1 + maior2;

        // Exibir o resultado
        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

        // Fechar o Scanner
        scanner.close();
    }
}
