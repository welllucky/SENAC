package Personagens;

public class Mago extends Personagem implements Jogável{
    // ++ Guerreiro -- Demônio
    public Mago(String nome) {
        super(nome);
        this.setRaça("Mago");
    }
    @Override
    public boolean atacar(Personagem inimigo) {
        int ataqueTotalThis = (this.getForça() + this.getArma().getDano() + this.getMagia().getDano()) - (inimigo.getDefesa() + inimigo.getArma().getDefesa() + inimigo.getMagia().getDefesa()) ;
        int ataqueTotalInimigo = (inimigo.getForça() + inimigo.getArma().getDano() + inimigo.getMagia().getDano()) - (this.getDefesa() + this.getArma().getDefesa() + this.getMagia().getDefesa());
        int diferençaAtaque = ataqueTotalThis - ataqueTotalInimigo;
        if (diferençaAtaque < 0){
            diferençaAtaque *= -1;
        }

        if (ataqueTotalThis > ataqueTotalInimigo){
            inimigo.perderVida(ataqueTotalThis);
            return true;
        }
        else if ( diferençaAtaque > 30){
            this.perderVida(ataqueTotalInimigo);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean recuperar(int pontosRecuperação) {
        this.setVida(this.getVida() + pontosRecuperação);
        return true;
    }

    @Override
    public boolean falar(Personagem personagem, String mensagem) {
        System.out.printf("{%s} falou para {%s}: {%s} ", this.getNome(), personagem.getNome(), mensagem);
        return true;
    }

    @Override
    public boolean aliar(Personagem personagem) {
        if (this.getRaça() == personagem.getRaça()){
            setAliado(personagem);
            return true;
        }
        return false;
    }

    @Override
    public boolean desfazerAliança(Personagem aliado) {
        for (int i = 0; i < this.getAliados().size(); i++){
            if (this.getAliados().get(i) == aliado){
                getAliados().remove(i);
                return true;
            }
        }
        return false;
    }
}
