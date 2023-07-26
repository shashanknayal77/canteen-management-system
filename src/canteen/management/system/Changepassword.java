/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen.management.system;

import dao.userdao;

/**
 *
 * @author user
 */
public class Changepassword extends javax.swing.JFrame {

    public String useremail;

    /**
     * Creates new form Changepassword
     */
    public Changepassword() {
        initComponents();
    }

    public Changepassword(String email) {
        initComponents();
        useremail = email;
        btnupdate.setEnabled(false);
    }

    public void Validatefields() {
        String oldpassword = txtold.getText();
        String newpassword = txtnew.getText();
        String confirmpassword = txtconfirm.getText();
        if (!oldpassword.equals("") && !newpassword.equals("") && !confirmpassword.equals("") && newpassword.equals(confirmpassword)) {
            btnupdate.setEnabled(true);
        } else {
            btnupdate.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtold = new javax.swing.JPasswordField();
        txtnew = new javax.swing.JPasswordField();
        txtconfirm = new javax.swing.JPasswordField();
        btnupdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        jLabel1.setText("Change Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Old Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 248, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Confirm Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 309, -1, -1));

        txtold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtoldKeyReleased(evt);
            }
        });
        getContentPane().add(txtold, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 190, 240, -1));

        txtnew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnewKeyReleased(evt);
            }
        });
        getContentPane().add(txtnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 248, 240, -1));

        txtconfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtconfirmKeyReleased(evt);
            }
        });
        getContentPane().add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 309, 240, -1));

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 359, -1, -1));

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-350, 0, 1310, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtoldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtoldKeyReleased
        Validatefields(); // TODO add your handling code here:
    }//GEN-LAST:event_txtoldKeyReleased

    private void txtnewKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnewKeyReleased
        Validatefields(); // TODO add your handling code here:
    }//GEN-LAST:event_txtnewKeyReleased

    private void txtconfirmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconfirmKeyReleased
        Validatefields();// TODO add your handling code here:
    }//GEN-LAST:event_txtconfirmKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        setVisible(false);
        new Changepassword(useremail).setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String oldpassword = txtold.getText();
        String newpassword = txtnew.getText();
        String confirmpassword = txtconfirm.getText();
        userdao.Changepassword(useremail, oldpassword, newpassword);
        setVisible(false);
        new Changepassword(useremail).setVisible(true);
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(Changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Changepassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Changepassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtconfirm;
    private javax.swing.JPasswordField txtnew;
    private javax.swing.JPasswordField txtold;
    // End of variables declaration//GEN-END:variables
}
