public class Main {
    public static void main(String[] args){
        animal animal = new animal("leão", "felino", 5);
        System.out.println("informaçoes iniciais: ");
        animal.Informacoes();
        animal.setIdade(7);
        System.out.println("\nInformações Novas: ");
        animal.Informacoes();
    }
}
