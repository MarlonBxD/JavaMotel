/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VIsta;

import Modelo.Habitacion;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author marlo
 */
public class panelHabitaciones extends javax.swing.JPanel {
    private List<Habitacion> habitaciones = new ArrayList<>();
    

    /**
     * Creates new form panelejemplo
     */
    public panelHabitaciones() {
        initComponents();
        
        for (int i = 1; i <= 6; i++) {
    habitaciones.add(new Habitacion(i, ""));
    }
    JPanel panelHabitaciones = new JPanel(new GridLayout(0, 3)); // 3 columnas, filas automáticas
    for (Habitacion habitacion : habitaciones) {
        JButton boton = new JButton("Habitación " + habitacion.getNumero() + " (Libre)");
        boton.addActionListener(evt -> habitacion.iniciarHabitacion(habitacion.getNumero(), boton));
        panelHabitaciones.add(boton);
    }    
    
    this.add(panelHabitaciones);
    
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
