package Elementos;
import Elementos.Artefato;

public class Magia extends Artefato {
    private static int id;

    Magia(){
        id++;
    }

    public Magia(String nome){
        id++;
        this.setNome(nome);
    }
}
