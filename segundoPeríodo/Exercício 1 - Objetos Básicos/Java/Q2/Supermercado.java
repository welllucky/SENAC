class Supermercado{

    private static int ID;
    private String cnpj;
    private String nome;
    private String nomeFantasia;
    private Endereco endereco = new Endereco();
    private String telefone;

    public int getId(){
        return ID;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String cep, String rua, String complemento,String bairro, String cidade, String estado, String pais){
        this.endereco.cep = cep;
        this.endereco.rua = rua;
        this.endereco.complemento = complemento;
        this.endereco.bairro = bairro;
        this.endereco.cidade = cidade;
        this.endereco.estado = estado;
        this.endereco.pais = pais;
    }

    /*public Endereco getEndereco(){

    }*/

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void showAll(){
        System.out.println("ID: ".concat(ID) +
                "Nome: ".concat(nome) +
                "Nome Fantasia: ".concat(nomeFantasia) +
                "CNPJ:".concat(cnpj) +
                "Endereço: ".concat(endereco) +
                "Telefone: ".concat(telefone));
    }
}