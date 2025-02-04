package Teste_Prof;

public class Livre {
    private String name;
    private float price;
    private int quantity;

    public Livre() {
        name = "Robison";
        price = 26;
        quantity = 8;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantite() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    public String toString() {
        return "Livre{" +
                "name='" + name  +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
