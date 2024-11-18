/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta;


import Modelo.Habitacion;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;




/**
 *
 * @author marlo
 */
public class Hpanel extends javax.swing.JPanel {

    private Habitacion habitacion1;
    private Habitacion habitacion2;
    private Habitacion habitacion3;
    private Habitacion habitacion4;
    private Habitacion habitacion5;
    private Habitacion habitacion6;
    private Habitacion habitacion;
    
    
    
    public Hpanel() {
        initComponents();
        habitacion1 = new Habitacion(1, ""); // Placa vacía inicialmente
        habitacion2 = new Habitacion(2, "");
        habitacion3 = new Habitacion(3, "");
        habitacion4 = new Habitacion(4, "");
        habitacion5 = new Habitacion(5, "");
        habitacion6 = new Habitacion(6, "");
        btnHabitacion1.setEnabled(false);
        btnHabitacion2.setEnabled(false);
        btnHabitacion3.setEnabled(false);
        btnHabitacion4.setEnabled(false);
        btnHabitacion5.setEnabled(false);
        btnHabitacion6.setEnabled(false);
        
        
        
    }    
    
    public void activarbtn(JButton botonHabitacion) {
        // Crear un array con todos los botones de las habitaciones
        JButton[] botonesHabitaciones = {btnHabitacion1, btnHabitacion2, btnHabitacion3, btnHabitacion4, btnHabitacion5, btnHabitacion6};

        // Iterar sobre los botones para encontrar el que se debe deshabilitar
        for (JButton boton : botonesHabitaciones) {
            if (boton == botonHabitacion) {
                boton.setEnabled(false);  // Deshabilitar el botón correspondiente
                break;  // Salir del bucle una vez que se haya deshabilitado el botón
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHabitacion1 = new javax.swing.JButton();
        btnHabitacion2 = new javax.swing.JButton();
        btnHabitacion3 = new javax.swing.JButton();
        btnHabitacion4 = new javax.swing.JButton();
        btnHabitacion5 = new javax.swing.JButton();
        btnHabitacion6 = new javax.swing.JButton();
        btnAgregarP = new javax.swing.JButton();
        btnCobrar = new javax.swing.JButton();
        btnHistorial = new javax.swing.JButton();
        btnInicar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        btnHabitacion1.setBackground(new java.awt.Color(91, 236, 14));
        btnHabitacion1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabitacion1.setText("Habitacion 1 - Libre");
        btnHabitacion1.setToolTipText("");
        btnHabitacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion1ActionPerformed(evt);
            }
        });

