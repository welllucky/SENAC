import Elementos.Arma;
import Elementos.Magia;
import Personagens.Personagem;
import Personagens.Jogável;

import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[ ] args){
        program();
        //test();
    }

    public static void test(){
        Random gerador = new Random();
        for (int i = 0; i < 3; i++){
            System.out.printf("%d\n",gerador.nextInt(1000));
        }
    }

    public static void program(){
        System.out.println("");
        Ambiente controller = new Ambiente();

        Scanner input = new Scanner(System.in);

        List arma = controller.catalogoArma;
        List magia = controller.catalogoMagia;
        List personagem = controller.catalogoPersonagem;

        while(true){
            System.out.println("\nQuantos personagens você deseja criar?");
            System.out.print("Quantidade de personagens: ");
            int quantPersonagens = input.nextInt();
            //input.close();
            System.out.println();

            for (int i = 0; i < quantPersonagens; i++){
                System.out.printf("Personagem %d\n", i+1);

                System.out.println("Escolha o tipo do seu pesonagem\n1 - Guerreiro | 2 - Mago | 3 - Demônio\n");
                System.out.print("Escolha o tipo: ");
                int escolha = input.nextInt();
                System.out.println();

                System.out.print("Nome do personagem: ");
                String nomePersonagem = input.next();
                //input.close();
                System.out.println();

                controller.criar(1, escolha, nomePersonagem);
                controller.definirAtributos((Personagem) personagem.get(i));
            }
            controller.criar(2);
            controller.criar(3);

            for (int i = 0; i < controller.catalogoPersonagem.size(); i++){
                Personagem person = (Personagem) personagem.get(i);
                person.setMagia((Magia) magia.get(0));
                person.setArma((Arma) arma.get(0));
            }

            controller.mostrarCatalogo(0);

            Jogável personagem1Ação = (Jogável) personagem.get(0);
            Personagem personagem1 = (Personagem) personagem.get(0);

            Jogável personagem2Ação = (Jogável) personagem.get(2);
            Personagem personagem2 = (Personagem) personagem.get(2);

            personagem2Ação.atacar(personagem1);
            personagem1Ação.atacar(personagem2);

    }
}
}
