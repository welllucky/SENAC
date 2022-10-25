package Elementos;

import Elementos.Artefato;

public class Arma extends Artefato {
    private static int id;

    public Arma(){
        id++;
    }

    public Arma(String nome){
        id++;
        this.setNome(nome);
    }
}

