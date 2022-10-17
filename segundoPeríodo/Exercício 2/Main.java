import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Dono homemBarbudo = new Dono("Marcelo", 'm', 27);
        Gato gatoAmarelo = new Gato("Lasanha", "Amarelo com manchas brancas", 'm');
        Casa casaTejipa = new Casa("Rua Marcos Menelau", homemBarbudo);
        Rua ruaDoMalote = new Rua();
        Gato gatoBiruta = new Gato("Gato Preto", "Preto", 'm').lugarAtual(ruaDoMalote);


        ruaDoMalote.setEndereço(casaTejipa.getEndereço())
        ruaDoMalote.setNome("Rua do Malote");
        
        homemBarbudo.adotar(gatoAmarelo);
        
        gatoAmarelo.getDono();
        gatoAmarelo.fazer().andar(ruaDoMalote);

        gatoBiruta.fazer().brigar(gatoAmarelo);

    
    }
}