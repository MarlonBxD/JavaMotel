
package VIsta;

import Controlador.Procesos;
import Modelo.Producto;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marlo
 */
public class ProductoPanel extends javax.swing.JPanel {
    
    DefaultTableModel dtm=new DefaultTableModel();
    ArrayList<Producto> listaProduc;
    int fila, col;
    private String cargo;
    
    
    public ProductoPanel(String cargo) {
        this.cargo = cargo;
        initComponents();
        dtm=(DefaultTableModel) tbProductos.getModel();
        listaProduc=new ArrayList<Producto>();
        mostrarTabla();
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
    
    void agregar() throws IOException{
        Producto pdt=new Producto();
        pdt.setNombre((String) txtNombrep.getText());
        pdt.setPrecio(Double.parseDouble(txtPreciop.getText()));
        pdt.setExistencia(Integer.parseInt(txtCantidadp.getText()));
        
        listaProduc.add(pdt);
        Procesos.guardarProducto(listaProduc);
    }
    
    void mostrarTabla(){
        while(dtm.getRowCount()>0){
        dtm.removeRow(0);
        }
        try {
           listaProduc= Procesos.leerArchivoPorducto();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo leer el archivo ");
        }
        for (Producto p: listaProduc) {
             Object datos[]=new Object[7];
               datos[0]=p.getNombre();
               datos[1]=p.getPrecio();
               datos[2]=p.getExistencia();
               
               dtm.addRow(datos);//linea que muestra la informacion logica
        }
        tbProductos.setModel(dtm);
    }
    
    void limpiarTb(){
        
        txtNombrep.setText(null);
        txtPreciop.setText(null);
        txtCantidadp.setText(null);
    }
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if (cargo != null && cargo.equals("ADMINISTRADOR")) {
            String nNombre,nPrecio,nExistencia;
            
            nNombre = txtNombrep.getText();
            nPrecio = txtPreciop.getText();
            nExistencia = txtCantidadp.getText();
            
            listaProduc.get(fila).setNombre(nNombre);
            listaProduc.get(fila).setPrecio(Double.parseDouble(nPrecio));
            listaProduc.get(fila).setExistencia(Integer.parseInt(nExistencia));
            
            dtm.setRowCount(0);
            //mostrar el arraylist dentro del Jtable
            for (int i = 0; i < listaProduc.size(); i++) {
                Object[] objE={listaProduc.get(i).getNombre(),listaProduc.get(i).getNombre(),
                               listaProduc.get(i).getExistencia()};
                dtm.addRow(objE);
                try {
                    Procesos.guardarProducto(listaProduc);
                    mostrarTabla();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, " No se pudo modificar");
                }
            }
                   
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no tiene permisos de administrador.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String valorBuscado = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a buscar:", "Buscar Producto", JOptionPane.QUESTION_MESSAGE);

        buscarProducto(valorBuscado);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (cargo != null && cargo.equals("ADMINISTRADOR")) {
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int dialogResul=JOptionPane.showConfirmDialog(this,"Borrar datos","Borrar" ,dialogButton);
            if(dialogResul==0){
                dtm.removeRow(fila);
                listaProduc.remove(fila); //lo borramos en arraylist
                try {
                      Procesos.guardarProducto(listaProduc);
                      mostrarTabla();
                  } catch (IOException ex) {
                      JOptionPane.showMessageDialog(null, " No se pudo modificar");
                  }
                limpiarTb();
            }
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no tiene permisos de administrador.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        if (cargo != null && cargo.equals("ADMINISTRADOR")) {
            try {
   
            agregar();
            mostrarTabla();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar en el archivo ");
        }
           mostrarTabla();
            limpiarTb();

            } else {
                JOptionPane.showMessageDialog(null, "El usuario no tiene permisos de administrador.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tbProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosMouseClicked
        
        dtm=(DefaultTableModel) tbProductos.getModel();
        fila=tbProductos.getSelectedRow();
        txtNombrep.setText(dtm.getValueAt(fila, 0).toString());
        txtPreciop.setText(dtm.getValueAt(fila, 1).toString());
        txtCantidadp.setText(dtm.getValueAt(fila, 2).toString());
        btnAgregar.setEnabled(false);
        
    }//GEN-LAST:event_tbProductosMouseClicked

    public void buscarProducto(String valorBuscado) {
        if (valorBuscado == null || valorBuscado.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean encontrado = false;

        for (int i = 0; i < dtm.getRowCount(); i++) {
            String nombre = dtm.getValueAt(i, 0).toString();  
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
