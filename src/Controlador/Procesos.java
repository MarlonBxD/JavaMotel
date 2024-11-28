
package Controlador;

import Modelo.Empleado;
import Modelo.Producto;
import VIsta.DashBorad;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Procesos {
    
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public Procesos() {
    }
    
    

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    public static void guardarProducto(ArrayList<Producto> listaProducto) throws IOException{
      File directorio=new File(".");//patch
      File f=new File(directorio,"Productos.csv");//crear el archivo f es el flujo
      
      FileWriter fw=new FileWriter(f); //flujo fw
      BufferedWriter bw=new BufferedWriter(fw); // flujo bw
      
        for (Producto producto : listaProducto) {
            bw.write(producto.getNombre()+","+producto.getPrecio()+","+producto.getExistencia()+"\n");
        }
      bw.close();
    
    }
    
    public static ArrayList<Producto> leerArchivoPorducto() throws FileNotFoundException, IOException{
      File directorio=new File(".");//patch
      File f=new File(directorio,"Productos.csv");//crear el archivo f es el flujo
      
      FileReader fr=new FileReader(f); //flujo fw
      BufferedReader br=new BufferedReader(fr); // flujo bw
      ArrayList<Producto> lisProducto=new ArrayList<Producto>();
      
      String linea="";
      while(linea!=null){
          linea=br.readLine();
               if(linea!=null){
                 String vector[]=linea.split(",");
                 Producto prod=new Producto(vector[0],Double.parseDouble(vector[1]),Integer.parseInt(vector[2]));
                 lisProducto.add(prod);
                  }
         }
      br.close();
        return lisProducto;
    }
    
    public static void guardarEmpleado(ArrayList<Empleado> listaEmpleado) throws IOException{
      File directorio=new File(".");//patch
      File f=new File(directorio,"empleados.csv");//crear el archivo f es el flujo
      
      FileWriter fw=new FileWriter(f); //flujo fw
      BufferedWriter bw=new BufferedWriter(fw); // flujo bw
      
        for (Empleado empleado : listaEmpleado) {
            bw.write(empleado.getIdEmpleado()+","+empleado.getNombre()+","+
                     empleado.getCargo()+","+empleado.getUsuario()+","+
                      empleado.getContraseña()+"\n");
        }
      bw.close();
    
    }
    public static ArrayList<Empleado> leer() throws FileNotFoundException, IOException {
        File directorio = new File("."); // Patch
        File f = new File(directorio, "empleados.csv"); // Crear el archivo f es el flujo

        FileReader fr = new FileReader(f); // Flujo fw
        BufferedReader br = new BufferedReader(fr); // Flujo bw
        ArrayList<Empleado> listaEmpleado = new ArrayList<>();

        String linea = br.readLine(); // Leer la primera línea
        while (linea != null) {
            // Verificar si la línea tiene al menos cinco valores
            String vector[] = linea.split(",");
            if (vector.length >= 5) {
                // Crear el objeto Empleado solo si los valores necesarios están presentes
                Empleado empleado = new Empleado(
                    vector[0].trim(), 
                    vector[1].trim(), 
                    vector[2].trim(), 
                    vector[3].trim(), 
                    vector[4].trim()
                );
                listaEmpleado.add(empleado);
            } else {
                // Opcional: Imprimir una advertencia para líneas mal formateadas
                System.out.println("Línea mal formateada: " + linea);
            }
            linea = br.readLine(); // Leer la siguiente línea
        }
        br.close();
        return listaEmpleado;
    }

    
    
    public boolean iniciar(String nombre, String contrasena) {
        File fileEmpleado = new File("empleados.csv");     
        if (!fileEmpleado.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo empleados.csv no existe.");
            return false;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileEmpleado))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length >= 5) {
                    String nombreArchivo = datos[3];     // Usuario
                    String contrasenaArchivo = datos[4]; // Contraseña
                    String cargoArchivo = datos[2];      // Cargo

                    // Verifica si el nombre y la contraseña coinciden
                    if (nombre.equals(nombreArchivo) && contrasena.equals(contrasenaArchivo)) {
                        this.cargo = cargoArchivo;  // Almacena el cargo
                        DashBorad db = new DashBorad(this.cargo);  // Pasa el cargo al constructor
                        db.setVisible(true);
                        db.setLocationRelativeTo(null);
                        return true;
                    }
                }
            }
            // Si no se encuentra el usuario o la contraseña no coincide
            JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos.");
            return false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
            return false;
        }
    }
    
    public static double obtenerPrecioProducto(String nombreProducto) throws FileNotFoundException, IOException {
        ArrayList<Producto> listaProductos = leerArchivoPorducto();
        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return producto.getPrecio();
            }
        }
        // Si no se encuentra el producto, puedes lanzar una excepción o retornar un valor por defecto
        throw new IllegalArgumentException("Producto no encontrado: " + nombreProducto);
    }
    public static void descExistencia(String nomProducto, int cantidad) throws IOException {
        // Leer la lista de productos desde el archivo
        ArrayList<Producto> listaProductos = leerArchivoPorducto();

        // Buscar el producto por su nombre y actualizar su existencia
        boolean productoEncontrado = false;
        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(nomProducto)) {
                if (producto.getExistencia() < cantidad) {
                    throw new IllegalArgumentException("No hay suficiente stock para el producto: " + nomProducto);
                }
                producto.setExistencia(producto.getExistencia() - cantidad);
                productoEncontrado = true;
                break;
            }
        }

        // Si no se encuentra el producto, lanzar una excepción
        if (!productoEncontrado) {
            throw new IllegalArgumentException("Producto no encontrado: " + nomProducto);
        }

        // Guardar los cambios en el archivo
        guardarProducto(listaProductos);
    }


}
