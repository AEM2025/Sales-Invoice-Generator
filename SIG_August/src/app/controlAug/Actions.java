/*
package app.controlAug;
// Import app Views

import app.viewAug.MainFrame;
// Import App Models
import app.modelAug.InvoiceHeader;
import app.modelAug.InvoiceItem;
import app.modelAug.InvoiceHeaderTable;

// Working with Files
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//////////////////////////////////////////////////////////////

public class Actions implements ActionListener {

//    filesInputandOutput y;
    private  MainFrame mainFrame = new MainFrame();

    private List<InvoiceHeader> allInvList = new ArrayList<>();
    private InvoiceHeaderTable InvoiceHeaderTable; 

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
    private InvoiceHeader findInvoicesByNumber(int invoiceNumber) {
        InvoiceHeader hd = null;
        for (InvoiceHeader invoice : allInvList) {
            if (invoiceNumber == invoice.getNum()) {
                hd = invoice;
                break;
            }

        }
        return hd;
    }


    private void newInvoice() {
        //myHeaderFrame.setVisible(true);
        System.out.println("New Invoice");
    }

    private void loadFile() {
        /////////////////////// Select Header File
        JOptionPane.showMessageDialog(mainFrame, "Please select header file", "Attention", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser openMyFileHeader = new JFileChooser();
        int choice = openMyFileHeader.showOpenDialog(mainFrame);
        if (choice == JFileChooser.APPROVE_OPTION) {
            File headerFile = openMyFileHeader.getSelectedFile();
            try {

                FileReader HeaderFRead = new FileReader(headerFile);
                BufferedReader headerBRead = new BufferedReader(HeaderFRead);

                String headerLines = null;
                while ((headerLines = headerBRead.readLine()) != null) {
                    String[] headerItems = headerLines.split(",");

                    String str_InvoiceNumber = headerItems[0];
                    // Convert string to integer
                    int int_InvoiceNumber = Integer.parseInt(str_InvoiceNumber);

                    String str_InvoiceDate = headerItems[1];
                    // Convert to date format
                    DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                    Date invoiceDate = df.parse(str_InvoiceDate);

                    String str_CustomerName = headerItems[2];
                    InvoiceHeader invoice = new InvoiceHeader(str_CustomerName, int_InvoiceNumber, invoiceDate);
                    allInvList.add(invoice);

                }

                ////////////////// Select Items File    
                JOptionPane.showMessageDialog(mainFrame, "Please select Items file", "Attention", JOptionPane.INFORMATION_MESSAGE);
                JFileChooser openMyFileItem = new JFileChooser();
                
                int Choice2 = openMyFileItem.showOpenDialog(mainFrame);
                if (Choice2 == JFileChooser.APPROVE_OPTION) {
                    File itemsFile = openMyFileItem.getSelectedFile();
                    FileReader itemsFRead = new FileReader(itemsFile);
                    BufferedReader itemsBRead = new BufferedReader(itemsFRead);
                    String itemsLines = null;
                    while ((itemsLines = itemsBRead.readLine()) != null) {

                        String[] headerItems = itemsLines.split(",");

                        String str_InvoiceNumber = headerItems[0];
                        // Convert string to integer
                        int int_InvoiceNumber = Integer.parseInt(str_InvoiceNumber);

                        String str_ItemName = headerItems[1];
                        String str_ItemsPrice = headerItems[2];
                        double db_ItemPrice = Double.parseDouble(str_ItemsPrice);

                        String str_ItemCount = headerItems[3];
                        int int_ItemCount = Integer.parseInt(str_ItemCount);

                        InvoiceHeader hd = findInvoicesByNumber(int_InvoiceNumber);
                        InvoiceItem item = new InvoiceItem(hd, str_ItemName, int_ItemCount, db_ItemPrice);
                        hd.getItems().add(item);
                    }
                    InvoiceHeaderTable = new InvoiceHeaderTable(allInvList);
                    mainFrame.HeaderTable.setModel(InvoiceHeaderTable);
                    mainFrame.HeaderTable.validate();
                    
                }

                System.out.println("Debug");
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

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
*/