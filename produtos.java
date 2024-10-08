public class produtos {
    private String nome;
    private int OqueTemNoEstoque;
    //construtor
    public produtos(String nome, int OqueTemNoEstoque){
        this.nome = nome;
        if (OqueTemNoEstoque >= 0){
            this.OqueTemNoEstoque = OqueTemNoEstoque;
        } else {
            this.OqueTemNoEstoque = 0;
        }
    }
   public String getNome(){
        return nome;
    }

    public int getOqueTemNoEstoque() {
        return OqueTemNoEstoque;
    }
    public void colocarEstoque(int oqueTemNoEstoque){
        if (oqueTemNoEstoque > 0 ){
            this.OqueTemNoEstoque += oqueTemNoEstoque;
        }else{
            System.out.println("Não dá pra adicionar zero");
        }
    }
    public void remover(int oqueTemNoEstoque){
        if (oqueTemNoEstoque > 0 && this.OqueTemNoEstoque >= oqueTemNoEstoque){
            this.OqueTemNoEstoque -= oqueTemNoEstoque;
        }else {
            System.out.println("remover zero é loucura slk");
        }
    }
    public void  Informacoes(){
        System.out.println("nome do produto: " + nome);
        System.out.println("Quantidade no estoque: " + OqueTemNoEstoque);
    }
}