        btnHabitacion2.setBackground(new java.awt.Color(91, 236, 14));
        btnHabitacion2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabitacion2.setText("Habitacion 2 - Libre");
        btnHabitacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion2ActionPerformed(evt);
            }
        });

        btnHabitacion3.setBackground(new java.awt.Color(91, 236, 14));
        btnHabitacion3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabitacion3.setText("Habitacion  3- Libre");
        btnHabitacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion3ActionPerformed(evt);
            }
        });

        btnHabitacion4.setBackground(new java.awt.Color(91, 236, 14));
        btnHabitacion4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabitacion4.setText("Habitacion 4 - Libre");
        btnHabitacion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion4ActionPerformed(evt);
            }
        });

        btnHabitacion5.setBackground(new java.awt.Color(91, 236, 14));
        btnHabitacion5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabitacion5.setText("Habitacion 5 - Libre");
        btnHabitacion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion5ActionPerformed(evt);
            }
        });

        btnHabitacion6.setBackground(new java.awt.Color(91, 236, 14));
        btnHabitacion6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHabitacion6.setText("Habitacion 6 - Libre");
        btnHabitacion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacion6ActionPerformed(evt);
            }
        });

        btnAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/coffee_product_icon_152092.png"))); // NOI18N
        btnAgregarP.setText("Agregar Producto");
        btnAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPActionPerformed(evt);
            }
        });

        btnCobrar.setText("Cobrar");
        btnCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCobrarActionPerformed(evt);
            }
        });

        btnHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1486485531-activities-history-log-past-recent_81187.png"))); // NOI18N
        btnHistorial.setText("Historial");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnInicar.setText("inciar");
        btnInicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHabitacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(btnHabitacion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHabitacion2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(btnHabitacion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHabitacion3, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addComponent(btnHabitacion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnInicar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHabitacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHabitacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHabitacion3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnHabitacion5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHabitacion4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHabitacion6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCobrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnInicar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(241, 241, 241))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabitacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion2ActionPerformed
        
    }//GEN-LAST:event_btnHabitacion2ActionPerformed

    private void btnHabitacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion3ActionPerformed
       
    }//GEN-LAST:event_btnHabitacion3ActionPerformed

    private void btnHabitacion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion4ActionPerformed
        
    }//GEN-LAST:event_btnHabitacion4ActionPerformed

    private void btnHabitacion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion5ActionPerformed
        
    }//GEN-LAST:event_btnHabitacion5ActionPerformed

    private void btnHabitacion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion6ActionPerformed
       
    }//GEN-LAST:event_btnHabitacion6ActionPerformed

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
        try {
            // Mostrar un cuadro de diálogo para ingresar el número de la habitación
            String numeroHabitacionStr = JOptionPane.showInputDialog("Ingrese el número de la habitación:");

            // Convertir el número ingresado a un entero
            if (numeroHabitacionStr != null) {
                int numeroHabitacion = Integer.parseInt(numeroHabitacionStr);

                // Llamar al método para asignar la habitación seleccionada
                Habitacion habitacionSeleccionada = asignarHabitacion(numeroHabitacion);

                // Verificar si la habitación es válida
                if (habitacionSeleccionada != null) {
                    // Llamar al método de agregar producto de la habitación seleccionada
                    habitacionSeleccionada.agregarProducto();
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado la habitación.");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El número de la habitación debe ser un valor numérico.");
        }
    }//GEN-LAST:event_btnAgregarPActionPerformed

    private void btnCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCobrarActionPerformed
        try {
            String numeroHabitacionStr = JOptionPane.showInputDialog("Ingrese el número de la habitación:");
            if (numeroHabitacionStr != null && numeroHabitacionStr.matches("\\d+")) {
                int numeroHabitacion = Integer.parseInt(numeroHabitacionStr);
                Habitacion habitacionSeleccionada = asignarHabitacion(numeroHabitacion);
                if (habitacionSeleccionada != null) {
                    double total = habitacionSeleccionada.cobrar();
                    if (total > 0.0) {
                        DecimalFormat df = new DecimalFormat("#.00");
                        JOptionPane.showMessageDialog(null, "El total a cobrar por la habitación " + numeroHabitacion + " es: $" + df.format(total), "Cobro realizado", JOptionPane.INFORMATION_MESSAGE);
                        habitacionSeleccionada.reiniciar(obtenerBotonHabitacion(numeroHabitacion));
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "El cobro ha sido cancelado.", "Cobro cancelado", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado la habitación.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El número de habitación debe ser un valor numérico.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El número de la habitación debe ser un valor numérico.");
        }
    }//GEN-LAST:event_btnCobrarActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
         // Crear un JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // Hacer que el JTextArea sea de solo lectura
        textArea.setLineWrap(true); // Ajustar las líneas si son largas
        textArea.setWrapStyleWord(true); // Ajustar las líneas entre palabras

        // Mostrar un cuadro de diálogo para ingresar el número de la habitación
        String numeroHabitacionStr = JOptionPane.showInputDialog("Ingrese el número de la habitación:");

        // Verificar si el usuario ha cancelado el cuadro de diálogo
        if (numeroHabitacionStr != null && !numeroHabitacionStr.trim().isEmpty()) {
            try {
                // Validar que el número de la habitación sea numérico
                int numeroHabitacion = Integer.parseInt(numeroHabitacionStr);

                // Llamar al método para asignar la habitación seleccionada
                Habitacion habitacionSeleccionada = asignarHabitacion(numeroHabitacion);

                // Verificar si la habitación es válida
                if (habitacionSeleccionada != null) {
                    // Mostrar el historial en el JTextArea
                    textArea.setText(habitacionSeleccionada.mostrarHistorial());

                    // Envolver el JTextArea en un JScrollPane
                    JScrollPane scrollPane = new JScrollPane(textArea);

                    // Mostrar el JTextArea en un cuadro de diálogo
                    JOptionPane.showMessageDialog(null, scrollPane, "Historial de Habitación", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado la habitación.");
                }
            } catch (NumberFormatException ex) {
                // Manejar el caso en que el valor ingresado no es un número válido
                JOptionPane.showMessageDialog(null, "El número de la habitación debe ser un valor numérico.");
            }
        } else {
            // Si el usuario no ha ingresado nada o ha presionado Cancelar
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de habitación válido.");
        }
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void btnHabitacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacion1ActionPerformed

    }//GEN-LAST:event_btnHabitacion1ActionPerformed

    private void btnInicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicarActionPerformed
         String numeroHabitacionStr = JOptionPane.showInputDialog("Ingrese el número de la habitación:");

        // Verificar si el usuario ha cancelado el cuadro de diálogo
        if (numeroHabitacionStr != null && !numeroHabitacionStr.trim().isEmpty()) {
            try {
                // Validar que el número de la habitación sea numérico
                int numeroHabitacion = Integer.parseInt(numeroHabitacionStr);

                // Llamar al método para asignar la habitación seleccionada
                Habitacion habitacionSeleccionada = asignarHabitacion(numeroHabitacion);

                // Verificar si la habitación es válida
                if (habitacionSeleccionada != null) {
                    // Aquí pasas el número de habitación y el botón al método iniciarHabitacion
                    JButton botonHabitacion = obtenerBotonHabitacion(numeroHabitacion);  // Método para obtener el botón correspondiente
                    habitacionSeleccionada.iniciarHabitacion(numeroHabitacion, botonHabitacion);
                    activarbtn(botonHabitacion);
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado la habitación.");
                }
            } catch (NumberFormatException ex) {
                // Manejar el caso en que el valor ingresado no es un número válido
                JOptionPane.showMessageDialog(this, "El número de la habitación debe ser un valor numérico.");
            }
        } else {
            // Si el usuario no ha ingresado nada o ha presionado Cancelar
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número de habitación válido.");
        }
    }//GEN-LAST:event_btnInicarActionPerformed

    
    private Habitacion asignarHabitacion(int numeroHabitacion) {
        switch (numeroHabitacion) {
            case 1: return habitacion1;
            case 2: return habitacion2;
            case 3: return habitacion3;
            case 4: return habitacion4;
            case 5: return habitacion5;
            case 6: return habitacion6;
            default: return null;
        }
    }
    private JButton obtenerBotonHabitacion(int numeroHabitacion) {
        switch (numeroHabitacion) {
            case 1: return btnHabitacion1;
            case 2: return btnHabitacion2;
            case 3: return btnHabitacion3;
            case 4: return btnHabitacion4;
            case 5: return btnHabitacion5;
            case 6: return btnHabitacion6;
            default: return null;
        }
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnCobrar;
    private javax.swing.JButton btnHabitacion1;
    private javax.swing.JButton btnHabitacion2;
    private javax.swing.JButton btnHabitacion3;
    private javax.swing.JButton btnHabitacion4;
    private javax.swing.JButton btnHabitacion5;
    private javax.swing.JButton btnHabitacion6;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnInicar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
