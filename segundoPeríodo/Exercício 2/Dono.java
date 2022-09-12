public class Dono {
    private static int id;
    private String nome;
    private int idade;
    private char sexo;
    private Gato gato;
    private Casa casa;

    Dono(String nome, char sexo, int idade){
        id ++;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        System.out.printf("Olha quem vem lá, %s se aproxima!\n", nome);
    }

    public static int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public Gato getGato() {
        return gato;
    }

    public void adotar(Gato gato) {
        this.gato = gato;
        gato.setDono(this);
        System.out.printf("%s adotou %s\n", nome, gato.getNome());
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
    
}
