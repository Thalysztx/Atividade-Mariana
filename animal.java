class animal{
    private String nome;
    private String especie;
    private int idade;
    //construtor
    public animal(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
    //getter

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int IdadeNova) {
        this.idade = IdadeNova;
    }
    public void Informacoes(){
        System.out.println("nome: " + nome);
        System.out.println("Especie: " + especie);
        System.out.println("Idade" + idade);
    }
}