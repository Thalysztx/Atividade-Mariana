import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //peso e altura
        System.out.println("digite um peso em KG: ");
        double peso = scanner.nextDouble();
        System.out.println("digite um altura em Metros: ");
        double altura = scanner.nextDouble();
        //calculo em imc
        double imc = peso / (altura * altura);

        //calculo aparecendo
        System.out.printf("Seu IMC %.2f\n é: ", imc);

        //classificaçao IMC
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("peso normal");
        } else if (imc >= 30.0){
            System.out.println("Obsidade");
        }
        scanner.close();

    }
}
