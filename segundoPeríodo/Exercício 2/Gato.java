public class Gato {
    private static int id;
    private String nome;
    private int idade = 0;
    private char sexo;
    private String pelagem;
    private Saude saude = new Saude();
    private String situacao;
    private Dono dono;
    private Lugar moradia = new Rua();
    private Lugar lugarAtual;
    private Ações fazer = new Ações();
    
    Gato(String nome, String pelagem, char sexo){
        id ++;
        this.nome = nome;
        this.sexo = sexo;
        this.pelagem = pelagem;
        this.lugarAtual = moradia;
        System.out.printf("Nasceu %s, um gato %s!\n", nome, pelagem);
        }


    public String getNome() {
        return nome;
    }

    public void renomear(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public String getPelagem() {
        return pelagem;
    }

    public Saude getSaude() {
        return saude;
    }

    public void setSaude(Saude saude) {
        this.saude = saude;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) { //mudar
        this.situacao = situacao;
    }

    public Dono getDono() {
        return dono;   // colocar atributo de nome
    }

    public void setDono(Dono dono) {    //setar o nome somente uma vez
        this.dono = dono;
    }

    public Lugar getMoradia() {
        return moradia;
    }

    public void setMoradia(Lugar moradia) {  //deve ser atrelado ao dono
        this.moradia = moradia;
    }

    public Ações fazendoOQue() {       
        return fazer;   //retonar o status
    }

    public void fazer(Ações fazer) {
        this.fazer = fazer;  
    }

    public Lugar getLugarAtual() {
        return lugarAtual;
    }

    public void setLugarAtual(Lugar lugarAtual) {
        this.lugarAtual = lugarAtual;
    }

}
