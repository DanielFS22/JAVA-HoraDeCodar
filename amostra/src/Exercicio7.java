import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar os três valores ao usuário
        System.out.println("Digite 3 valores. Primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double segundoValor = scanner.nextDouble();

        System.out.println("Digite o terceiro valor: ");
        double terceiroValor = scanner.nextDouble();

        // Encontrar os dois maiores valores
        double maior1, maior2;

        if (primeiroValor > segundoValor && primeiroValor > terceiroValor) {
            maior1 = primeiroValor;
            maior2 = Math.max(segundoValor, terceiroValor);
        } else if (segundoValor > primeiroValor && segundoValor > terceiroValor) {
            maior1 = segundoValor;
            maior2 = Math.max(primeiroValor, terceiroValor);
        } else {
            maior1 = terceiroValor;
            maior2 = Math.max(primeiroValor, segundoValor);
        }

        // Calcular a soma dos dois maiores valores
        double somaDosMaiores = maior1 + maior2;

        // Exibir o resultado
        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

        scanner.close();
    }
}
