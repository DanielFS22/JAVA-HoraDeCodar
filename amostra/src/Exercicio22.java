/*
22. Conta comigo
 Escreva um algoritmo que imprima as seguintes seqüências de números:

(1, 1 2 3 4 5 6 7 8 9 10)
(2, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
(3, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)

E assim sucessivamente, até que o primeiro número (antes da vírgula), também chegue a 20.
 */

public class Exercicio22 {
    public static void main(String[] args) {
        int startNumber = 1; // número inicial
        int numbersPerLine = 10; // quantidade de números por linha

        // Loop para gerar 20 linhas
        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");

            // Loop para imprimir 10 números consecutivos
            for (int j = 0; j < numbersPerLine; j++) {
                System.out.print(startNumber);
                if (j < numbersPerLine - 1) {
                    System.out.print(", ");
                }
                startNumber++;
            }

            System.out.println(")");
        }
    }
}

