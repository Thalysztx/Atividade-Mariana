import java.util.ArrayList;
import java.util.Scanner;

public class numeroEspecifico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;
        //10 numeros int
        System.out.println("Digite 10 numeros INTEIROS: ");
        for (int i = 0; i < 10; i++){
            numeros[i] = scanner.nextInt();
        }
        //num especifico pra contar
        System.out.println("Valor especifico pra contar: ");
        int numeroEspecificos = scanner.nextInt();
        for (int i = 0; i < 10; i++){
            if (numeros[i] == numeroEspecificos){
                contador++;
            }
        }
        //resultado
        System.out.println("o numero " + numeroEspecificos + " aparece " + contador + " vezes ");
        scanner.close();
    }
}