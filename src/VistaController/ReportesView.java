/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VistaController;

import javax.swing.table.DefaultTableModel;
import Model.Producto;
import java.util.ArrayList;
import Controller.ControllerProducto;

/**
 *
 * @author Cakri
 */
public class ReportesView extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reportes
     */
    DefaultTableModel model = new DefaultTableModel();

    
    
    
    
    
    
    public ReportesView() {
        initComponents();
        model.addColumn("Nombre");
        model.addColumn("Precios");
        model.addColumn("Categoria");
        model.addColumn("Stock");
        model.addColumn("Unidades Vendidas");
        
        
        llenarComponentes(); 
    }

    
    
    
    public void llenarComponentes(){
        
        tabla_reporte.setModel(model);
        
        combo_buscarCategoria.addItem("ORDENAR POR MENOR PRECIO");
        combo_buscarCategoria.addItem("ORDENAR POR MAYOR PRECIO");
        combo_buscarCategoria.addItem("ORDENAR POR MAS COMPRADO");
        combo_buscarCategoria.addItem("ORDENAR POR MENOS COMPRADO");
          
        
    }
    
    
    
    
    
    public void buscarMax(){
    
        try {
   
            tabla_reporte.setModel(model); 
   
    
    ArrayList<Producto> tablaOrderMAX = Producto.buscarProductoMAX$();
    
        model.setRowCount(0);
    
            for (Producto producto : tablaOrderMAX) {
                
                Object [] objeto = new Object[4];
                
                        objeto[0]=producto.getNombreProducto();
                        objeto[1]=producto.getPrecio();
                        objeto[2]= producto.getCategoria();
                        objeto[3]= producto.getCantidadStock();
                        
                        model.addRow(objeto);
            }
    
         
        } catch (Exception e) {
        }
    
    
    }
    
    
    
    
    
    
    
        
    public void buscarMIN(){
    
        try {
   
            tabla_reporte.setModel(model); 
   
    
    ArrayList<Producto> tablaOrderMIN = Producto.buscarProductoDESC$();
    
        model.setRowCount(0);
    
            for (Producto producto : tablaOrderMIN) {
                
                Object [] objeto = new Object[4];
                
                        objeto[0]=producto.getNombreProducto();
                        objeto[1]=producto.getPrecio();
                        objeto[2]= producto.getCategoria();
                        
                        objeto[3]= producto.getCantidadStock();
                        
                        model.addRow(objeto);
            }
    
         
        } catch (Exception e) {
        }
    
    
    }
    
    
    
    
        public void buscarMasVenido(){
    
        try {
   
            tabla_reporte.setModel(model); 
   
    
    ArrayList<Producto> tablaOrderMAX = Producto.buscarProductoMAX$();
    
        model.setRowCount(0);
    
            for (Producto producto : tablaOrderMAX) {
                
                Object [] objeto = new Object[4];
                
                        objeto[0]=producto.getNombreProducto();
                        objeto[1]=producto.getPrecio();
                        objeto[2]= producto.getCategoria();
                        
                        objeto[3]= producto.getCantidadStock();
                        
                        model.addRow(objeto);
            }
    
         
        } catch (Exception e) {
        }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_limpiar = new javax.swing.JToggleButton();
        btn_buscar = new javax.swing.JButton();
        combo_buscarCategoria = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_reporte = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Inventario");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Estado del inventario");

        btn_limpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_limpiar.setText("Limpiar");

        btn_buscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tabla_reporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla_reporte);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(combo_buscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(combo_buscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_limpiar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed

        try {
        
           String opcionSeleccionaa = combo_buscarCategoria.getSelectedItem().toString();
            
            if (opcionSeleccionaa.equals("ORDENAR POR MAYOR PRECIO")) {
                buscarMax();
            }
            
             if (opcionSeleccionaa.equals("ORDENAR POR MENOR PRECIO")) {
                buscarMIN();
            }
            
              if (opcionSeleccionaa.equals("ORDENAR POR MAS COMPRADO")) {
                
            }
            
               if (opcionSeleccionaa.equals("ORDENAR POR MENOS COMPRADO")) {
                
            }
            
         
            
         
             

            
            
            
        } catch (Exception e) {
        }








       
    }//GEN-LAST:event_btn_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JToggleButton btn_limpiar;
    private javax.swing.JComboBox<String> combo_buscarCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla_reporte;
    // End of variables declaration//GEN-END:variables
}
