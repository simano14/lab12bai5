/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.*;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.NotBoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.rmi.server.UnicastRemoteObject;
import java.util.function.Predicate;
//import java.awt.print.Book;
import java.rmi.Remote;
/**
 *
 * @author Pham Tuan
 */
public class BankUser extends javax.swing.JFrame {

    /**
     * Creates new form BankUser
     */
    public BankUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txa_printArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtAccountID = new javax.swing.JTextField();
        btnQrDatabase = new javax.swing.JButton();
        txtAccIDtoDeposit = new javax.swing.JTextField();
        txtAmountToDeposit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeposit = new javax.swing.JButton();
        txtAccIDtoWithDraw = new javax.swing.JTextField();
        txtAmountToWithDraw = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnWithDraw = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txa_printArea.setColumns(20);
        txa_printArea.setRows(5);
        jScrollPane1.setViewportView(txa_printArea);

        jLabel1.setText("Customer ID");

        jLabel2.setText("Account ID");

        btnQrDatabase.setText("Query Database");
        btnQrDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQrDatabaseActionPerformed(evt);
            }
        });

        txtAccIDtoDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccIDtoDepositActionPerformed(evt);
            }
        });

        jLabel3.setText("Account ID to deposit");

        jLabel4.setText("Amount to deposit");

        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        jLabel5.setText("Account ID to withdraw");

        jLabel6.setText("Ammount to with draw");

        btnWithDraw.setText("Withdraw");
        btnWithDraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithDrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAccIDtoDeposit, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtAmountToDeposit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAmountToWithDraw, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(txtAccIDtoWithDraw, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(98, 169, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(195, 195, 195))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnQrDatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(216, 216, 216))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnWithDraw, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAccountID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnQrDatabase)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAccIDtoDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addComponent(txtAmountToDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addComponent(btnDeposit)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccIDtoWithDraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmountToWithDraw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnWithDraw)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
    try
    {
        m_Registry = LocateRegistry.getRegistry("localhost" ,1234);
        m_bankManager = (BankManager) m_Registry.lookup("BankSystem");
    }
    catch (NotBoundException notBoundException) 
    {
    System.out.println("Not Bound: " + notBoundException);
    }
    catch (RemoteException remoteException)
    {
    System.out.println("Remote Exception: " + remoteException);
    }
 }
    private void txtAccIDtoDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccIDtoDepositActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccIDtoDepositActionPerformed

    private void btnQrDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQrDatabaseActionPerformed
        try
 {
 if(txtCustomerID.getText().length() > 0)
 {
 System.out.println("opps: " + txtCustomerID.getText() + "000");
 Client Client = m_bankManager.getClient(txtCustomerID.getText());
 txtCustomerID.setText("");
 System.out.println("Currently in the database there \n is this customer with the requested ID: " + Client.getName());
 txtCustomerID.setText("Currently in the database there \n is this customer with the requested ID: " + Client.getName());
 }
else
 {
 if(txtAccountID.getText().length() > 0)
 {
 Account account = m_bankManager.getAccount(txtAccountID.getText());
 txtAccountID.setText("");
 System.out.println("Currently in the database there is \n this account with the requested ID: " + account.getClient().getName());
txtCustomerID.setText("Currently in the database there is \n this account with the requested ID: " + account.getClient().getName() + "\nBalance: " + account.getBalance());
 }
 }
 }
 catch (RemoteException remoteException)
 {
 }
        
    }//GEN-LAST:event_btnQrDatabaseActionPerformed

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        // TODO add your handling code here:
        try {
            if(txtAccIDtoDeposit.getText().length()>0 && txtAmountToDeposit.getText().length()>0){
                m_bankManager.deposit(txtAccIDtoDeposit.getText(),Float.parseFloat(txtAccIDtoDeposit.getText()));
                Account account = m_bankManager.getAccount(txtAccIDtoDeposit.getText());
                txa_printArea.setText("The account was credited \n as follows"+account.getClient().getName()+"\nBalance:"+account.getBalance());
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }//GEN-LAST:event_btnDepositActionPerformed

    private void btnWithDrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithDrawActionPerformed
        // TODO add your handling code here:
        try {
          if(txtAccIDtoWithDraw.getText().length() > 0 &&
        txtAmountToWithDraw.getText().length() > 0)
         {
         m_bankManager.withdraw(txtAccIDtoWithDraw.getText(),
        Float.parseFloat(txtAmountToWithDraw.getText()));
        Account account = m_bankManager.getAccount(txtAccIDtoWithDraw.getText());
        txa_printArea.setText("The account was credited \n as follows:" +
        account.getClient().getName() + "\nBalance: " + account.getBalance());
         }
         }
         catch (RemoteException remoteException)
         {
         System.err.println(remoteException);
         }
    }//GEN-LAST:event_btnWithDrawActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BankUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnQrDatabase;
    private javax.swing.JButton btnWithDraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txa_printArea;
    private javax.swing.JTextField txtAccIDtoDeposit;
    private javax.swing.JTextField txtAccIDtoWithDraw;
    private javax.swing.JTextField txtAccountID;
    private javax.swing.JTextField txtAmountToDeposit;
    private javax.swing.JTextField txtAmountToWithDraw;
    private javax.swing.JTextField txtCustomerID;
    // End of variables declaration//GEN-END:variables
}
