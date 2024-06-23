
/*3 - A Bit of Information
Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário.
Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".
*/
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        // Criar uma instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        // Ler o nome do Usuário.
        System.out.println("Por favor, digite o seu nome: ");
        String nomeUsuario = scanner.nextLine();

        System.out.println("Por favor, digite a sua idade");
        String idadeUsuario = scanner.nextLine();

        // Exibir a mensagem personalizada
        System.out.println("Seu nome é " + nomeUsuario + " e você tem " + idadeUsuario + " anos de idade.");

        scanner.close();
    }
}
