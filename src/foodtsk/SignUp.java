/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodtsk;

import DB.ConnectDB;
import Dao.UserDao;
import EndCode.Md5;
import Model.Role;
import Model.User;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import keeptoo.KGradientPanel;


public class SignUp extends javax.swing.JFrame {
    private UserDao userDao;
    
    /**
     * Creates new form SignUp
     */
    public SignUp() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        TextFieldUsername = new javax.swing.JTextField();
        TextFieldPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        kButton2 = new keeptoo.KButton();
        jLabel4 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 204, 102));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kGradientPanel1KeyPressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextFieldUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextFieldUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextFieldUsername.setCaretColor(new java.awt.Color(255, 153, 0));
        TextFieldUsername.setOpaque(false);
        TextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsernameActionPerformed(evt);
            }
        });
        kGradientPanel1.add(TextFieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 440, 31));

        TextFieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TextFieldPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        TextFieldPassword.setCaretColor(new java.awt.Color(255, 153, 0));
        TextFieldPassword.setOpaque(false);
        kGradientPanel1.add(TextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 440, 30));

        jLabel1.setText("password");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        kButton2.setText("SignIn");
        kButton2.setkBorderRadius(40);
        kButton2.setkEndColor(new java.awt.Color(255, 204, 204));
        kButton2.setkFillButton(false);
        kButton2.setkForeGround(new java.awt.Color(0, 0, 0));
        kButton2.setkHoverEndColor(new java.awt.Color(255, 204, 204));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(0, 0, 0));
        kButton2.setkSelectedColor(new java.awt.Color(255, 255, 255));
        kButton2.setkStartColor(new java.awt.Color(255, 153, 0));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 160, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user (1).png")));
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 50, 100));

        btn_exit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        btn_exit.setText("X");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        kGradientPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Food Shop by nhóm 6");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 370, 40));

        jLabel8.setText("username");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 544));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
        new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        // TODO add your handling code here:
        new Drag(kGradientPanel1).onPress(evt);
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        // TODO add your handling code here:
        userDao=new UserDao();
        String username= TextFieldUsername.getText();
        String password=TextFieldPassword.getText();
        if (userDao.login(username, password)==true) {
            try {
                User user=userDao.getUserLogined(username, password);
                Role role=new Role(user.getRole());
                try {
                    new Home().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
             JOptionPane.showMessageDialog(null, "Login Fails");
        }
        
    }//GEN-LAST:event_kButton2ActionPerformed

    private void TextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsernameActionPerformed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_exitMouseClicked

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextFieldPassword;
    private javax.swing.JTextField TextFieldUsername;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private keeptoo.KButton kButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables

    private static class Drag {

        public Drag(KGradientPanel kGradientPanel1) {
        }

        private void moveWindow(MouseEvent evt) {
            //To change body of generated methods, choose Tools | Templates.
        }

        private void onPress(MouseEvent evt) {
           //To change body of generated methods, choose Tools | Templates.
        }
    }
}
