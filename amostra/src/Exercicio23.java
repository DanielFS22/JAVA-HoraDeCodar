/*
23. Não Conta comigo
 Escreva um algoritmo que imprima as seguintes seqüências de números:

(1, 1 2 3 4 5 6 7 8 9 10)
(2, 1 2 3 4 5 6 7 8 9 10)
(3, 1 2 3 4 5 6 7 8 9 10)

E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20.
 */


public class Exercicio23 {
    public static void main(String[] args) {
        int numbersPerLine = 10; // quantidade de números por linha

        // Loop para gerar 20 linhas
        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");

            // Loop para imprimir 10 números de 1 a 10
            for (int j = 1; j <= numbersPerLine; j++) {
                System.out.print(j);
                if (j < numbersPerLine) {
                    System.out.print(" ");
                }
            }

            System.out.println(")");
        }
    }
}
