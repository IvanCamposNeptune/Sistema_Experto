package Ventanas;


import static conexion.conexion.getConection;
import static conexion.conexion.ps;
import static conexion.conexion.rs;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



import javax.swing.JOptionPane;

import org.jfugue.player.Player;


public class Botones extends javax.swing.JFrame {
    
    login lg = new login();
    String usuario = lg.User;
    
    //variable contadora global
    int cont = 0;
    
    //Arrego reescribible de acordes    
    String acordes[] = new String[3];
    
    

    public Botones() { //Metodo constructor del JFrame
        initComponents();
        this.setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(null, "Toque tres notas que conformen un acorde");
    }
    
    
    public Player player = new Player(); //Objeto de tipo player para sonido
    
    
    
    public void verificarBotones() throws SQLException{

        if(cont==3){
            desactivar();
            cont=0;
            musica();
        }
       
        
    }
    
    //Metodo musica
    public void musica() throws SQLException{
        JOptionPane.showMessageDialog(null,"Notas tocadas: "+acordes[0] + " " + acordes[1] + " " + acordes[2]);
        
        //Castear Arreglo
        
        Sistema_Experto se = new Sistema_Experto(); //Objeto de clase
        String resultado="";
        resultado=se.Acorde(acordes[0] , acordes[1], acordes[2]);
        
        if(resultado==null){
        JOptionPane.showMessageDialog(null, "No es un acorde de triada");
        }else{
                
        //Tocando Acordes Encontrados
        
        //Reproduciendo Acordes de DO
        if(resultado=="Do Mayor"){
            player.play("Cmajw");
        }
        
        if(resultado=="Do Menor"){
            player.play("Cminw");
        }
        
        //Reproduciendo Acordes de RE
        if(resultado=="Re Mayor"){
            player.play("Dmajw");
        }
        
        if(resultado=="Re Menor"){
            player.play("Dminw");
        }
        
        //Reproduciendo Acordes de MI
        if(resultado=="Mi Mayor"){
            player.play("Emajw");
        }
        
        if(resultado=="Mi Menor"){
            player.play("Eminw");
        }
        
        //Reproduciendo Acordes de FA
        if(resultado=="Fa Mayor"){
            player.play("Fmajw");
        }
        
        if(resultado=="Fa Menor"){
            player.play("Fminw");
        }
        
        //Reproduciendo Acordes de SOL
        if(resultado=="Sol Mayor"){
            player.play("Gmajw");
        }
        
        if(resultado=="Sol Menor"){
            player.play("Gminw");
        }
        
        //Reproduciendo Acordes de LA
        if(resultado=="La Mayor"){
            player.play("Amajw");
        }
        
        if(resultado=="La Menor"){
            player.play("Aminw");
        }
        
        //Reproduciendo Acordes de SI
        if(resultado=="Si Mayor"){
            player.play("Bmajw");
        }
        
        if(resultado=="Si Menor"){
            player.play("Bminw");
        }
        
        
        JOptionPane.showMessageDialog(null,"Ha tocado el acorde de: " + resultado);
        
        
        
        //Registro de usuario y acorde en la base de datos
        Connection con = getConection(); //Abriendo la conexion
        
        try {
            /// Registro Usuario y Acorde tocado
            
            ps = con.prepareStatement("insert into acordes_alumnos(nombre_usuario,acorde_tocado) values (?,?);");
            
            System.out.println("Aquí si llega 1 " + ps);        
            ps.setString(1, usuario);
            ps.setString(2, resultado);
            ps.execute();
            System.out.println("Aquí si llega 2 "+ps.toString());
            JOptionPane.showMessageDialog(null,"Acorde tocado registrado en la base de datos.");
            con.close(); //Cerrando conexion
        } catch (SQLException ex) {
            Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error en registro");
        }
        
        
        
        
        
        }
   
                
        
        activar();
    }
    
    
    //Metodo para desactivar componentes
    public void desactivar(){
        btn_Do.setEnabled(false);
        btn_Re.setEnabled(false);
        btn_Mi.setEnabled(false);
        btn_Fa.setEnabled(false);
        btn_Sol.setEnabled(false);
        btn_La.setEnabled(false);
        btn_Si.setEnabled(false);
        btn_Do_s.setEnabled(false);
        btn_Re_s.setEnabled(false);
        btn_Fa_s.setEnabled(false);
        btn_Sol_s.setEnabled(false);
        btn_La_s.setEnabled(false);
    }
    
