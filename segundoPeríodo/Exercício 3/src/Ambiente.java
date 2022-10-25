import Elementos.Arma;
import Elementos.Magia;
import Personagens.Demônio;
import Personagens.Guerreiro;
import Personagens.Mago;
import Personagens.Personagem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Ambiente {
    Ambiente() {
        System.out.println("Evento 1 - Ambiente criado com sucesso!");
        registrar("Ambiente criado com sucesso!");
    }

    private int pointer = 0;
    private static int quantEventos = 0;

    Scanner input = new Scanner(System.in);
    Random geradorN = new Random();

    List catalogoPersonagem = new ArrayList<Personagem>();
    List catalogoMagia = new ArrayList<Magia>();
    List catalogoArma = new ArrayList<Arma>();
    List eventos = new ArrayList<>();

    public void criar(int elemento, int typePerson) {
        switch (elemento) {
            case 1:
                System.out.print("Digite o nome do personagem: ");
                String nPersonagem = input.nextLine();
                if (typePerson == 1) {
                    catalogoPersonagem.add(new Guerreiro(nPersonagem));
                } else if (typePerson == 2) {
                    catalogoPersonagem.add(new Mago(nPersonagem));
                } else if (typePerson == 3) {
                    catalogoPersonagem.add(new Demônio(nPersonagem));
                } else {
                    System.out.println("Personagem não criado, tipo não definido.");
                    break;
                }
                registrar("Personagens.Personagem " + (nPersonagem) + " foi criado");
                nPersonagem = "";
                break;
        }
    }
    public void criar(int elemento, int typePerson, String nome) {
        switch (elemento) {
            case 1:
                if (typePerson == 1) {
                    catalogoPersonagem.add(new Guerreiro(nome));
                } else if (typePerson == 2) {
                    catalogoPersonagem.add(new Mago(nome));
                } else if (typePerson == 3) {
                    catalogoPersonagem.add(new Demônio(nome));
                } else {
                    System.out.println("Personagem não criado, tipo não definido.");
                    break;
                }
                registrar("Personagens.Personagem " + (nome) + " foi criado");
                break;
        }
    }
    public void criar(int elemento) {
        switch (elemento) {
            case 2:
                System.out.print("Digite o nome da magia: ");
                String nMagia = input.next();
                catalogoMagia.add(new Magia(nMagia));
                registrar("Elementos.Magia {%s} foi criado".format(nMagia));
                nMagia = "";
                break;

            case 3:
                System.out.print("Digite o nome da arma: ");
                String nArma = input.next();
                catalogoArma.add(new Arma(nArma));
                registrar("Elementos.Arma {%s} foi criado".format(nArma));
                nArma = "";
                break;
        }
    }
    private void registrar(String mensagem) {
        eventos.add("Evento " + (quantEventos + 1) + " - " + mensagem + "\n");
        quantEventos++;
    }
    public void definirAtributos(Personagem personagem) {
        personagem.setDefesa(geradorN.nextInt(500));
        registrar("Valor de defesa definido");

        personagem.setForça(geradorN.nextInt(500));
        registrar("Valor de força definido");

        personagem.setVida(geradorN.nextInt(10000));
        registrar("Valor de vida definido");
    }

    public void definirAtributos(Arma arma) {
        arma.setDefesa(geradorN.nextInt(500));
        registrar("Valor de defesa definiod");

        arma.setDano(geradorN.nextInt(500));
        registrar("Valor de dano definido");

    }

    public void definirAtributos(Magia magia) {
        magia.setDefesa(geradorN.nextInt(500));
        registrar("Valor de defesa definido");

        magia.setDano(geradorN.nextInt(500));
        registrar("Valor de força definido");

    }
    public void mostrarCatalogo(int modo) {
        switch (modo) {
            case 1:
                System.out.println("\nPERSONAGENS");
                for (int i = 0; i < catalogoPersonagem.size(); i++) {
                    Personagem personagem = (Personagem) catalogoPersonagem.get(i);
                    System.out.printf("Nome: %s | Raça: %s | Vida: %d | Defesa: %d | Força: %d | Arma: %s | Magia: %s\n", personagem.getNome(), personagem.getRaça(),personagem.getVida(), personagem.getDefesa(), personagem.getForça(), personagem.getArma().getNome(), personagem.getMagia().getNome());
                }
                break;

            case 2:
                System.out.println("\nARMAS");
                for (int i = 0; i < catalogoArma.size(); i++) {
                    Arma arma = (Arma) catalogoArma.get(i);
                    System.out.printf("Nome: %s | Poder %s | Dano: %d | Defesa: %d", arma.getNome(), arma.getPoder(), arma.getDano(), arma.getDefesa());
                }
                break;

            case 3:
                System.out.println("\nMAGIAS");
                for (int i = 0; i < catalogoMagia.size(); i++) {
                    Magia magia = (Magia) catalogoMagia.get(i);
                    System.out.printf("Nome: %s | Poder: %s | Dano: %d | Defesa: %d\n", magia.getNome(), magia.getPoder(), magia.getDano(), magia.getDefesa());
            }
                break;

            case 0:
                System.out.println("\nPERSONAGENS");
                for (int i = 0; i < catalogoPersonagem.size(); i++) {
                    Personagem personagem = (Personagem) catalogoPersonagem.get(i);
                    System.out.printf("Nome: %s | Raça: %s | Vida: %d | Defesa: %d | Força: %d | Arma: %s | Magia: %s\n", personagem.getNome(), personagem.getRaça(),personagem.getVida(), personagem.getDefesa(), personagem.getForça(), personagem.getArma().getNome(), personagem.getMagia().getNome());
                }

                System.out.println("\nARMAS");
                for (int i = 0; i < catalogoArma.size(); i++) {
                    Arma arma = (Arma) catalogoArma.get(i);
                    System.out.printf("Nome: %s | Poder %s | Dano: %d | Defesa: %d", arma.getNome(), arma.getPoder(), arma.getDano(), arma.getDefesa());
                }

                System.out.println("\nMAGIAS");
                for (int i = 0; i < catalogoMagia.size(); i++) {
                    Magia magia = (Magia) catalogoMagia.get(i);
                    System.out.printf("Nome: %s | Poder: %s | Dano: %d | Defesa: %d\n", magia.getNome(), magia.getPoder(), magia.getDano(), magia.getDefesa());
                }
                break;
        }
    }
}
