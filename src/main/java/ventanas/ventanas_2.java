
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
public class ventanas_2 extends javax.swing.JPanel {
    
    /**
     * Creates new form ventanas_2
     */
    public ventanas_2() {
        initComponents();
        //this.setLocationRelativeTo(null);
    }
        public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("../img/miLogo.jpg"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        miTabla2 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        jLabel_superior_IZ = new javax.swing.JLabel();
        jLabel_inferiro_DE = new javax.swing.JLabel();
        mi_nombre = new javax.swing.JLabel();
        jButton_salir = new javax.swing.JButton();
        jLabel_imgEmpresa = new javax.swing.JLabel();
        jDateChooser_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jDateChooser_fecha_final = new com.toedter.calendar.JDateChooser();
        select = new javax.swing.JComboBox<>();
        btnReporte = new javax.swing.JButton();
        jLabel_fecha_uno = new javax.swing.JLabel();
        jLabel_fecha_dos = new javax.swing.JLabel();
        jLabel_Ciudad = new javax.swing.JLabel();
        jButton_Regresar = new javax.swing.JButton();
        jLabel_Fondo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        miTabla2.setViewportView(miTabla);

        add(miTabla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 620, 230));

        jLabel_superior_IZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/superiro IZ.PNG"))); // NOI18N
        add(jLabel_superior_IZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        jLabel_inferiro_DE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/super Derecha.PNG"))); // NOI18N
        add(jLabel_inferiro_DE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        mi_nombre.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        mi_nombre.setForeground(new java.awt.Color(255, 255, 255));
        mi_nombre.setText("Realizado por Yeison Camilo ");
        add(mi_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jButton_salir.setBackground(new java.awt.Color(51, 51, 51));
        jButton_salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_salir.setForeground(new java.awt.Color(255, 255, 255));
        jButton_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_cerrar_full.png"))); // NOI18N
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });
        add(jButton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 60, 50));

        jLabel_imgEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo2.png"))); // NOI18N
        add(jLabel_imgEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, 40));

        jDateChooser_fecha_inicio.setBackground(new java.awt.Color(102, 102, 102));
        add(jDateChooser_fecha_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 30));

        jDateChooser_fecha_final.setBackground(new java.awt.Color(102, 102, 102));
        add(jDateChooser_fecha_final, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 150, 30));

        select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 150, 30));

        btnReporte.setBackground(new java.awt.Color(51, 51, 51));
        btnReporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("REPORTE");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 110, 30));

        jLabel_fecha_uno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_fecha_uno.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fecha_uno.setText("Fecha de inicio");
        add(jLabel_fecha_uno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 20));

        jLabel_fecha_dos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_fecha_dos.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fecha_dos.setText("Fecha final");
        add(jLabel_fecha_dos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 110, 20));

        jLabel_Ciudad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_Ciudad.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Ciudad.setText("Ciudad");
        add(jLabel_Ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 110, 20));

        jButton_Regresar.setBackground(new java.awt.Color(51, 51, 51));
        jButton_Regresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_volve_fullr.png"))); // NOI18N
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });
        add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 60, 50));

        jLabel_Fondo.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo_2.jpg"))); // NOI18N
        jLabel_Fondo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 643, 409));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_salirActionPerformed

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed
        //vista_R5 abrir = new vista_R5();
        //abrir.setVisible(true);
        //this.setVisible(false);
        
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
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
    }//GEN-LAST:event_btnReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_salir;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_final;
    private com.toedter.calendar.JDateChooser jDateChooser_fecha_inicio;
    private javax.swing.JLabel jLabel_Ciudad;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_fecha_dos;
    private javax.swing.JLabel jLabel_fecha_uno;
    private javax.swing.JLabel jLabel_imgEmpresa;
    private javax.swing.JLabel jLabel_inferiro_DE;
    private javax.swing.JLabel jLabel_superior_IZ;
    private javax.swing.JTable miTabla;
    private javax.swing.JScrollPane miTabla2;
    private javax.swing.JLabel mi_nombre;
    private javax.swing.JComboBox<String> select;
    // End of variables declaration//GEN-END:variables
}
