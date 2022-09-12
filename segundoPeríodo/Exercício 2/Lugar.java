public abstract class Lugar {
    private int id;
    private String endereço;

    Lugar(){
        id++;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
}
