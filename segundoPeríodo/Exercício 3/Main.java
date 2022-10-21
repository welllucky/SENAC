class Main{
    public static void main(String arg[ ]){
        Personagem homemGrande = new Personagem("Gandalf");
        homemGrande.setForça(36);
        homemGrande.setRaça("Mago");
        homemGrande.setVida(400);

        homemGrande.magia().setNome("Bola de energia");
        homemGrande.magia().setPoder("Bolar de poder que quando em contato com o inimigo o joga para longe");

        homemGrande.arma().setNome("Cajado");
        homemGrande.arma().setPoder("Tem o poder de concetrar todas as magias ao qual o seu mestre domina");

        
    }
}