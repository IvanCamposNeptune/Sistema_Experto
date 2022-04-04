/*
 * Universidad Autonoma del Estado de Hidalgo
 * Sistema Experto Identificación de Acordes de triada
 */
package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;






public class Inicial extends javax.swing.JFrame {
 
    login lg = new login();
    String usuario = lg.User;

    
    public Inicial() {
        initComponents();
        ImageIcon imagen1= new ImageIcon(getClass().getResource("/imagenes/descarga.jpeg"));
        Icon fondo1=new ImageIcon(imagen1.getImage().getScaledInstance(lblimagen1.getWidth(), lblimagen1.getHeight(), Image.SCALE_DEFAULT));
        lblimagen1.setIcon(fondo1);
        ImageIcon imagen2= new ImageIcon(getClass().getResource("/imagenes/uaeh_logo_color.png"));
        Icon fondo2=new ImageIcon(imagen2.getImage().getScaledInstance(lblimagen2.getWidth(), lblimagen2.getHeight(), Image.SCALE_DEFAULT));
        lblimagen2.setIcon(fondo2);
        ImageIcon imagen3= new ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"));
        Icon fondoa=new ImageIcon(imagen3.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(fondoa);
        this.setLocationRelativeTo(null);
        jLabel6.setText("Usuario: " + usuario);
        
                
        if(jLabel6.getText().equals("Usuario: Desconocido")){
            BtnUser.setEnabled(false);
        }
        else{
            BtnUser.setEnabled(true);
        }
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblimagen1 = new javax.swing.JLabel();
        lblimagen2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtnUser = new javax.swing.JButton();
        Btnlog = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Experto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Yadhira Villeda Trejo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Ivan Felipe Campos Esparza ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Jose Luis Alvarez Roldan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));
        getContentPane().add(lblimagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 17, 154, 129));
        getContentPane().add(lblimagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 251, 155));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Docente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Martha Idalid Gonzales Rivera");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        BtnUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnUser.setText("Sistema Experto");
        BtnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUserActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        Btnlog.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Btnlog.setText("Iniciar Sesión");
        Btnlog.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnlogActionPerformed(evt);
            }
        });
        getContentPane().add(Btnlog, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 150, 20));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 590, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUserActionPerformed
               
        Botones principal = new Botones();
        principal.setVisible(true);
        
    }//GEN-LAST:event_BtnUserActionPerformed

    private void BtnlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnlogActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new login().setVisible(true);
    }//GEN-LAST:event_BtnlogActionPerformed


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
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUser;
    private javax.swing.JButton Btnlog;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblimagen1;
    private javax.swing.JLabel lblimagen2;
    // End of variables declaration//GEN-END:variables
}
