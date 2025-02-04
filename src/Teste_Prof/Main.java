package Teste_Prof;

public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre();
        System.out.println("Livre 1 : " + livre1);
        Livre livre2 = new Livre();
        livre2.setName("Harry Potter");
        livre2.setPrice(35.5f);
        livre2.setQuantity(12);
        System.out.println("Livre 2 : " + livre2);
        livre1.setName("Le Petit Kirikou");
        livre1.setPrice(18.99f);
        
    }
}
