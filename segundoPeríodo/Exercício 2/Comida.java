public class Comida {
    private static int id;
    private String nome;
    private int quantidade;
    private String situação;

    Comida(String nome, int quantidade){
        id++;
        this.nome = nome;
        this.quantidade = quantidade;
        this.situação = "Ok";
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void renomear(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public String getSituação() {
        return situação;
    }
    public void setSituação(String situação) {
        this.situação = situação;
    }
    public void estragar(){
        this.situação = "ruim";
    }
    public void diminuirQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }
}
