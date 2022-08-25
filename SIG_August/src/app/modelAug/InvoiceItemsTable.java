 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.modelAug;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AEM
 */
public class InvoiceItemsTable extends AbstractTableModel{

    private List<InvoiceItem> allItemList;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
    public InvoiceItemsTable(List<InvoiceItem> allItemList) {
    
    this.allItemList = allItemList;
    
    }

    
    
    @Override
    public int getRowCount() {
        return allItemList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;

    }

    @Override
    public String getColumnName(int columnIndex) 
    {
        switch (columnIndex)
        {
            case 0:
                return "Item Name";
            case 1:
                return "Price";
            case 2:
                return "Count";
            case 3:
                return "Total";
            default:
                return "";        
        }
    }

    public List<InvoiceItem> getAllItemList() {
        return allItemList;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return Double.class;
            case 2:
                return Integer.class;
            case 3:
                return Double.class;
            default:
                return Object.class;
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {

        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
     InvoiceItem hdRow= allItemList.get(rowIndex);
     
        switch (columnIndex)
        {
            case 0:
                return hdRow.getItem();
            case 1:
                return hdRow.getPrice();
            case 2:
                return hdRow.getCount();
            case 3:
                return hdRow.getTotal();
            default:
                return "";
        }
    }

    
}

