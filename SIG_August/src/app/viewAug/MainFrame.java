
package app.viewAug;
// Import App Models

import app.modelAug.Header;
import app.modelAug.HeaderTable;
import app.modelAug.ItemsTable;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(listner);
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        InvoiceNumberTxt = new javax.swing.JTextField();
        InvoiceTotalTxt = new javax.swing.JTextField();
        InvoiceDateLabel = new javax.swing.JLabel();
        InvoiceTotalLabel = new javax.swing.JLabel();
        InvoiceDateTxt = new javax.swing.JTextField();
        InvoiceNumberLabel = new javax.swing.JLabel();
        CustomerNameTxt = new javax.swing.JTextField();
        CustomerNameLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadMenuItem = new javax.swing.JMenuItem();
        LoadMenuItem.addActionListener(listner);
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem.addActionListener(listner);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(34, 40, 44));

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

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(headerTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sales Invoice Generator");

        InvoiceNumberTxt.setEditable(false);

        InvoiceTotalTxt.setEditable(false);

        InvoiceDateLabel.setText("Invoice Date");

        InvoiceTotalLabel.setText("Invoice Total");

        InvoiceDateTxt.setEditable(false);

        InvoiceNumberLabel.setText("Invoice Number");

        CustomerNameTxt.setEditable(false);

        CustomerNameLabel.setText("Customer Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Items Table");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InvoiceTotalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvoiceNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(InvoiceDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CustomerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InvoiceNumberTxt)
                            .addComponent(InvoiceDateTxt)
                            .addComponent(CustomerNameTxt)
                            .addComponent(InvoiceTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceNumberLabel)
                    .addComponent(InvoiceNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceDateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvoiceDateLabel))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InvoiceTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InvoiceTotalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(266, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Header Table");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CreateInvoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DeleteInvoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(createNewItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(12, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewItemBtn)
                    .addComponent(deleteItemBtn)
                    .addComponent(DeleteInvoicebtn)
                    .addComponent(CreateInvoicebtn))
                .addGap(14, 14, 14))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    private List<Header> allInvList = new ArrayList<>();
    private HeaderTable InvoiceHeaderTable;
    
    private ItemsTable InvoiceItemsTable;
    private NewHeaderFrame newInvoiceDialog;
    private NewItemFrame newItemDialog;
    private Actions listner = new Actions(this);

    public void setNewInvoiceDialog(NewHeaderFrame newInvoiceDialog) {
        this.newInvoiceDialog = newInvoiceDialog;
    }

    public void setNewItemDialog(NewItemFrame newItemDialog) {
        this.newItemDialog = newItemDialog;
    }

    public void setInvoiceHeaderTable(HeaderTable InvoiceHeaderTable) {
        this.InvoiceHeaderTable = InvoiceHeaderTable;
    }

    public void setInvoiceItemsTable(ItemsTable InvoiceItemsTable) {
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


    public List<Header> getAllInvList() {
        return allInvList;
    }

    public HeaderTable getInvoiceHeaderTable() {
        return InvoiceHeaderTable;
    }

    public ItemsTable getInvoiceItemsTable() {
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
