public class Personagem {
    private static int id;
    private int força;
    private String raça;
    private int vida;
    private String nome;
    private Magia magia = new Magia();
    private Arma arma = new Arma();

    Personagem(String nome){
        id++;
        this.nome = nome;
    };

    public String getNome() {
        return nome;
    }

    public void rename(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getForça() {
        return força;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public static int getId() {
        return id;
    }

    public Magia magia() {
        return magia;
    }

    public Arma arma() {
        return arma;
    }
    
}
