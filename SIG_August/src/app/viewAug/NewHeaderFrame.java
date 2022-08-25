

package app.viewAug;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class NewHeaderFrame extends JDialog
{
    private JTextField customerNameTxt;
    private JTextField invoiceDate;
    private JLabel customerNameLabel;
    private JLabel invoiceDateLabel;
    private JButton okBtn;
    private JButton cancelBtn;  

    public NewHeaderFrame(MainFrame frame) 
    {
        customerNameLabel = new JLabel("Customer Name: ");
        customerNameTxt = new JTextField(20);
        invoiceDateLabel = new JLabel("Invoice Date: ");
        invoiceDate = new JTextField(20);
        okBtn = new JButton("Ok");
        cancelBtn = new JButton("Cancel");
        
        cancelBtn.addActionListener(frame.getListner());
        okBtn.addActionListener(frame.getListner());
        
        okBtn.setActionCommand("createInvoiceOk");
        cancelBtn.setActionCommand("createInvoiceCancel");
        setLayout(new GridLayout(3,2));

        add(invoiceDateLabel);
        add(invoiceDate);
        
        add(customerNameLabel);
        add(customerNameTxt);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getCustomerNameTxt() {
        return customerNameTxt;
    }

    public JTextField getInvoiceDate() {
        return invoiceDate;
    }
    
}

