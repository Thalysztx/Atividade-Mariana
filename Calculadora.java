import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite a operação aritmética (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        scanner.close();

        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case '-':
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case '*':
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case '/':
                if (numero2 != 0) {
                    System.out.println("Resultado: " + ((double) numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}