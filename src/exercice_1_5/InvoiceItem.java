package exercice_1_5;

public class InvoiceItem {
    private String id;
    private int qty;
    private double uniPrice;
    private String desc;

    public InvoiceItem(String id, String desc, int qty, double uniPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.uniPrice = uniPrice;
    }

    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public double getUniPrice() {
        return uniPrice;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public void setUnitPrice(double uniPrice) {
        this.uniPrice = uniPrice;
    }
    public double getTotal() {
        return uniPrice * qty;
    }
    public String toString() {
        return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", uniPrice=" + uniPrice + "]";
    }
}