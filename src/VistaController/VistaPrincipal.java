/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaController;

/**
 *
 * @author Cakri
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        apartadoDeVentas();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnMain = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        cbmInventario = new javax.swing.JCheckBoxMenuItem();
        cbmProveedor = new javax.swing.JCheckBoxMenuItem();
        cbmReportes = new javax.swing.JCheckBoxMenuItem();
        cbmProductos = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpnMainLayout = new javax.swing.GroupLayout(dpnMain);
        dpnMain.setLayout(dpnMainLayout);
        dpnMainLayout.setHorizontalGroup(
            dpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );
        dpnMainLayout.setVerticalGroup(
            dpnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );

        jMenu3.setText("MENU PRINCIPAL");

        cbmInventario.setSelected(true);
        cbmInventario.setText("Inventario");
        cbmInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmInventarioActionPerformed(evt);
            }
        });
        jMenu3.add(cbmInventario);

        cbmProveedor.setSelected(true);
        cbmProveedor.setText("Proveedor");
        cbmProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmProveedorActionPerformed(evt);
            }
        });
        jMenu3.add(cbmProveedor);

        cbmReportes.setSelected(true);
        cbmReportes.setText("Reportes");
        cbmReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmReportesActionPerformed(evt);
            }
        });
        jMenu3.add(cbmReportes);

        cbmProductos.setSelected(true);
        cbmProductos.setText("Productos");
        cbmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmProductosActionPerformed(evt);
            }
        });
        jMenu3.add(cbmProductos);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpnMain)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmProductosActionPerformed
        ProductosView productos = new ProductosView();
        dpnMain.add(productos);
        productos.setVisible(true);
    }//GEN-LAST:event_cbmProductosActionPerformed

    private void cbmProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmProveedorActionPerformed
        ProveedorView proveedor = new ProveedorView();
        dpnMain.add(proveedor);
        proveedor.setVisible(true);
    }//GEN-LAST:event_cbmProveedorActionPerformed

    private void cbmInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmInventarioActionPerformed
        InventarioView inventario = new InventarioView();
        dpnMain.add(inventario);
        inventario.setVisible(true);
    }//GEN-LAST:event_cbmInventarioActionPerformed

    private void cbmReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmReportesActionPerformed
        ReportesView reportes = new ReportesView();
        dpnMain.add(reportes);
        reportes.setVisible(true);
    }//GEN-LAST:event_cbmReportesActionPerformed

    private void apartadoDeVentas(){
        VentasView ventas = new VentasView();
        dpnMain.add(ventas);
        ventas.setVisible(true);
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem cbmInventario;
    private javax.swing.JCheckBoxMenuItem cbmProductos;
    private javax.swing.JCheckBoxMenuItem cbmProveedor;
    private javax.swing.JCheckBoxMenuItem cbmReportes;
    private javax.swing.JDesktopPane dpnMain;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
