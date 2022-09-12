import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Dono homemBarbudo = new Dono("Marcelo", 'm', 27);
        Gato gatoAmarelo = new Gato("Lasanha", "Amarelo com manchas brancas", 'm');
        homemBarbudo.adotar(gatoAmarelo);
        

        System.out.printf("%s pertence a %s\n", gatoAmarelo.getNome(), gatoAmarelo.getDono().getNome());
    }
}