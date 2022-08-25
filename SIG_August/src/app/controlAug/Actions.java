package app.controlAug;
// Import app Views

import app.viewAug.MainFrame;
import app.viewAug.NewHeaderFrame;
import app.viewAug.NewItemFrame;
// Import App Models

import app.modelAug.Header;
import app.modelAug.Item;
import app.modelAug.HeaderTable;
import app.modelAug.ItemsTable;

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
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
//////////////////////////////////////////////////////////////

public class Actions implements ActionListener, ListSelectionListener {

    private MainFrame mainFrame;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

    public Actions(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
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
                newInvoiceDialog();
                break;

            case "createInvoiceCancel":
                createInvoiceCancel();
                break;

            case "createInvoiceOk":
                createInvoiceOk();
                break;

            case "Delete Invoice":
                deleteInvoice();
                break;

            case "Create New Item":
                newItemDialog();
                break;
            case "createItemCancel":
                createItemCancel();
                break;
            case "createItemOk":
                createItemOk();
                break;
            case "Delete Item":
                deleteItem();
                break;

        }

    }

    private void loadFile() {
        /////////////////////// Select Header File
        JOptionPane.showMessageDialog(mainFrame, "Please select header file", "Attention", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser openMyFile = new JFileChooser();
        int choice = openMyFile.showOpenDialog(mainFrame);
        if (choice == JFileChooser.APPROVE_OPTION) {
            File headerFile = openMyFile.getSelectedFile();
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
                    Date invoiceDate = df.parse(str_InvoiceDate);

                    String str_CustomerName = headerItems[2];
                    Header invoice = new Header(str_CustomerName, int_InvoiceNumber, invoiceDate);
                    mainFrame.getAllInvList().add(invoice);

                }

                ////////////////// Select Items File    
                JOptionPane.showMessageDialog(mainFrame, "Please select Items file", "Attention", JOptionPane.INFORMATION_MESSAGE);
                //JFileChooser openMyFileItem = new JFileChooser();

                choice = openMyFile.showOpenDialog(mainFrame);
                if (choice == JFileChooser.APPROVE_OPTION) {
                    File itemsFile = openMyFile.getSelectedFile();

                    BufferedReader itemsBRead = new BufferedReader(new FileReader(itemsFile));
                    String itemsLines = null;
                    while ((itemsLines = itemsBRead.readLine()) != null) {

                        String[] headerItems = itemsLines.split(",");

                        String str_InvoiceNumber = headerItems[0];
                        String str_ItemName = headerItems[1];
                        String str_ItemsPrice = headerItems[2];
                        String str_ItemCount = headerItems[3];

                        int int_InvoiceNumber = Integer.parseInt(str_InvoiceNumber);

                        int int_ItemCount = Integer.parseInt(str_ItemCount);
                        double db_ItemPrice = Double.parseDouble(str_ItemsPrice);

                        Header hd = findInvoicesByNumber(int_InvoiceNumber);
                        Item item = new Item(hd, str_ItemName, int_ItemCount, db_ItemPrice);
                        hd.getItems().add(item);
                    }
                    mainFrame.setInvoiceHeaderTable(new HeaderTable(mainFrame.getAllInvList()));
                    mainFrame.getHeaderTable().setModel(mainFrame.getInvoiceHeaderTable());
                    mainFrame.getHeaderTable().validate();

                }

            } catch (ParseException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(mainFrame, "Error: Data isn't in the correct format.\n Remember\n Date:\t ex:20-11-2020 \n Name:\t ex: Ahmed Ali\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(mainFrame, "Error: Number isn't in the correct format.\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(mainFrame, "Error: \n " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {

                JOptionPane.showMessageDialog(mainFrame, "Error: \n Can't read your file! \n Please try again! " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void saveFile() {
        String headerDT = "";
        String itemsDT = "";
        for (Header hd : mainFrame.getAllInvList()) {
            headerDT += hd.getDataCSV();
            headerDT += "\n";
            for (Item item : hd.getItems()) {
                itemsDT += item.getDataCSV();
                itemsDT += "\n";
            }
        }
        JOptionPane.showMessageDialog(mainFrame, "Please select location to save the header file!", "Attention", JOptionPane.INFORMATION_MESSAGE);

        JFileChooser jFile = new JFileChooser();
        int saveResult = jFile.showSaveDialog(mainFrame);
        if (saveResult == JFileChooser.APPROVE_OPTION) {
            File file = jFile.getSelectedFile();
            try {
                FileWriter fw = new FileWriter(file);
                fw.write(headerDT);
                fw.flush();
                fw.close();
                JOptionPane.showMessageDialog(mainFrame, "Please select location to save the Items file!", "Attention", JOptionPane.INFORMATION_MESSAGE);
                saveResult = jFile.showSaveDialog(mainFrame);

                if (saveResult == JFileChooser.APPROVE_OPTION) {
                    File itemFile = jFile.getSelectedFile();
                    FileWriter iFW = new FileWriter(itemFile);
                    iFW.write(itemsDT);
                    iFW.flush();
                    iFW.close();

                }
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(mainFrame, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                //ex.printStackTrace();
            }

        }

    }

    private Header findInvoicesByNumber(int invoiceNumber) {
        Header hd = null;
        for (Header invoice : mainFrame.getAllInvList()) {
            if (invoiceNumber == invoice.getNum()) {
                hd = invoice;
                break;
            }

        }
        return hd;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        headerTableRowSelected();

    }

    private void headerTableRowSelected() {
        int selectedIdx = mainFrame.getHeaderTable().getSelectedRow();
        if (selectedIdx >= 0) {
            Header rw = mainFrame.getInvoiceHeaderTable().getAllInvList().get(selectedIdx);
            mainFrame.getCustomerNameTxt().setText(rw.getName());
            mainFrame.getInvoiceDateTxt().setText(df.format(rw.getDate()));
            mainFrame.getInvoiceNumberTxt().setText("" + rw.getNum());
            mainFrame.getInvoiceTotalTxt().setText("" + rw.getTotal());

            ArrayList<Item> items = rw.getItems();
            mainFrame.setInvoiceItemsTable(new ItemsTable(items));
            mainFrame.getItemsTable().setModel(mainFrame.getInvoiceItemsTable()); // InvoiceItemsTable
            mainFrame.getInvoiceItemsTable().fireTableDataChanged();

        }

    }

    private void newInvoiceDialog() {

        mainFrame.setNewInvoiceDialog(new NewHeaderFrame(mainFrame));
        mainFrame.getNewInvoiceDialog().setVisible(true);
    }

    private void newItemDialog() {
        mainFrame.setNewItemDialog(new NewItemFrame(mainFrame));
        mainFrame.getNewItemDialog().setVisible(true);
    }

    private void createInvoiceCancel() {
        mainFrame.getNewInvoiceDialog().setVisible(false);
        mainFrame.getNewInvoiceDialog().dispose();
        mainFrame.setNewInvoiceDialog(null);

    }

    private void createItemCancel() {
        mainFrame.getNewItemDialog().setVisible(false);
        mainFrame.getNewItemDialog().dispose();
        mainFrame.setNewItemDialog(null);
    }

    private void createInvoiceOk() {

        String customerName = mainFrame.getNewInvoiceDialog().getCustomerNameTxt().getText();
        String str_InvoiceDate = mainFrame.getNewInvoiceDialog().getInvoiceDate().getText();
        mainFrame.getNewInvoiceDialog().setVisible(false);
        mainFrame.getNewInvoiceDialog().dispose();
        mainFrame.setNewInvoiceDialog(null);

        try {
            Date date_InvoiceDate = df.parse(str_InvoiceDate);
            int invoiceNumber = getNextInvoiceCounter();
            Header InvoiceHeader = new Header(customerName, invoiceNumber, date_InvoiceDate);
            mainFrame.getAllInvList().add(InvoiceHeader);
            mainFrame.getInvoiceHeaderTable().fireTableDataChanged();
        } catch (ParseException ex) {

            JOptionPane.showMessageDialog(mainFrame, "Error: Please try again! \n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            //ex.printStackTrace();
        }
        //displayHeaders();
    }

    private void createItemOk() {
        String itemName = mainFrame.getNewItemDialog().getItemNameTxt().getText();
        String str_ItemPrice = mainFrame.getNewItemDialog().getItemPriceTxt().getText();
        String str_ItemCount = mainFrame.getNewItemDialog().getItemCountTxt().getText();

        mainFrame.getNewItemDialog().setVisible(false);
        mainFrame.getNewItemDialog().dispose();
        mainFrame.setNewItemDialog(null);

        int int_ItemCount = Integer.parseInt(str_ItemCount);
        double db_ItemPrice = Double.parseDouble(str_ItemPrice);
        int headerIdx = mainFrame.getHeaderTable().getSelectedRow();

        Header inv = mainFrame.getInvoiceHeaderTable().getAllInvList().get(headerIdx);

        Item invoiceItem = new Item(inv, itemName, int_ItemCount, db_ItemPrice);
        inv.addNewItem(invoiceItem);

        mainFrame.getInvoiceItemsTable().fireTableDataChanged();

        mainFrame.getInvoiceHeaderTable().fireTableDataChanged();
        mainFrame.getInvoiceTotalTxt().setText("" + inv.getTotal());
        //displayHeaders();
    }

    private int getNextInvoiceCounter() {
        int maxNumber = 0;
        for (Header hd : mainFrame.getAllInvList()) {
            if (hd.getNum() > maxNumber) {
                maxNumber = hd.getNum();

            }
        }
        return maxNumber + 1;
    }

    private void deleteItem() {
        int itemIdx = mainFrame.getItemsTable().getSelectedRow();
        Item item = mainFrame.getInvoiceItemsTable().getAllItemList().get(itemIdx);
        mainFrame.getInvoiceItemsTable().getAllItemList().remove(itemIdx);
        mainFrame.getInvoiceItemsTable().fireTableDataChanged();

        mainFrame.getInvoiceHeaderTable().fireTableDataChanged();
        mainFrame.getInvoiceTotalTxt().setText("" + item.getInv().getTotal());
        //displayHeaders();
    }

    private void deleteInvoice() {

        int headerIdx = mainFrame.getHeaderTable().getSelectedRow();
        Header hd = mainFrame.getInvoiceHeaderTable().getAllInvList().get(headerIdx);
        mainFrame.getInvoiceHeaderTable().getAllInvList().remove(hd);
        mainFrame.getInvoiceHeaderTable().fireTableDataChanged();
        mainFrame.setInvoiceItemsTable(new ItemsTable(new ArrayList<Item>()));
        mainFrame.getInvoiceItemsTable().fireTableDataChanged();

        mainFrame.getCustomerNameTxt().setText("");
        mainFrame.getInvoiceDateTxt().setText("");
        mainFrame.getInvoiceNumberTxt().setText("");
        mainFrame.getInvoiceTotalTxt().setText("");
        //displayHeaders();
    }

    /*
    private void displayHeaders() {
        System.out.println("**********************************");
        for (InvoiceHeader hd : allInvList) {
            System.out.println(hd);
        }
        System.out.println("====================================");

    }
     */
}
