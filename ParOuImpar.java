import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();
        if (numero % 2 == 0) {
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
    }
}
