
// 2 -  Hello Clarice
//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
import java.util.Scanner; //importando a classe Scanner

public class Exercicio2 {
    public static void main(String[] args){

        // Criar uma instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        // Ler o nome do Usuário.
        System.out.println("Por favor, digite o seu nome: ");
        String nomeusuario = scanner.nextLine();

        // Exibir a mensagem personalizada
        System.out.println("Olá, " + nomeusuario);

        //Sempre fechar Scanner
        scanner.close();
    }
}

