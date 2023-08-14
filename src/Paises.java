public class Paises {
    private String nome;
    private int populacao;

    public Paises(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    void setNome(String nome){
        this.nome =nome;
    }
    String getNome(){
        return (nome);
    }
    void setNome(int populacao){
        this.populacao= populacao;
    }
    int getPopulacao(){
        return (populacao);
    }
}
