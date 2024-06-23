/*
25. Invertendo tudo
Escreva um programa que para ler doze números informados pelo usuário e que serão armazenados em um vetor/array.

No fim o programa deve dar duas saídas:
1) o programa deve processar os dados invertendo a posição dos elementos trocando o primeiro elemento com o último,
o segundo com penúltimo etc.

2) o programa deve processar os dados invertendo a posição dos elementos trocando, mas separando os dados por tipo.

Exemplo:
Usuário informa: A, 1, B, 2, C, 3 D, 4, E, 5, F, 6
Saída 1:  6, F, 5, E, 4, D, 3, 2, B, 1
Saída 2:  6, 5, 4, 3, 2, 1 - F, E, D, C, A, B
 */

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elementos = new String[12];

        // Leitura dos 12 elementos informados pelo usuário
        System.out.println("Informe 12 elementos (letras e números):");
        for (int i = 0; i < 12; i++) {
            elementos[i] = scanner.next();
        }

        // Primeira saída: Inversão simples do array
        System.out.print("Saída 1: ");
        for (int i = 11; i >= 0; i--) {
            System.out.print(elementos[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Separar elementos em letras e números
        String[] letras = new String[12];
        String[] numeros = new String[12];
        int letrasCount = 0;
        int numerosCount = 0;

        for (String elemento : elementos) {
            if (Character.isLetter(elemento.charAt(0))) {
                letras[letrasCount++] = elemento;
            } else if (Character.isDigit(elemento.charAt(0))) {
                numeros[numerosCount++] = elemento;
            }
        }

        // Segunda saída: Inversão separada por tipo
        System.out.print("Saída 2: ");
        // Invertendo e imprimindo os números
        for (int i = numerosCount - 1; i >= 0; i--) {
            System.out.print(numeros[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.print(" - ");
        // Invertendo e imprimindo as letras
        for (int i = letrasCount - 1; i >= 0; i--) {
            System.out.print(letras[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        scanner.close();
    }
}
