/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar
     */
    public Eliminar() {
        initComponents();
        this.setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonMenu = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        IngresarID = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        BotonBuscarID = new javax.swing.JButton();
        Encabezado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        InfoID = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        BotonMenu.setBackground(new java.awt.Color(0, 102, 102));
        BotonMenu.setForeground(new java.awt.Color(255, 255, 255));
        BotonMenu.setText("Menu");
        BotonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMenuMouseClicked(evt);
            }
        });
        BotonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuActionPerformed(evt);
            }
        });

        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Ingrese el ID de Empleado:");

        IngresarID.setBackground(new java.awt.Color(51, 51, 51));
        IngresarID.setForeground(new java.awt.Color(153, 153, 153));
        IngresarID.setText("Ingresar ID");
        IngresarID.setBorder(null);
        IngresarID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IngresarIDMousePressed(evt);
            }
        });
        IngresarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarIDActionPerformed(evt);
            }
        });

        BotonBuscarID.setBackground(new java.awt.Color(0, 153, 255));
        BotonBuscarID.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarID.setText("Buscar");
        BotonBuscarID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarIDMouseClicked(evt);
            }
        });
        BotonBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarIDActionPerformed(evt);
            }
        });

        Encabezado.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliminar Usuario");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        InfoID.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(InfoID);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("DNOM-UTH - 2023");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(IngresarID, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(BotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218)
                        .addComponent(BotonBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(IngresarID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addContainerGap())))
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

    private void BotonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMenuMouseClicked
        // TODO add your handling code here:
        Menu menuOpciones = new Menu();
        menuOpciones.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonMenuMouseClicked

    private void BotonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMenuActionPerformed
    private void restablecer() {
        String IDPlaceholder = "Ingresar ID";

        if (IngresarID.getText().isEmpty()) {
            IngresarID.setText(IDPlaceholder);
            IngresarID.setForeground(new Color(153, 153, 153));
        }
    }
    private Empleados buscarEmpleadoPorID(String idBuscado) {
        List<Empleados> listadatos = Datos.obtenerListaEmpleados();

        for (Empleados empleado : listadatos) {
            if (empleado.getID().equals(idBuscado)) {
                return empleado;
            }
        }
        return null;
    }
    private void IngresarIDMousePressed(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        if (IngresarID.getText().equals("Ingresar ID")){
            IngresarID.setText("");
            IngresarID.setForeground(Color.white);
        }else{
            restablecer();
        }
    }//GEN-LAST:event_IngresarIDMousePressed

    private void IngresarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarIDActionPerformed

    private void BotonBuscarIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarIDMouseClicked
        // TODO add your handling code here:
        String idBuscado = IngresarID.getText();

        // Realiza la búsqueda en la lista de empleados
        Empleados empleadoEncontrado = buscarEmpleadoPorID(idBuscado);

        // Si se encontró el empleado, muestra la información en el JTextPane
        if (empleadoEncontrado != null) {
            String infoEmpleado = "ID: " + empleadoEncontrado.getID() + "\n";
            infoEmpleado += "Nombre: " + empleadoEncontrado.getNombre() + "\n";
            infoEmpleado += "Edad: " + empleadoEncontrado.getEdad() + "\n";
            infoEmpleado += "DNI: " + empleadoEncontrado.getDni() + "\n";
            infoEmpleado += "Tipo: " + empleadoEncontrado.getTipo() + "\n";
            infoEmpleado += "Fecha: " + empleadoEncontrado.getFecha() + "\n";
            infoEmpleado += "Salario: " + empleadoEncontrado.getSalario() + "\n";
            infoEmpleado += "Cargo: " + empleadoEncontrado.getCargo() + "\n";

          // Mostrar el mensaje con la información del empleado y opciones de eliminar o cancelar
            int option = JOptionPane.showOptionDialog(this, infoEmpleado, "Información del Empleado",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    new Object[]{"Eliminar", "Cancelar"}, null);

            if (option == JOptionPane.YES_OPTION) {
                // Si el usuario selecciona "Eliminar", proceder con la lógica de eliminación del empleado
                eliminarEmpleado(empleadoEncontrado);
            }
        } else {
            // Si no se encontró el empleado, mostrar un mensaje en el JTextPane
            InfoID.setText("Empleado no encontrado.");
            JOptionPane.showMessageDialog(this, "El empleado no se encuentra en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonBuscarIDMouseClicked

    private void BotonBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBuscarIDActionPerformed

    /**
     * @param empleado El empleado a eliminar.
     * @param args the command line arguments
     */
    private void eliminarEmpleado(Empleados empleado) {
    // Verifica si la lista contiene el empleado antes de eliminarlo
    List<Empleados> listadatos = Datos.obtenerListaEmpleados();
    if (listadatos.contains(empleado)) {
        // Elimina el empleado de la lista
        listadatos.remove(empleado);

        // Muestra un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Empleado eliminado correctamente.", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);

        // Limpia el campo de ingreso del ID
        IngresarID.setText("Ingresar ID");
        IngresarID.setForeground(new Color(153, 153, 153));

        // Limpia el JTextPane
        InfoID.setText("");
    } else {
        // Si el empleado no se encuentra en la lista, muestra un mensaje de error
        JOptionPane.showMessageDialog(this, "El empleado no se encuentra en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

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
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscarID;
    private javax.swing.JButton BotonMenu;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JTextPane InfoID;
    private javax.swing.JTextField IngresarID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables
}
