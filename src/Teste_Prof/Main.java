package Teste_Prof;

public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre();
        System.out.println(livre1); 

        Livre livre2 = new Livre();
        livre2.setName("Harry Potter");
        livre2.setPrice(35.5f);
        
        System.out.println(livre2);
    }
}
