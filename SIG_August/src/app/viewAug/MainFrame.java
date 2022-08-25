package app.viewAug;
// Import App Models

import app.modelAug.InvoiceHeader;
import app.modelAug.InvoiceHeaderTable;
import app.modelAug.InvoiceItemsTable;
import app.controlAug.Actions;
// Working with Files
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

//////////////////////////////////////////////////////////////
//import app.controlAug.Actions;
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        createNewItemBtn = new javax.swing.JButton();
        createNewItemBtn.addActionListener(listner);
        CreateInvoicebtn = new javax.swing.JButton();
        CreateInvoicebtn.addActionListener(listner);
        deleteItemBtn = new javax.swing.JButton();
        deleteItemBtn.addActionListener(listner);
        DeleteInvoicebtn = new javax.swing.JButton();
        DeleteInvoicebtn.addActionListener(listner);
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
        headerTable.getSelectionModel().addListSelectionListener(listner);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadMenuItem = new javax.swing.JMenuItem();
        LoadMenuItem.addActionListener(listner);
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem.addActionListener(listner);

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
    
    private InvoiceItemsTable InvoiceItemsTable;
    private NewHeaderFrame newInvoiceDialog;
    private NewItemFrame newItemDialog;
    private Actions listner = new Actions(this);

    public void setNewInvoiceDialog(NewHeaderFrame newInvoiceDialog) {
        this.newInvoiceDialog = newInvoiceDialog;
    }

    public void setNewItemDialog(NewItemFrame newItemDialog) {
        this.newItemDialog = newItemDialog;
    }

    public void setInvoiceHeaderTable(InvoiceHeaderTable InvoiceHeaderTable) {
        this.InvoiceHeaderTable = InvoiceHeaderTable;
    }

    public void setInvoiceItemsTable(InvoiceItemsTable InvoiceItemsTable) {
        this.InvoiceItemsTable = InvoiceItemsTable;
    }

    
    public JButton getCreateInvoicebtn() {
        return CreateInvoicebtn;
    }

    public JLabel getCustomerNameLabel() {
        return CustomerNameLabel;
    }

    public JTextField getCustomerNameTxt() {
        return CustomerNameTxt;
    }

    public JButton getDeleteInvoicebtn() {
        return DeleteInvoicebtn;
    }

    public JLabel getInvoiceDateLabel() {
        return InvoiceDateLabel;
    }

    public JTextField getInvoiceDateTxt() {
        return InvoiceDateTxt;
    }

    public JLabel getInvoiceNumberLabel() {
        return InvoiceNumberLabel;
    }

    public JTextField getInvoiceNumberTxt() {
        return InvoiceNumberTxt;
    }

    public JLabel getInvoiceTotalLabel() {
        return InvoiceTotalLabel;
    }

    public JTextField getInvoiceTotalTxt() {
        return InvoiceTotalTxt;
    }

    public JTable getItemsTable() {
        return ItemsTable;
    }

    public JMenuItem getLoadMenuItem() {
        return LoadMenuItem;
    }

    public JMenuItem getSaveMenuItem() {
        return SaveMenuItem;
    }

    public JButton getCreateNewItemBtn() {
        return createNewItemBtn;
    }

    public JButton getDeleteItemBtn() {
        return deleteItemBtn;
    }

    public JTable getHeaderTable() {
        return headerTable;
    }


    public List<InvoiceHeader> getAllInvList() {
        return allInvList;
    }

    public InvoiceHeaderTable getInvoiceHeaderTable() {
        return InvoiceHeaderTable;
    }

    public InvoiceItemsTable getInvoiceItemsTable() {
        return InvoiceItemsTable;
    }

    public NewHeaderFrame getNewInvoiceDialog() {
        return newInvoiceDialog;
    }

    public NewItemFrame getNewItemDialog() {
        return newItemDialog;
    }

    public Actions getListner() {
        return listner;
    }


}
