import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        //10 num
        System.out.println("10 numm inteiro: ");
        for(int i =0; i < 10; i++){
            numeros[i] = scanner.nextInt();
        }
        //variavel menor maior
        int maior = numeros[0];
        int menor = numeros[0];
        //loop maior menor
        for (int i = 1; i < 10; i++ ){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }
        //resultado maior menor
        System.out.println("o maior valor é: "+ maior);
        System.out.println("o menor valor é: "+ menor);
        scanner.close();
    }
}
