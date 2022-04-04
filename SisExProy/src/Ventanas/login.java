package Ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import static conexion.conexion.getConection;
import static conexion.conexion.ps;
import static conexion.conexion.rs;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class login extends javax.swing.JFrame {
    
    //Variables globales
     public static String User = "Desconocido";

    
    public login() {
        initComponents();
        ImageIcon imagen= new ImageIcon(getClass().getResource("/imagenes/Fondo.jpg"));
        Icon fondo=new ImageIcon(imagen.getImage().getScaledInstance(Fondo.getWidth(), Fondo.getHeight(), Image.SCALE_DEFAULT));
        Fondo.setIcon(fondo);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtUser = new javax.swing.JTextField();
        TxtPass = new javax.swing.JPasswordField();
        BtnOk = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        BtnRegistro = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        TxtUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TxtUser.setToolTipText("");
        TxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUserActionPerformed(evt);
            }
        });

        TxtPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TxtPass.setText("jPasswordField1");
        TxtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxtPassMouseClicked(evt);
            }
        });
        TxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPassActionPerformed(evt);
            }
        });

        BtnOk.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnOk.setText("Aceptar");
        BtnOk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOkActionPerformed(evt);
            }
        });

        BtnAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnAtras.setText("Atras");
        BtnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        BtnRegistro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BtnRegistro.setText("Registrarse");
        BtnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BtnAtras))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel1))
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtUser)
                            .addComponent(TxtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegistro)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(BtnOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtUser))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BtnOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAtras)
                    .addComponent(BtnRegistro))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        BtnOk.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 330, 210));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 531, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUserActionPerformed

    private void BtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOkActionPerformed
        // TODO add your handling code here:
        try
        {
            validar_usuario();

        } catch (SQLException ex)
        {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
    }                                           

    public void validar_usuario() throws SQLException{
               
        
        Connection con = getConection(); //Abriendo la conexion
        
        int resultado = 0;
        String user = String.valueOf(TxtUser.getText());
        String pass =  String.valueOf(TxtPass.getPassword());
        
        ps = con.prepareStatement("select * from login where nombre_usuario='"+user+"' and contrasenia='"+pass+"';");
        //ps = con.prepareStatement("select * from login where nombre_usuario='Ivan' and contrasenia='nobodyloveme';");
        rs=ps.executeQuery();
       
        
        if(rs.next()){
            
            JOptionPane.showMessageDialog(null, "Usuario: " + user);
            
            User=user;//Asignando a variable global            
                
            
            resultado = Integer.parseInt(rs.getString("fk_tipo_usuario"));
            
            switch (resultado) {
                case 1:
                    {
                        /*Administrador principal = new Administrador();
                        principal.setVisible(true);
                        this.dispose();*/
                        this.setVisible(false);                        
                        
                        Inicial principal = new Inicial();
                        principal.setVisible(true);
                        System.out.println("Si funciono...");
                        resultado=0;
                        con.close(); //Cerrando conexion
                        break;
                    }
                case 2:
                    {
                        Usuario principal = new Usuario();
                        principal.setVisible(true);
                        this.dispose();
                        System.out.println("Si funciono...");
                        resultado=0;
                        con.close(); //Cerrando conexion
                        break;
                    }
                default:
                    JOptionPane.showMessageDialog(null,"Error de acceso a la base de datos");
                    break;
            }
            
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
            TxtUser.setText("");
            TxtPass.setText("");
        }
    }//GEN-LAST:event_BtnOkActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Inicial().setVisible(true);
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void TxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPassActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TxtPassActionPerformed

    private void TxtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtPassMouseClicked
        // TODO add your handling code here:
        TxtPass.setText("");
    }//GEN-LAST:event_TxtPassMouseClicked

    private void BtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new registro().setVisible(true);
    }//GEN-LAST:event_BtnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnOk;
    private javax.swing.JButton BtnRegistro;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JTextField TxtUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
