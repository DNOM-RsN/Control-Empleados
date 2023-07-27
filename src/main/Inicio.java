/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Inicio extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    private boolean isLoggedIn = false;
    private Menu menuOpciones;
    public Inicio() {
        initComponents();

       // TxtUsuario = new javax.swing.JTextField();
      //  TxtContra = new javax.swing.JPasswordField();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtUsuario = new javax.swing.JTextField();
        BotonIniciarS = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        TxtContra = new javax.swing.JPasswordField();
        Encabezado = new javax.swing.JPanel();
        PanelSalir = new javax.swing.JPanel();
        Salir = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2 logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Iniciar Sesión");
        jLabel2.setName("Inicio de Sesion"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Usuario");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contraseña");

        TxtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        TxtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        TxtUsuario.setText("Ingresar Usuario");
        TxtUsuario.setBorder(null);
        TxtUsuario.setCaretColor(new java.awt.Color(102, 102, 102));
        TxtUsuario.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        TxtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtUsuarioMousePressed(evt);
            }
        });
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        BotonIniciarS.setBackground(new java.awt.Color(0, 102, 255));
        BotonIniciarS.setForeground(new java.awt.Color(255, 255, 255));
        BotonIniciarS.setText("Iniciar Sesion");
        BotonIniciarS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIniciarS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIniciarSMouseClicked(evt);
            }
        });
        BotonIniciarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarSActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        TxtContra.setBackground(new java.awt.Color(51, 51, 51));
        TxtContra.setForeground(new java.awt.Color(153, 153, 153));
        TxtContra.setText("**********");
        TxtContra.setBorder(null);
        TxtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtContraMousePressed(evt);
            }
        });

        Encabezado.setBackground(new java.awt.Color(51, 51, 51));
        Encabezado.setForeground(new java.awt.Color(51, 51, 51));
        Encabezado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Encabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EncabezadoMouseDragged(evt);
            }
        });
        Encabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EncabezadoMousePressed(evt);
            }
        });

        PanelSalir.setBackground(new java.awt.Color(51, 51, 51));
        PanelSalir.setForeground(new java.awt.Color(51, 51, 51));
        PanelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Salir.setBackground(new java.awt.Color(51, 51, 51));
        Salir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(204, 204, 204));
        Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Salir.setText("X");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelSalirLayout = new javax.swing.GroupLayout(PanelSalir);
        PanelSalir.setLayout(PanelSalirLayout);
        PanelSalirLayout.setHorizontalGroup(
            PanelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );
        PanelSalirLayout.setVerticalGroup(
            PanelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSalirLayout.createSequentialGroup()
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("DNOM - UTH - 2023");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(47, 47, 47)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(BotonIniciarS)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtContra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(381, 381, 381))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5)
                                .addComponent(TxtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonIniciarS)))
                        .addGap(44, 44, 44)))
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(107, 107, 107))
        );

        jLabel1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncabezadoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_EncabezadoMousePressed

    private void EncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_EncabezadoMouseDragged

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        PanelSalir.setBackground(Color.red);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        PanelSalir.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_SalirMouseExited

    private void BotonIniciarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonIniciarSActionPerformed

    private void BotonIniciarSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos: \nUsuario: "+TxtUsuario.getText()+ "\nContraseña: "+String.valueOf(TxtContra.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        if (TxtUsuario.getText().equals("admin") && String.valueOf(TxtContra.getPassword()).equals("admin")) {
            isLoggedIn = true;
            this.setVisible(false);
            menuOpciones = new Menu(/*RegistrarNombre, RegistrarEdad, RegistrarDNI, RegistrarTipo, RegistrarSalario, RegistrarFecha, TxtUsuario, TxtContra*/);
            menuOpciones.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_BotonIniciarSMouseClicked

    private void TxtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtContraMousePressed
        if (String.valueOf(TxtContra.getPassword()).equals("**********")){
            TxtContra.setText("");
            TxtContra.setForeground(Color.white);
        }
        if (TxtUsuario.getText().isEmpty()){
            TxtUsuario.setText("Ingresar Usuario");
            TxtUsuario.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_TxtContraMousePressed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void TxtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtUsuarioMousePressed
        if (TxtUsuario.getText().equals("Ingresar Usuario")){
            TxtUsuario.setText("");
            TxtUsuario.setForeground(Color.white);

        }
        if (String.valueOf(TxtContra.getPassword()).isEmpty()){
            TxtContra.setText("**********");
            TxtContra.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_TxtUsuarioMousePressed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciarS;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel PanelSalir;
    private javax.swing.JLabel Salir;
    private javax.swing.JPasswordField TxtContra;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
