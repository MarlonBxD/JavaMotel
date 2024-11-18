
package Controlador;

import VIsta.DashBorad;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Procesos {
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void agregarEmpleado(String idempleado, String nombre,String cargo,String usuario, String contra) {
        File fileEmplado = new File("empleados.csv");
        try (FileWriter file = new FileWriter(fileEmplado, true)) { 
            file.write(idempleado.toUpperCase());
            file.write(",");
            file.write(nombre.toUpperCase());
            file.write(",");
            file.write(cargo.toUpperCase());
            file.write(",");
            file.write(usuario);
            file.write(",");
            file.write(contra);
            file.write(System.lineSeparator()); 

            JOptionPane.showMessageDialog(null, "Usuario agregado a la base de datos.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al momento de agregar usuario.");
        }
    }
    public boolean iniciar(String nombre, String contrasena) {
        File fileEmpleado = new File("empleados.csv");     
        if (!fileEmpleado.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo empleados.csv no existe.");
            return false; // Si el archivo no existe, retornar false
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileEmpleado))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 2) {
                    String nombreArchivo = datos[3];     // Asumiendo que el nombre está en la columna 3
                    String contrasenaArchivo = datos[4]; // Asumiendo que la contraseña está en la columna 4

                    // Verifica si el nombre y la contraseña coinciden
                    if (nombre.equals(nombreArchivo) && contrasena.equals(contrasenaArchivo)) {
                        DashBorad db = new DashBorad();
                        db.setVisible(true);
                        db.setLocationRelativeTo(null);
                        return true; // Si la autenticación es exitosa, retornar true
                    }
                }
            }
            // Si no se encuentra el usuario o la contraseña no coincide
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos.");
            return false; // Retornar false si no se encuentra el usuario o la contraseña es incorrecta
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
            return false; // Retornar false si ocurre un error al leer el archivo
        }
    }

}
