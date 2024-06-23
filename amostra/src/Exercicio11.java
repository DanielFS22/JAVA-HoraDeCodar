/*
11 - BOOOOMMM
Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0.
Escreva a contagem em tela e no final da repetição escreva "EXPLOSÃO".
 */

public class Exercicio11 {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pausa a execução por 1000 milissegundos (1 segundo)
            } catch (InterruptedException e) {
                System.err.println("A contagem foi interrompida!");
            }
        }
        System.out.println("EXPLOSÃO");
    }
}
