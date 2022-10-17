public class Rua extends Lugar{
    private int id;
    private String nome;
    private String clima;

    Rua(){
        id++;
        this.nome = "Desconhecido";
        this.setEndereço("Desconhecido");
        this.clima = "céu aberto";
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getClima() {
        return clima;
    }
    public void mudarClima(String clima) {
        this.clima = clima;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

   


}
