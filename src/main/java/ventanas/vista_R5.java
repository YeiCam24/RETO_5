
package ventanas;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author MaSTeR-Y
 */
public class vista_R5 extends javax.swing.JFrame {

    
    public vista_R5() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("../img/miLogo.jpg"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRequerimiento2 = new javax.swing.JButton();
        btnRequerimiento3 = new javax.swing.JButton();
        btnRequerimiento1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_inferiro_DE = new javax.swing.JLabel();
        jLabel_superior_IZ = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_salir.setBackground(new java.awt.Color(51, 51, 51));
        jButton_salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_cerrar_full.png"))); // NOI18N
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 70, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 40));

        btnRequerimiento2.setBackground(new java.awt.Color(51, 51, 51));
        btnRequerimiento2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRequerimiento2.setForeground(new java.awt.Color(255, 255, 255));
        btnRequerimiento2.setText("REQUERIMIENTO 2");
        btnRequerimiento2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequerimiento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 180, 50));

        btnRequerimiento3.setBackground(new java.awt.Color(51, 51, 51));
        btnRequerimiento3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRequerimiento3.setForeground(new java.awt.Color(255, 255, 255));
        btnRequerimiento3.setText("REQUERIMIENTO 3");
        btnRequerimiento3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequerimiento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 170, 50));

        btnRequerimiento1.setBackground(new java.awt.Color(51, 51, 51));
        btnRequerimiento1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRequerimiento1.setForeground(new java.awt.Color(255, 255, 255));
        btnRequerimiento1.setText("REQUERIMIENTO 1");
        btnRequerimiento1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRequerimiento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Realizado por Yeison Camilo ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jLabel_inferiro_DE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/super Derecha.PNG"))); // NOI18N
        getContentPane().add(jLabel_inferiro_DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel_superior_IZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/superiro IZ.PNG"))); // NOI18N
        getContentPane().add(jLabel_superior_IZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(miTabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 620, 230));

        jLabel_Fondo.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_2.jpg"))); // NOI18N
        jLabel_Fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 643, 409));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void btnRequerimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento3ActionPerformed
        String[] columnNombre = {"ABREV"};
        
        ControladorRequerimientos controlador = new ControladorRequerimientos();

        ArrayList<Requerimiento_3> lista;

        try {
            lista = controlador.consultarRequerimiento3();

            Object[][] datos = new Object[lista.size()][1];
            int index = 0;

            for (Requerimiento_3 r : lista) {
                datos[index][0] = r.getAbrev();
                
                index++;
            }

            DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
            miTabla.setModel(model);
        } catch (SQLException e) {
            System.err.println(e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequerimiento3ActionPerformed

    private void btnRequerimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento2ActionPerformed
        //ventanas_2 abrir = new ventanas_2();
        //abrir.setVisible(true);
        //this.setVisible(false);
        
        String[]columnNombre = {"FEC. INICIO", "CIUDAD", "CONSTRUCTORA", "NOMBRE LIDER",
        "COD. TIPO", "ESTRATO"};
        ControladorRequerimientos controlador = new ControladorRequerimientos();
        
        ArrayList<Requerimiento_2> lista;
        try{
            lista = controlador.consultarRequerimiento2();
            Object[][] datos = new Object[lista.size()][6];
            int index = 0;
            for (Requerimiento_2 r : lista) {
                datos[index][0] = r.getFechaInicial();
                datos[index][1] = r.getNombreCiudad();
                datos[index][2] = r.getConstructora();
                datos[index][3] = r.getNombreLider();
                datos[index][4] = r.getCodigoTipo();
                datos[index][5] = r.getEstrato();
                index++;
        }
         DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
         miTabla.setModel(model);
             
             
        } catch (SQLException e) {
            System.err.println(e);
        }        // TODO add your handling code here:
  
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRequerimiento2ActionPerformed
    
    private void btnRequerimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento1ActionPerformed
        String[]columnNombre = {"FECHA", "ID NOMBRE", "PROVEEDOR", "PAGADO"};
        ControladorRequerimientos controlador = new ControladorRequerimientos();
        
        ArrayList<Requerimiento_1> lista;
        try{
            lista = controlador.consultarRequerimiento1();
            Object[][] datos = new Object[lista.size()][4];
            int index = 0;
            for (Requerimiento_1 r : lista) {
                datos[index][0] = r.getFechaCompra();
                datos[index][1] = r.getCodCompra();
                datos[index][2] = r.getNombreProveedor();
                datos[index][3] = r.getPagado();
                index++;
        }
         DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
         miTabla.setModel(model);
             
             
        } catch (SQLException e) {
            System.err.println(e);
        }
         
    }//GEN-LAST:event_btnRequerimiento1ActionPerformed

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
            java.util.logging.Logger.getLogger(vista_R5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_R5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_R5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_R5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_R5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JButton btnRequerimiento3;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_inferiro_DE;
    private javax.swing.JLabel jLabel_superior_IZ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}
