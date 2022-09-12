public class Casa extends Lugar{
    private int id;
    private String descrição;
    private String comodos; //transforma em array
    private Dono responsável;

    Casa(String endereço, Dono dono){
        id++;
        this.setEndereço(endereço);
        this.responsável = dono;
    }

    public int getId() {
        return id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getComodos() {//modificar 
        return comodos;
    }

    public void setComodos(String comodos) {//os dois metódos
        this.comodos = comodos;
    }

    public Dono getResponsável() {
        return responsável;
    }

    public void adicionarComodo(String comodo){
        //criar ação para adicionar o item no array
    }
}
