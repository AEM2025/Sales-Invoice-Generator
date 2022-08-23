package app.controlAug;
// Import app Views

import app.viewAug.NewHeader;
import app.viewAug.NewItem;
import app.viewAug.MainFrame;
// Import App Models
import app.modelAug.InvoiceHeader;
import app.modelAug.InvoiceItem;
// Working with Files
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//////////////////////////////////////////////////////////////

public class Actions implements ActionListener {

//    filesInputandOutput y;

    private static MainFrame mainFrame;
    private static NewHeader myHeaderFrame;
    private static NewItem myItemFrame;

    static File allInvoicesFile1;
    static File allItemsFile1;

    static ArrayList<InvoiceHeader> allInv;
    static ArrayList<InvoiceItem> allItms;

    String selectedInvoiceNum;

    public Actions(MainFrame frame) {
        mainFrame = frame;
    }

    public Actions(NewItem itmFrame) {
        myItemFrame = itmFrame;
    }

    public Actions(NewHeader headerFrame) {
        myHeaderFrame = headerFrame;
    }

    public Actions(MainFrame mnFrame, NewHeader headerFrame, NewItem itmFrame) 
    {
        mainFrame = mnFrame;
        myHeaderFrame = headerFrame;
        myItemFrame = itmFrame;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case "Load File":
                loadFile();
                break;

            case "Save File":
                saveFile();
                break;

            case "Create New Invoice":
                newInvoice();
                break;

            case "Delete Invoice":
                deleteInvoice();
                break;

            case "Save":
                save();
                break;

            case "Cancel":
                cancel();
                break;

        }

    }

    
    private void newInvoice() {
        myHeaderFrame.setVisible(true);
        System.out.println("New Invoice");
    }

    
    
    
    
    
    private void loadFile() {
        System.out.println("Load File");
    }

    private void saveFile() {
        System.out.println("Save File");
    }


    private void deleteInvoice() {
        System.out.println("Delete Invoice");
    }

    private void save() {
        System.out.println("Save Button");
    }

    private void cancel() {
        System.out.println("Cancel Button");
    }

}
