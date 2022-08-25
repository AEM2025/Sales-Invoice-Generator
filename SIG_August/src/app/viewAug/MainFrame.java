package app.viewAug;
// Import App Models

import app.modelAug.InvoiceHeader;
import app.modelAug.InvoiceItem;
import app.modelAug.InvoiceHeaderTable;
import app.modelAug.InvoiceItemsTable;

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
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionListener;

//////////////////////////////////////////////////////////////
//import app.controlAug.Actions;
public class MainFrame extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        createNewItemBtn = new javax.swing.JButton();
        createNewItemBtn.addActionListener(this);
        CreateInvoicebtn = new javax.swing.JButton();
        CreateInvoicebtn.addActionListener(this);
        deleteItemBtn = new javax.swing.JButton();
        deleteItemBtn.addActionListener(this);
        DeleteInvoicebtn = new javax.swing.JButton();
        DeleteInvoicebtn.addActionListener(this);
        InvoiceNumberLabel = new javax.swing.JLabel();
        InvoiceDateLabel = new javax.swing.JLabel();
        InvoiceTotalLabel = new javax.swing.JLabel();
        CustomerNameLabel = new javax.swing.JLabel();
        InvoiceNumberTxt = new javax.swing.JTextField();
        InvoiceDateTxt = new javax.swing.JTextField();
        CustomerNameTxt = new javax.swing.JTextField();
        InvoiceTotalTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(this);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadMenuItem = new javax.swing.JMenuItem();
        LoadMenuItem.addActionListener(this);
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(ItemsTable);

        createNewItemBtn.setText("Create New Item");

        CreateInvoicebtn.setText("Create New Invoice");

        deleteItemBtn.setText("Delete Item");

        DeleteInvoicebtn.setText("Delete Invoice");

        InvoiceNumberLabel.setText("Invoice Number");

        InvoiceDateLabel.setText("Invoice Date");

        InvoiceTotalLabel.setText("Invoice Total");

        CustomerNameLabel.setText("Customer Name");

        InvoiceNumberTxt.setEditable(false);

        InvoiceTotalTxt.setEditable(false);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(headerTable);

        jMenu1.setText("File");

        LoadMenuItem.setText("Load File");
        jMenu1.add(LoadMenuItem);

        SaveMenuItem.setText("Save File");
        jMenu1.add(SaveMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InvoiceNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(InvoiceDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CustomerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(InvoiceNumberTxt)
                                    .addComponent(InvoiceDateTxt)
                                    .addComponent(CustomerNameTxt)
                                    .addComponent(InvoiceTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CreateInvoicebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteInvoicebtn)
                        .addGap(175, 175, 175)
                        .addComponent(createNewItemBtn)
                        .addGap(62, 62, 62)
                        .addComponent(deleteItemBtn)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceNumberLabel)
                            .addComponent(InvoiceNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvoiceDateLabel))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CustomerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerNameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InvoiceTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvoiceTotalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteItemBtn)
                        .addComponent(createNewItemBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DeleteInvoicebtn)
                        .addComponent(CreateInvoicebtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateInvoicebtn;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JTextField CustomerNameTxt;
    private javax.swing.JButton DeleteInvoicebtn;
    private javax.swing.JLabel InvoiceDateLabel;
    private javax.swing.JTextField InvoiceDateTxt;
    private javax.swing.JLabel InvoiceNumberLabel;
    private javax.swing.JTextField InvoiceNumberTxt;
    private javax.swing.JLabel InvoiceTotalLabel;
    private javax.swing.JTextField InvoiceTotalTxt;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JMenuItem LoadMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JButton createNewItemBtn;
    private javax.swing.JButton deleteItemBtn;
    private javax.swing.JTable headerTable;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private List<InvoiceHeader> allInvList = new ArrayList<>();
    private InvoiceHeaderTable InvoiceHeaderTable;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
    private InvoiceItemsTable InvoiceItemsTable;
    private NewHeaderFrame newInvoiceDialog;
    private NewItemFrame newItemDialog;

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
        JOptionPane.showMessageDialog(this, "Please select header file", "Attention", JOptionPane.INFORMATION_MESSAGE);
        JFileChooser openMyFile = new JFileChooser();
        int choice = openMyFile.showOpenDialog(this);
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
                    InvoiceHeader invoice = new InvoiceHeader(str_CustomerName, int_InvoiceNumber, invoiceDate);
                    allInvList.add(invoice);

                }

                ////////////////// Select Items File    
                JOptionPane.showMessageDialog(this, "Please select Items file", "Attention", JOptionPane.INFORMATION_MESSAGE);
                //JFileChooser openMyFileItem = new JFileChooser();

                choice = openMyFile.showOpenDialog(this);
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

                        InvoiceHeader hd = findInvoicesByNumber(int_InvoiceNumber);
                        InvoiceItem item = new InvoiceItem(hd, str_ItemName, int_ItemCount, db_ItemPrice);
                        hd.getItems().add(item);
                    }
                    InvoiceHeaderTable = new InvoiceHeaderTable(allInvList);
                    headerTable.setModel(InvoiceHeaderTable);
                    headerTable.validate();

                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    private void saveFile() {

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

    @Override
    public void valueChanged(ListSelectionEvent e) {
        headerTableRowSelected();

    }

    private void headerTableRowSelected() {
        int selectedIdx = headerTable.getSelectedRow();
        if (selectedIdx >= 0) {
            InvoiceHeader rw = InvoiceHeaderTable.getAllInvList().get(selectedIdx);
            CustomerNameTxt.setText(rw.getName());
            InvoiceDateTxt.setText(df.format(rw.getDate()));
            InvoiceNumberTxt.setText("" + rw.getNum());
            InvoiceTotalTxt.setText("" + rw.getTotal());

            ArrayList<InvoiceItem> items = rw.getItems();
            InvoiceItemsTable = new InvoiceItemsTable(items);
            ItemsTable.setModel(InvoiceItemsTable); // InvoiceItemsTable
            InvoiceItemsTable.fireTableDataChanged();

        }

    }

    private void newInvoiceDialog() {
        newInvoiceDialog = new NewHeaderFrame(this);
        newInvoiceDialog.setVisible(true);
    }

    private void newItemDialog() {
        newItemDialog = new NewItemFrame(this);
        newItemDialog.setVisible(true);
    }

    private void createInvoiceCancel() {
        newInvoiceDialog.setVisible(false);
        newInvoiceDialog.dispose();
        newInvoiceDialog = null;

    }

    private void createItemCancel() {
        newItemDialog.setVisible(false);
        newItemDialog.dispose();
        newItemDialog = null;
    }

    private void createInvoiceOk() {

        String customerName = newInvoiceDialog.getCustomerNameTxt().getText();
        String str_InvoiceDate = newInvoiceDialog.getInvoiceDate().getText();
        newInvoiceDialog.setVisible(false);
        newInvoiceDialog.dispose();
        newInvoiceDialog = null;

        try {
            Date date_InvoiceDate = df.parse(str_InvoiceDate);
            int invoiceNumber = getNextInvoiceCounter();
            InvoiceHeader InvoiceHeader = new InvoiceHeader(customerName, invoiceNumber, date_InvoiceDate);
            allInvList.add(InvoiceHeader);
            InvoiceHeaderTable.fireTableDataChanged();
        } catch (ParseException ex) {
            ex.printStackTrace();

        }
        displayHeaders();
    }

    private void createItemOk() {
        String itemName = newItemDialog.getItemNameTxt().getText();
        String str_ItemPrice = newItemDialog.getItemPriceTxt().getText();
        String str_ItemCount = newItemDialog.getItemCountTxt().getText();

        newItemDialog.setVisible(false);
        newItemDialog.dispose();
        newItemDialog = null;

        int int_ItemCount = Integer.parseInt(str_ItemCount);
        double db_ItemPrice = Double.parseDouble(str_ItemPrice);
        int headerIdx = headerTable.getSelectedRow();
        InvoiceHeader inv = InvoiceHeaderTable.getAllInvList().get(headerIdx);

        InvoiceItem invoiceItem = new InvoiceItem(inv, itemName, int_ItemCount, db_ItemPrice);
        inv.addNewItem(invoiceItem);

        InvoiceItemsTable.fireTableDataChanged();

        InvoiceHeaderTable.fireTableDataChanged();
        InvoiceTotalTxt.setText("" + inv.getTotal());
        displayHeaders();
    }

    private int getNextInvoiceCounter() {
        int maxNumber = 0;
        for (InvoiceHeader hd : allInvList) {
            if (hd.getNum() > maxNumber) {
                maxNumber = hd.getNum();

            }
        }
        return maxNumber + 1;
    }

    private void deleteItem() {
        int itemIdx = ItemsTable.getSelectedRow();
        InvoiceItem item = InvoiceItemsTable.getAllItemList().get(itemIdx);
        InvoiceItemsTable.getAllItemList().remove(itemIdx);
        InvoiceItemsTable.fireTableDataChanged();

        InvoiceHeaderTable.fireTableDataChanged();
        InvoiceTotalTxt.setText("" + item.getInv().getTotal());
        displayHeaders();
    }

    private void deleteInvoice() {

        int headerIdx = headerTable.getSelectedRow();
        InvoiceHeader hd = InvoiceHeaderTable.getAllInvList().get(headerIdx);
        InvoiceHeaderTable.getAllInvList().remove(hd);
        InvoiceHeaderTable.fireTableDataChanged();
        InvoiceItemsTable = new InvoiceItemsTable(new ArrayList<InvoiceItem>());
        InvoiceItemsTable.fireTableDataChanged();

        CustomerNameTxt.setText("");
        InvoiceDateTxt.setText("");
        InvoiceNumberTxt.setText("");
        InvoiceTotalTxt.setText("");
        displayHeaders();
    }

    private void displayHeaders() {
        System.out.println("**********************************");
        for (InvoiceHeader hd : allInvList) {
            System.out.println(hd);
        }
        System.out.println("====================================");

    }
}
