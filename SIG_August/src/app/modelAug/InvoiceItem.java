package app.modelAug;
public class InvoiceItem {
    private InvoiceHeader inv;
    private String item;
    private int count;
    private double price;

    public InvoiceItem(InvoiceHeader inv, String item, int count, double price) {
        this.inv = inv;
        this.item = item;
        this.count = count;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "InvoiceItem{" + "item=" + item + ", count=" + count + ", price=" + price + '}';
    }
 
    public double getTotal()
    {
    
        return count*price;
    }
}
