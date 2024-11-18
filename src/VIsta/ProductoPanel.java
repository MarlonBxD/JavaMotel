/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marlo
 */
public class ProductoPanel extends javax.swing.JPanel {
    int filaSeleccionada;
    private DefaultTableModel model;
    
    
    public ProductoPanel() {
        initComponents();
        model = (DefaultTableModel) tbProductos.getModel();
        cargarProductos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombrep = new javax.swing.JTextField();
        txtPreciop = new javax.swing.JTextField();
        txtCantidadp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INVENTARIO DE PRODUCTOS");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("PRECIO");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("CANTIDAD");

        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "PRECIO", "CANTIDAD"
            }
        ));
        tbProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProductos);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add_icon-icons.com_52393.png"))); // NOI18N
        btnAgregar.setToolTipText("Agregar Producto");
        btnAgregar.setBorder(null);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setToolTipText("Buscar Producto");
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modify.png"))); // NOI18N
        btnModificar.setToolTipText("Modificar");
        btnModificar.setBorder(null);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ELIMINAR.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtPreciop, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtCantidadp, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreciop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificarRegistro();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valorBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a buscar:", "Buscar Producto", JOptionPane.QUESTION_MESSAGE);

        buscarProducto(valorBuscado);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         eliminarRegistro();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nom1 = txtNombrep.getText();
        String nom = nom1.toUpperCase();
        String precio = txtPreciop.getText();
        String stock = txtCantidadp.getText();

        if (nom.isEmpty() || precio.isEmpty() || stock.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            String codigoExistente = model.getValueAt(i, 0).toString();  // Columna 0 es el código
            if (codigoExistente.equalsIgnoreCase(nom)) {
                JOptionPane.showMessageDialog(null, "El producto ya existe con el codigo ingresado.", "Error", JOptionPane.ERROR_MESSAGE);
                limpiarTb();
                return;
            }
        }

        float pre;
        int cant;

        try {
            pre = Float.parseFloat(precio);
            cant = Integer.parseInt(stock);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El precio y la cantidad deben ser valores numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Object[] pro = {nom, pre, cant};
        model.addRow(pro);
        guardarProductos();
        limpiarTb();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        filaSeleccionada = tbProductos.getSelectedRow();

        if (filaSeleccionada >= 0) {
        
            txtNombrep.setText(model.getValueAt(filaSeleccionada, 0).toString());
            txtPreciop.setText(model.getValueAt(filaSeleccionada, 1).toString());
            txtCantidadp.setText(model.getValueAt(filaSeleccionada, 2).toString());
        }
    }//GEN-LAST:event_tbProductosMouseClicked

    public void buscarProducto(String valorBuscado) {
        if (valorBuscado == null || valorBuscado.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < model.getRowCount(); i++) {
            String nombre = model.getValueAt(i, 0).toString();  
            if (nombre.equalsIgnoreCase(valorBuscado)) {
                tbProductos.setRowSelectionInterval(i, i);
                JOptionPane.showMessageDialog(null, "Producto encontrado: " + nombre);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarRegistro() {
        filaSeleccionada = tbProductos.getSelectedRow(); 
        if (filaSeleccionada >= 0) {
            model.removeRow(filaSeleccionada); 
            JOptionPane.showMessageDialog(null, "El producto ha sido eliminado correctamente.");
            guardarProductos();
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para eliminar.");
        }
        limpiarTb();
        btnAgregar.setEnabled(true);
    }

    
    public void modificarRegistro() {
        filaSeleccionada = tbProductos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            
            String nuevoNombre = txtNombrep.getText();
            String nuevoPrecio = txtPreciop.getText();
            String nuevaCantidad = txtCantidadp.getText();
            
            if (nuevoNombre.equals("") || nuevoPrecio.equals("") || nuevaCantidad.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos los campos deben estar completos.");
            } else {
                
                tbProductos.setValueAt(nuevoNombre, filaSeleccionada, 0);
                tbProductos.setValueAt(nuevoPrecio, filaSeleccionada, 1);
                tbProductos.setValueAt(nuevaCantidad, filaSeleccionada, 2);

                limpiarTb();

                JOptionPane.showMessageDialog(null, "El producto ha sido modificado correctamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila para modificar.");
        }
    }
    
    public void guardarProductos() {
        File file = new File("Productos.csv");
        try (FileWriter writer = new FileWriter(file)) {
            for (int i = 0; i < model.getColumnCount(); i++) {
                writer.write(model.getColumnName(i));
                if (i < model.getColumnCount() - 1) writer.write(","); 
            }
            writer.write(System.lineSeparator()); 

            for (int i = 0; i < model.getRowCount(); i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    writer.write(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) writer.write(","); // Separador de columnas
                }
                writer.write(System.lineSeparator()); // Nueva línea
            }

            //JOptionPane.showMessageDialog(null, "Productos guardados en Productos.csv correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los productos: " + e.getMessage());
        }
    }
    
    private void cargarProductos() {
        File file = new File("Productos.csv");
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo Productos.csv no existe.");
            return; 
        }
        model.setRowCount(0); 

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(","); 
                model.addRow(datos); 
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los productos: " + e.getMessage());
        }
    }
    void limpiarTb(){
        
        txtNombrep.setText(null);
        txtPreciop.setText(null);
        txtCantidadp.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProductos;
    private javax.swing.JTextField txtCantidadp;
    private javax.swing.JTextField txtNombrep;
    private javax.swing.JTextField txtPreciop;
    // End of variables declaration//GEN-END:variables
}
