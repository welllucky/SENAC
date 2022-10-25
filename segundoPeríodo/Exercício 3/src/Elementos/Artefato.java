package Elementos;

public abstract class Artefato {
    private static int id;
    private String nome;
    private String poder;
    private int dano;
    private int defesa;

    public static int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setDano(int dano){ this.dano = dano; }

    public int getDano(){ return this.dano; }

    public int getDefesa(){ return this.defesa; }

    public void setDefesa(int defesa) { this.defesa = defesa; }

}
