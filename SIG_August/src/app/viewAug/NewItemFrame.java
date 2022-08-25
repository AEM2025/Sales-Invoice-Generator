
package app.viewAug;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class NewItemFrame extends JDialog
{
    private JTextField itemNameTxt;
    private JTextField itemPriceTxt;
    private JTextField itemCountTxt;
    
    private JLabel itemNameLabel;
    private JLabel itemPriceLabel;
    private JLabel itemCountLabel;

    private JButton okBtn;
    private JButton cancelBtn;  

    public NewItemFrame(MainFrame frame) 
    {
        itemNameLabel = new JLabel("Item Name: ");
        itemNameTxt = new JTextField(20);
        
        itemPriceLabel = new JLabel("Item Price: ");
        itemPriceTxt = new JTextField(20);
        
        itemCountLabel = new JLabel("Item Count: ");
        itemCountTxt = new JTextField(20);
        
        okBtn = new JButton("Ok");
        cancelBtn = new JButton("Cancel");
        
        cancelBtn.addActionListener(frame.getListner());
        okBtn.addActionListener(frame.getListner());
        
        okBtn.setActionCommand("createItemOk");
        cancelBtn.setActionCommand("createItemCancel");
        setLayout(new GridLayout(4,2));

        add(itemNameLabel);
        add(itemNameTxt);
        
        add(itemPriceLabel);
        add(itemPriceTxt);

        add(itemCountLabel);
        add(itemCountTxt);

        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getItemNameTxt() {
        return itemNameTxt;
    }

    public JTextField getItemPriceTxt() {
        return itemPriceTxt;
    }

    public JTextField getItemCountTxt() {
        return itemCountTxt;
    }

    

    
}