    //Metodo para activar componentes
    public void activar(){
        btn_Do.setEnabled(true);
        btn_Re.setEnabled(true);
        btn_Mi.setEnabled(true);
        btn_Fa.setEnabled(true);
        btn_Sol.setEnabled(true);
        btn_La.setEnabled(true);
        btn_Si.setEnabled(true);
        btn_Do_s.setEnabled(true);
        btn_Re_s.setEnabled(true);
        btn_Fa_s.setEnabled(true);
        btn_Sol_s.setEnabled(true);
        btn_La_s.setEnabled(true);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_La_s = new javax.swing.JButton();
        btn_Sol_s = new javax.swing.JButton();
        btn_Fa_s = new javax.swing.JButton();
        btn_Re_s = new javax.swing.JButton();
        btn_Do_s = new javax.swing.JButton();
        btn_Si = new javax.swing.JButton();
        btn_La = new javax.swing.JButton();
        btn_Sol = new javax.swing.JButton();
        btn_Fa = new javax.swing.JButton();
        btn_Mi = new javax.swing.JButton();
        btn_Re = new javax.swing.JButton();
        btn_Do = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Piano Experto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_La_s.setBackground(new java.awt.Color(0, 0, 0));
        btn_La_s.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        btn_La_s.setForeground(new java.awt.Color(255, 255, 255));
        btn_La_s.setText("LA#");
        btn_La_s.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btn_La_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_La_sActionPerformed(evt);
            }
        });
        jPanel1.add(btn_La_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 50, 150));

        btn_Sol_s.setBackground(new java.awt.Color(0, 0, 0));
        btn_Sol_s.setFont(new java.awt.Font("Dialog", 0, 8)); // NOI18N
        btn_Sol_s.setForeground(new java.awt.Color(255, 255, 255));
        btn_Sol_s.setText("SOL#");
        btn_Sol_s.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btn_Sol_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Sol_sActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Sol_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 50, 150));

        btn_Fa_s.setBackground(new java.awt.Color(0, 0, 0));
        btn_Fa_s.setForeground(new java.awt.Color(255, 255, 255));
        btn_Fa_s.setText("FA#");
        btn_Fa_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Fa_sActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Fa_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 150));

        btn_Re_s.setBackground(new java.awt.Color(0, 0, 0));
        btn_Re_s.setForeground(new java.awt.Color(255, 255, 255));
        btn_Re_s.setText("RE#");
        btn_Re_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Re_sActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Re_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 150));

        btn_Do_s.setBackground(new java.awt.Color(0, 0, 0));
        btn_Do_s.setForeground(new java.awt.Color(255, 255, 255));
        btn_Do_s.setText("DO#");
        btn_Do_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Do_sActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Do_s, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 150));

        btn_Si.setBackground(new java.awt.Color(255, 255, 255));
        btn_Si.setText("SI");
        btn_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Si, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 70, 320));

        btn_La.setBackground(new java.awt.Color(255, 255, 255));
        btn_La.setText("LA");
        btn_La.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_La, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 70, 320));

        btn_Sol.setBackground(new java.awt.Color(255, 255, 255));
        btn_Sol.setText("SOL");
        btn_Sol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SolActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Sol, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 70, 320));

        btn_Fa.setBackground(new java.awt.Color(255, 255, 255));
        btn_Fa.setText("FA");
        btn_Fa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Fa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 70, 320));

        btn_Mi.setBackground(new java.awt.Color(255, 255, 255));
        btn_Mi.setText("MI");
        btn_Mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MiActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 70, 320));

        btn_Re.setBackground(new java.awt.Color(255, 255, 255));
        btn_Re.setText("RE");
        btn_Re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Re, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 70, 320));

        btn_Do.setBackground(new java.awt.Color(255, 255, 255));
        btn_Do.setText("DO");
        btn_Do.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Do, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_DoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DoActionPerformed
        player.play("C");
        System.out.println(cont);
        acordes[cont]="Do";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_DoActionPerformed
  
    private void btn_MiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MiActionPerformed
        player.play("E");
        System.out.println(cont);
        acordes[cont]="Mi";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_MiActionPerformed

    private void btn_SolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SolActionPerformed
        player.play("G");
        System.out.println(cont);
        acordes[cont]="Sol";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_SolActionPerformed

    private void btn_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiActionPerformed
        player.play("B");
        System.out.println(cont);
        acordes[cont]="Si";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_SiActionPerformed

    private void btn_ReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReActionPerformed
        player.play("D");
        System.out.println(cont);
        acordes[cont]="Re";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_ReActionPerformed

    private void btn_FaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FaActionPerformed
        player.play("F");
        System.out.println(cont);
        acordes[cont]="Fa";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_FaActionPerformed

    private void btn_LaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LaActionPerformed
        player.play("A");
        System.out.println(cont);
        acordes[cont]="La";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_LaActionPerformed

    private void btn_Do_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Do_sActionPerformed
        player.play("C#");
        System.out.println(cont);
        acordes[cont]="Do#";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_Do_sActionPerformed

    private void btn_Re_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Re_sActionPerformed
        player.play("D#");
        System.out.println(cont);
        acordes[cont]="Re#";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_Re_sActionPerformed

    private void btn_Fa_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Fa_sActionPerformed
        player.play("F#");
        System.out.println(cont);
        acordes[cont]="Fa#";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_Fa_sActionPerformed

    private void btn_Sol_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Sol_sActionPerformed
        player.play("G#");
        System.out.println(cont);
        acordes[cont]="Sol#";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_Sol_sActionPerformed

    private void btn_La_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_La_sActionPerformed
        player.play("A#");
        System.out.println(cont);
        acordes[cont]="La#";
        cont++;
        try
        {
            verificarBotones();
        } catch (SQLException ex)
        {
            Logger.getLogger(Botones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_La_sActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Botones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Botones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Botones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Botones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Botones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Do;
    private javax.swing.JButton btn_Do_s;
    private javax.swing.JButton btn_Fa;
    private javax.swing.JButton btn_Fa_s;
    private javax.swing.JButton btn_La;
    private javax.swing.JButton btn_La_s;
    private javax.swing.JButton btn_Mi;
    private javax.swing.JButton btn_Re;
    private javax.swing.JButton btn_Re_s;
    private javax.swing.JButton btn_Si;
    private javax.swing.JButton btn_Sol;
    private javax.swing.JButton btn_Sol_s;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
