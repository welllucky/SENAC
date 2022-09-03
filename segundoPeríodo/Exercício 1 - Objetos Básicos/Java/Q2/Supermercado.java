class Supermercado{
    
    private static int ID;
    private String cnpj;
    private String nome;
    private String nomeFantasia;
    private Endereco endereco = new Endereco();
    private String telefone;

    Supermercado(String cnpj){
        this.cnpj = cnpj;
        this.nome = "Não informado";
        this.nomeFantasia = "Não informado";
        this.telefone = "Não informado";
        ID++;
    }


    public int getId(){
        return ID;
    }

    public String getCnpj(){
        return cnpj;
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

    /*public String getEndereco(String opcao){
        switch(opcao){
            case "cep":
            return endereco.cep;
            break;

            case "rua":
            return endereco.rua;
            break;

            case "complemento":
            return endereco.complemento;
            break;

            case "bairro":
            return endereco.bairro;
            break;

            case "cidade":
            return endereco.cidade;
            break;

            case "estado":
            return endereco.estado;
            break;

            case "pais":
            return endereco.pais;
            break;

            default:
            return endereco.cep;
            return endereco.rua;
            return endereco.complemento;
            return endereco.bairro;
            return endereco.cidade;
            return endereco.estado;
            return endereco.pais;
        }
        
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
        System.out.println("\nID: " + ID);
        System.out.println("Nome: " + nome);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Telefone: " + telefone);
        System.out.println("--------Endereço--------");
        System.out.println("CEP: " + endereco.cep);
        System.out.println("Rua: " + endereco.rua);
        System.out.println("Complemento: " + endereco.complemento);
        System.out.println("Bairro: " + endereco.bairro);
        System.out.println("Cidade: " + endereco.cidade);
        System.out.println("Estado: " + endereco.estado);
        System.out.println("Pais: " + endereco.pais + "\n");
                
    }
}