
package app.modelAug;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AEM
 */
public class InvoiceHeaderTable extends AbstractTableModel{

    private List<InvoiceHeader> allInvList;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    
    public InvoiceHeaderTable(List<InvoiceHeader> allInvList) {
    
    this.allInvList = allInvList;
    
    }

    
    
    @Override
    public int getRowCount() {
        return allInvList.size();
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
                return "Invoice Number";
            case 1:
                return "Customer Name";
            case 2:
                return "Invoice Date";
            case 3:
                return "Invoice Total";
            default:
                return "";        
        }
    }

    public List<InvoiceHeader> getAllInvList() {
        return allInvList;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
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
     InvoiceHeader hdRow= allInvList.get(rowIndex);
     
        switch (columnIndex)
        {
            case 0:
                return hdRow.getNum();
            case 1:
                return hdRow.getName();
            case 2:
                return df.format(hdRow.getDate());
            case 3:
                return hdRow.getTotal();
            default:
                return "";        
        }
    }

    
}
