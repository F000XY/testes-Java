import java.util.Scanner;
public class Exercicio2 {

    public static boolean verificar(int numero) {
        int primeiroN = 0;
        int segundoN = 1;

        while (primeiroN <= numero) {
            if (primeiroN == numero) {
                return true;
            }
            int proximo = primeiroN + segundoN;
            primeiroN = segundoN;
            segundoN = proximo;
        }
        return false;
    }
    public static void saida() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (verificar(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

    }

     public static void menu() {
        Scanner scanner2 = new Scanner(System.in);
        while (true) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1- Calculo de Fibonacci");
            System.out.println("2- Sair");
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            int escolha = scanner2.nextInt();

            switch (escolha) {
                case 1:
                    saida();
                    break;
                case 2:
                    System.out.println("Saindo...");
                    scanner2.close();
                    return; // Sai do loop e do programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        menu();
    }
  }


