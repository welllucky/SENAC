package Personagens;

import Elementos.Arma;
import Elementos.Magia;
import java.util.List;
import java.util.ArrayList;

public abstract class Personagem {
    private static int id;
    private int força;
    private int defesa;
    private String raça;
    private int vida;
    private String nome;
    private Magia magia;
    private Arma arma;
    private List aliados = new ArrayList();

    public Personagem(String nome){
        id++;
        this.nome = nome;
    };

    protected boolean perderVida(int dano){
        if (dano < this.vida){
        this.vida =- dano;
        return true;
        }
        return false;
    }

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

    public void setDefesa(int defesa){
        this.defesa = defesa;
    }

    public int getDefesa(){
        return defesa;
    }

    public static int getId() {
        return id;
    }

    public Magia getMagia() {
        return magia;
    }

    public void setMagia(Magia magia){
        this.magia = magia;
    }

    public void setArma(Arma arma){
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public List getAliados(){
        return aliados;
    }

    public boolean setAliado(Personagem personagem){
        aliados.add(personagem);
        return true;
    }


}
