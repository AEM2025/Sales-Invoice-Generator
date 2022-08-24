package app.viewAug;
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

//import app.controlAug.Actions;

public class MainFrame extends javax.swing.JFrame implements ActionListener {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        Savebtn = new javax.swing.JButton();
        Savebtn.addActionListener(this);
        CreateInvoicebtn = new javax.swing.JButton();
        CreateInvoicebtn.addActionListener(this);
        Cancelbtn = new javax.swing.JButton();
        Cancelbtn.addActionListener(this);
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

        Savebtn.setText("Save");

        CreateInvoicebtn.setText("Create New Invoice");

        Cancelbtn.setText("Cancel");

        DeleteInvoicebtn.setText("Delete Invoice");

        InvoiceNumberLabel.setText("Invoice Number");

        InvoiceDateLabel.setText("Invoice Date");

        InvoiceTotalLabel.setText("Invoice Total");

        CustomerNameLabel.setText("Customer Name");

        InvoiceNumberTxt.setText(".");

        InvoiceDateTxt.setText(".");

        CustomerNameTxt.setText(".");

        InvoiceTotalTxt.setText(".");

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
                        .addComponent(Savebtn)
                        .addGap(62, 62, 62)
                        .addComponent(Cancelbtn)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancelbtn)
                            .addComponent(Savebtn))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteInvoicebtn)
                            .addComponent(CreateInvoicebtn))
                        .addGap(55, 104, Short.MAX_VALUE))))
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
    private javax.swing.JButton Cancelbtn;
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
    private javax.swing.JButton Savebtn;
    private javax.swing.JTable headerTable;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private List<InvoiceHeader> allInvList = new ArrayList<>();
    private InvoiceHeaderTable InvoiceHeaderTable;
    private DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        
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
           
            case "Delete Invoice":
            
            case "Save":
            
            case "Cancel":
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

                System.out.println("Debug");
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

}

