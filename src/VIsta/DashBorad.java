
package VIsta;

import java.awt.BorderLayout;
import java.awt.Color;


public class DashBorad extends javax.swing.JFrame {
    ProductoPanel pp;
    Hpanel hp;
   
    public DashBorad() {
        String nomreUsuario = "Marlon Buelvas";
        initComponents();
        hp=new Hpanel();
        pp=new ProductoPanel();
        hp.setSize(910, 730);
        hp.setLocation(0, 0);
        
        content.removeAll();
        content.add(hp, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        txtUsuario.setText(nomreUsuario);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnHabitaciones = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo-de-usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(709, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtUsuario)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 910, 70));

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));

        btnHabitaciones.setBackground(new java.awt.Color(51, 204, 255));
        btnHabitaciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHabitaciones.setForeground(new java.awt.Color(255, 255, 255));
        btnHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cama-alternativa.png"))); // NOI18N
        btnHabitaciones.setText("  HABITACIONES");
        btnHabitaciones.setBorder(null);
        btnHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHabitacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHabitacionesMouseExited(evt);
            }
        });
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(51, 204, 255));
        btnProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja-abierta-llena.png"))); // NOI18N
        btnProductos.setText("  PRODUCTOS");
        btnProductos.setBorder(null);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
        });
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/M (1).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 800));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 910, 730));

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

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        
        hp.setSize(910, 730);
        hp.setLocation(0, 0);
        
        content.removeAll();
        content.add(hp, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
          
        pp.setSize(910, 730);
        pp.setLocation(0, 0);
        
        content.removeAll();
        content.add(pp, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnHabitacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMouseEntered
        btnHabitaciones.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnHabitacionesMouseEntered

    private void btnHabitacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHabitacionesMouseExited
        btnHabitaciones.setBackground(new Color(51,204,255));
    }//GEN-LAST:event_btnHabitacionesMouseExited

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setBackground(new Color(51,204,255));
    }//GEN-LAST:event_btnProductosMouseExited


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnProductos;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
