class Main{
    public static void main(String args[ ]){
        Supermercado paoDeSal = new Supermercado("38.204.353/0001-86");

        paoDeSal.setNome("Pão de Sal");
        paoDeSal.setEndereco("17524-440", "Rua Onofre José Barbosa", "", "Jardim Aparecida Nasser", "Marília","SP","Brasil");
        paoDeSal.setTelefone("(14) 3773-1550");

        paoDeSal.showAll();

        Supermercado carrofive = new Supermercado("21.252.353/0006-26"); 

        carrofive.setNome("Carrofive");

        carrofive.showAll();

        //System.out.println(paoDeSal.getEndereco("rua"));
    }
}