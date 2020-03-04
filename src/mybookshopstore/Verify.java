/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybookshopstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Verify extends javax.swing.JFrame {

    /**
     * Creates new form Verify
     */
    public Verify() {
        initComponents();
           this.setLocationRelativeTo(null);
    }
    
    
    public Connection getConnnection(){
     Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:msql://localhost/bookshop","root","");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(Verify.class.getName()).log(Level.SEVERE, null, ex);
            return null;
           
        }
    
    
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jb_adminlogin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        say = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 250, 250));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER YOUR DETAILS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("USERNAME:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD:");

        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jb_adminlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_adminlogin.setText("ADMIN LOGIN");
        jb_adminlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_adminloginActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("ATT. LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        say.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        say.setForeground(new java.awt.Color(255, 0, 51));
        say.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jb_adminlogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(67, 67, 67))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 150, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(say, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(say, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_adminlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jb_adminloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_adminloginActionPerformed
         Connection conn=null;
         if(username.getText().equals("")||
                 password.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Login Details Required");
         
         }
         else
         {
         
        try {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            String sql="select username,password from admins where username=? and password=?";
            PreparedStatement my=conn.prepareStatement(sql);
            my.setString(1,username.getText());
            my.setString(2,password.getText());
            ResultSet myr=my.executeQuery();
            if(myr.next()){
            new Admin().setVisible(true);
            dispose();
            
            
            }else{
            
           say.setText("Incorrect details");
            username.setText("");
            password.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Verify.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_jb_adminloginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Connection conn=null;
         if(username.getText().equals("")||
                 password.getText().equals("")){
         JOptionPane.showMessageDialog(null,"Login Details Required");
         
         }
         else{
         
         
         
             try 
             {
            conn=DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            String sql="select username,password from attendants where username=? and password=?";
            PreparedStatement my=conn.prepareStatement(sql);
            my.setString(1,username.getText());
            my.setString(2,password.getText());
            ResultSet myr=my.executeQuery();
            if(myr.next()){
           new Attendant().setVisible(true);
           dispose();
            
            
            }
            else{
            
            JOptionPane.showMessageDialog(null,"INCORRECT DETAILS!!!!!");
            username.setText("");
            password.setText("");
            }
            
            
        }
             catch (SQLException ex)
             {
            Logger.getLogger(Verify.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    }
     
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
            java.util.logging.Logger.getLogger(Verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Login s=new Login();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                s.setVisible(true);
            }
        });
      
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_adminlogin;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel say;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
