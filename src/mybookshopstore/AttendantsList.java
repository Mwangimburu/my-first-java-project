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
public class AttendantsList extends javax.swing.JFrame {

    
    public AttendantsList() {
        initComponents();
        att();
           this.setLocationRelativeTo(null);
    }
   public Connection getConnection(){
   Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:msql://localhost/bookshop");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(AttendantsList.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
   
   
   
   
   
   
   }
   public void att(){
    Connection con;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root","");
            String sql="select firstname,secondname,username from attendants";
            PreparedStatement pstm =con.prepareStatement(sql);
            ResultSet rst=pstm.executeQuery();
            table.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rst));
        } catch (SQLException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jb_ATTNAMES = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jb_ATTNAMES.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb_ATTNAMES.setIcon(new javax.swing.ImageIcon("C:\\Users\\Christopher Mburu\\Documents\\NetBeansProjects\\products\\src\\icons\\dynamic_blue_left.png")); // NOI18N
        jb_ATTNAMES.setText("BACK");
        jb_ATTNAMES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ATTNAMESActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 24)); // NOI18N
        jLabel1.setText("ATTENDANTS NAMES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jb_ATTNAMES, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jb_ATTNAMES, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jb_ATTNAMESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ATTNAMESActionPerformed
        new Registration().setVisible(true);
        dispose();
    }//GEN-LAST:event_jb_ATTNAMESActionPerformed

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
            java.util.logging.Logger.getLogger(AttendantsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendantsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendantsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendantsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendantsList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_ATTNAMES;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
