package Personagens;

import java.util.ArrayList;

public interface Jogável {
    // Atacar, defender, recuperar, comunicar, aliar

    boolean atacar(Personagem inimigo);

    boolean recuperar(int pontosRecuperação);

    boolean falar(Personagem personagem, String mensagem);

    boolean aliar(Personagem personagem);

    boolean desfazerAliança(Personagem aliado);
}
