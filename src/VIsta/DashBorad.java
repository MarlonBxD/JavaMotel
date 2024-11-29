package VIsta;

import java.awt.BorderLayout;
import java.awt.Color;
import Controlador.Procesos;
import VIsta.Hpanel;
import VIsta.ProductoPanel;
import javax.swing.JOptionPane;


public class DashBorad extends javax.swing.JFrame {
    ProductoPanel pp;
    Hpanel hp;
    Procesos pro;
    empleadoPanel ep;
    TransaccionesPanel trP;
    private String cargo;
   
    public DashBorad(String cargo) {
        this.cargo = cargo;
        pro = new Procesos();
        initComponents();
        txtUsuario.setText(cargo);  // Muestra el cargo del usuario
        
        hp = new Hpanel();
        pp = new ProductoPanel(cargo);
        hp.setSize(910, 730);
        hp.setLocation(0, 0);   
        
        content.removeAll();
        content.add(hp, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
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
        btnRegistrar = new javax.swing.JButton();
        Caja = new javax.swing.JButton();
        btnCerrarsesion = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(705, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

        btnRegistrar.setBackground(new java.awt.Color(51, 204, 255));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR EMPLEADOS");
        btnRegistrar.setBorder(null);
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseExited(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        Caja.setBackground(new java.awt.Color(51, 204, 255));
        Caja.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Caja.setForeground(new java.awt.Color(255, 255, 255));
        Caja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traasas.png"))); // NOI18N
        Caja.setText("TRANSACCIONES");
        Caja.setBorder(null);
        Caja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CajaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CajaMouseExited(evt);
            }
        });
        Caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaActionPerformed(evt);
            }
        });

        btnCerrarsesion.setBackground(new java.awt.Color(51, 204, 255));
        btnCerrarsesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCerrarsesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        btnCerrarsesion.setText("CERRAR SESION");
        btnCerrarsesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarsesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarsesionMouseExited(evt);
            }
        });
        btnCerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Caja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(btnCerrarsesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addGap(102, 102, 102)
                .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Caja, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
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
            pp = new ProductoPanel(cargo); // Pasa el cargo al constructor
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        //System.out.println(cargo);
        if (cargo != null && cargo.equals("ADMINISTRADOR")) {
            ep = new empleadoPanel();
            ep.setSize(910, 730);
            ep.setLocation(0, 0);

            content.removeAll();
            content.add(ep, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no tiene permisos de administrador.");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void CajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaActionPerformed
        trP =new TransaccionesPanel();
        trP.setSize(910,730);
        trP.setLocation(0, 0);
        
        content.removeAll();
        content.add(trP, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_CajaActionPerformed

    private void btnCerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarsesionActionPerformed
        // Confirmar cierre de sesión (opcional)
    int confirmacion = JOptionPane.showConfirmDialog(this, 
        "¿Seguro que deseas cerrar sesión?", 
        "Cerrar Sesión", JOptionPane.YES_NO_OPTION);

    if (confirmacion == JOptionPane.YES_OPTION) {
        // Limpiar datos del usuario (si es necesario)
//        usuario = null; // Variable global del usuario actual

        // Cerrar ventana actual
        this.dispose();

        // Redirigir al Login
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    }//GEN-LAST:event_btnCerrarsesionActionPerformed

    private void btnCerrarsesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarsesionMouseEntered
        btnCerrarsesion.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnCerrarsesionMouseEntered

    private void btnCerrarsesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarsesionMouseExited
        btnCerrarsesion.setBackground(new Color(51,204,255));
    }//GEN-LAST:event_btnCerrarsesionMouseExited

    private void btnRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseEntered
        btnRegistrar.setBackground(Color.BLUE);
    }//GEN-LAST:event_btnRegistrarMouseEntered

    private void btnRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseExited
        btnRegistrar.setBackground(new Color(51,204,255));
    }//GEN-LAST:event_btnRegistrarMouseExited

    private void CajaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaMouseEntered
        Caja.setBackground(Color.BLUE);
    }//GEN-LAST:event_CajaMouseEntered

    private void CajaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaMouseExited
        Caja.setBackground(new Color(51,204,255));
    }//GEN-LAST:event_CajaMouseExited


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Caja;
    private javax.swing.JButton btnCerrarsesion;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
