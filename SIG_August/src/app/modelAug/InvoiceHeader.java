 
package app.modelAug;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int num;
    private String name;
    private Date date;
    private ArrayList<InvoiceItem> Items; 

    public InvoiceHeader(String name, int num, Date date) {
        this.name = name;
        this.num = num;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ArrayList<InvoiceItem> getItems() {
        if (Items == null)
        {
            Items = new ArrayList(); // Lazy creation       
        }
        return Items;
    }

    @Override
    public String toString() {
        String str_var="InvoiceHeader{" + "name=" + name + ", num=" + num + ", date=" + date + '}';
        for(InvoiceItem item: getItems())
        {
            str_var += "\n\t" + item;
        
        
        }
        return str_var;
    }

    public double getTotal(){
    
        double total =0.0;
        for(InvoiceItem item: getItems()){
        
            total+= item.getTotal();
        }
        
        return total;
    
        
    }
    
    public void addNewItem(InvoiceItem item) {
        getItems().add(item);
    }
    
    public String getDataCSV()
    {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        return "" + getNum() + "," + df.format(getDate()) + "," + getName(); 
    }

}
