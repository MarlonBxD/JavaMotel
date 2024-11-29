
package VIsta;

import Controlador.Procesos;
import Modelo.Producto;
import Modelo.Transacciones;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import VIsta.DashBorad;


public class TransaccionesPanel extends javax.swing.JPanel {
    DefaultTableModel dtm=new DefaultTableModel();
    ArrayList<Transacciones>Listt;
    Login lg;
    
    public TransaccionesPanel() {
        initComponents();
        dtm=(DefaultTableModel) tblTrans.getModel();
        Listt=new ArrayList<Transacciones>();
        lg=new Login();
        mostrarTabla();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrans = new javax.swing.JTable();
        btnCierreCaja = new javax.swing.JButton();
        txtNombreUsu = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Habitacion", "Placa", "Tiempo", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblTrans);

        btnCierreCaja.setBackground(new java.awt.Color(153, 255, 255));
        btnCierreCaja.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCierreCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnCierreCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dolar-de-caja.png"))); // NOI18N
        btnCierreCaja.setText("Cierre de caja");
        btnCierreCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCierreCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(txtNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(txtNombreUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnCierreCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCierreCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreCajaActionPerformed
        realizarCierreCaja();
    }//GEN-LAST:event_btnCierreCajaActionPerformed
    
    void mostrarTabla(){
        while(dtm.getRowCount()>0){
        dtm.removeRow(0);
        }
        try {
           Listt= Procesos.leerTransacciones();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo leer el archivo ");
        }
        for (Transacciones tr: Listt) {
             Object datos[]=new Object[7];
               datos[0]=tr.getFecha();
               datos[1]=tr.getHabitacion();
               datos[2]=tr.getPlaca().toUpperCase();
               datos[3]=tr.getTiempo();
               datos[4]=String.format("%.2f", tr.getTotal());
               
               dtm.addRow(datos);//linea que muestra la informacion logica
        }
        tblTrans.setModel(dtm);
    }
    
    
    
    private void realizarCierreCaja() {
        try {
            // Leer las transacciones
            Listt = Procesos.leerTransacciones();

            // Calcular el total producido
            double totalProducido = 0;
            for (Transacciones tr : Listt) {
                totalProducido += tr.getTotal();
            }

            // Obtener la hora actual como fin de turno
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String finTurno = sdf.format(new Date());

            // Pedir la base inicial
            String baseInput = JOptionPane.showInputDialog("Ingrese la base inicial del turno:");
            double baseInicial = baseInput != null && !baseInput.isEmpty() ? Double.parseDouble(baseInput) : 0;

            // Crear el archivo de cierre de caja
            File cierreCaja = new File("cierre_caja_" + System.currentTimeMillis() + ".csv");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(cierreCaja))) {
                bw.write("Cierre de Caja\n");
                bw.write("Inicio de Turno: " + lg.getHoraincio() + "\n");
                bw.write("Fin de Turno: " + finTurno + "\n");
                bw.write("Base Inicial: " + baseInicial + "\n");
                bw.write("Total Producido: " + totalProducido + "\n");
                bw.write("\nDetalle de Transacciones:\n");
                bw.write("Fecha,Habitacion,Placa,Tiempo,Total\n");

                for (Transacciones tr : Listt) {
                    bw.write(tr.getFecha() + "," + tr.getHabitacion() + "," + 
                             tr.getPlaca() + "," + tr.getTiempo() + "," + 
                             tr.getTotal() + "\n");
                }
            }

            // Limpiar el archivo de transacciones para el siguiente turno
            Procesos.limpiarTransacciones();

            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Cierre de caja realizado con éxito.\nArchivo: " + cierreCaja.getName());

            // Actualizar la tabla para reflejar que no hay transacciones
            mostrarTabla();

        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al realizar el cierre de caja: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCierreCaja;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTrans;
    private javax.swing.JLabel txtNombreUsu;
    // End of variables declaration//GEN-END:variables
}
