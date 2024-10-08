public class MainProdutos {
    public static void main(String[] args){
        produtos produtos1 = new produtos("Ipad", 20);
        produtos produtos2 = new produtos("notebook", 10);

        System.out.println("\nInformaçoes iniciais do produto 1: ");
        produtos1.Informacoes();

        System.out.println("\nInformaçoes iniciais do produto 2: ");
        produtos2.Informacoes();
        //colocar e tirar do Estoque laele
        produtos1.colocarEstoque(2);

        produtos2.remover(2);

        System.out.println("\nInformaçoes novas do produto1: ");
        produtos1.Informacoes();

        System.out.println("\nInformaçoes novas do produto2: ");
        produtos2.Informacoes();
    }
}