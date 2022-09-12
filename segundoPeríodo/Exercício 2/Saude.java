public class Saude {
    private static int id;
    private Gato gato;
    private int vida;
    private String doença; //transformar em lista

    Saude(){
        id ++;
        this.vida = 7;
    }

    public int getId() {
        return id;
    }

    public int getVida() {
        return vida;
    }

    public void recuperar(int quantidade) { 
        if (quantidade == 0){
            this.vida += quantidade;
            if (this.vida > 7){
                this.vida = 7;
            }
        } else{
            this.vida++;
        }
    }

    public void perderVida() { 
        this.vida--;
        if (this.vida <= 0){
            morrer();
        } else{
            this.vida--;
        }
    }

    public void morrer(){
        this.vida = 0;
        System.out.printf("O %s morreu", gato.getNome());
    }

    public String getDoença() {
        return doença;
    }

    public void setDoença(String doença) {
        this.doença = doença;
    }

    

    
}