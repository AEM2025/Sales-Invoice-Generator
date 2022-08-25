package app.modelAug;
public class Item {
    private Header inv;
    private String item;
    private int count;
    private double price;

    public Item(Header inv, String item, int count, double price) {
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

    public Header getInv() {
        return inv;
    }

    public void setInv(Header inv) {
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
    
    public String getDataCSV()
    {
        return "" + getInv().getNum() + ","+ getItem() + ","+ getPrice() +","+ getCount(); 
    }
}
