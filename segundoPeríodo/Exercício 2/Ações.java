public class Ações {
    private static int id;
    Ações(){
        id ++;
    }

    void comer(Comida comida){   // adicionar ações relacionadas com comida e com o gato
        gato.setSituacao("Comendo");
        System.out.println("Funcionou");
    }

    void dormir(Lugar lugar){    
        gato.setSituacao("Dormindo");
        System.out.printf("%s está dormindo!");
    }

    void miar(){
        System.out.println("Miau!");
    }

    void brigar(Gato adversário){
        if (this.getLugarAtual() == adversário.getLugarAtual()){
             this.setSituacao("Brigando");
             System.out.printf("%s bateu em %s e %s perdeu 1 vida, ficando somente com %i\n", this.getNome(), adversário.getNome(), adversário.getNome(), adversário.getSaude().getVida());
             this.getSaude().perderVida();
        } else {
            System.out.printf("%s está muito longe de %s, assim não consegue brigar.\n", this.getNome(), adversário.getNome());
        }
    }

    void necessidades(int tipo, Lugar lugar){
        if (tipo == 1){
            gato.setSituacao("Fazendo xixi");
            System.out.printf("%s está fazendo xixi na(o) %s\n", this.gato.getNome(), this.gato.getLugarAtual());
        } else if (tipo == 0){
            gato.setSituacao("Fazendo cocô");
            System.out.printf("%s está fazendo cocô", this.gato.getNome());
        }
    }

    void andar(Lugar destino){
        gato.setSituacao("Andando");
        System.out.printf("%s está indo até %s", this.gato.getNome(), destino);
    }

    void seLimpar(){
        gato.setSituacao("Se Limpando");
        System.out.printf("%s está se limpando!", this.gato.getNome());
    }

    void parado(){
        gato.setSituacao("Parado");
        System.out.printf("%s está parado", this.gato.getNome());
    }


}