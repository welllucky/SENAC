class Produto{
    private static int id;
    private String nome;
    private String marca;
    private String tipo;
    private float preco;
    private int quantidade;


    public int getId(void){
        return this.id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(void){
        return this.nome;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(void){
        return this.marca;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(void){
        return this.tipo;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void setQuant(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuant(void){
        return this.quantidade;
    }
}