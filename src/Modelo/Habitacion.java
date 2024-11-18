package Modelo;



import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Habitacion {
    // Atributos existentes
    private int numero;
    private int tiempoOcupacion;
    private List<String> productos;
    private List<Integer> cantidades;
    private boolean ocupada;
    private long startTime;
    private List<String> historial;
    private String placaVehiculo;
    private Timer timer;
    private Date fechaHoraInicio;
    private double precioPorHora; // Atributo para el precio por hora

    // Constructor
    public Habitacion(int numero, String placaVehiculo) {
        this.numero = numero;
        this.tiempoOcupacion = 0;
        this.productos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.ocupada = false;
        this.startTime = 0;
        this.historial = new ArrayList<>();
        this.placaVehiculo = placaVehiculo;
        this.precioPorHora = 12000.0; // Precio por defecto, pero se puede cambiar
    }

    // Getters y Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTiempoOcupacion() {
        return tiempoOcupacion;
    }

    public void setTiempoOcupacion(int tiempoOcupacion) {
        this.tiempoOcupacion = tiempoOcupacion;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public List<Integer> getCantidades() {
        return cantidades;
    }

    public void setCantidades(List<Integer> cantidades) {
        this.cantidades = cantidades;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public List<String> getHistorial() {
        return historial;
    }

    public void setHistorial(List<String> historial) {
        this.historial = historial;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public Timer getTimer() {
        return timer;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public void setFechaHoraInicio(Date fechaHoraInicio) {
        this.fechaHoraInicio = fechaHoraInicio;
    }
    

    // Métodos
    
    
    public String tomarTiempoOcupacion() {
        if (ocupada) {
            long elapsedTime = (System.currentTimeMillis() / 1000) - startTime;
            long horas = elapsedTime / 3600;
            long minutos = (elapsedTime % 3600) / 60;
            long segundos = elapsedTime % 60;
            return String.format("%02d:%02d:%02d", horas, minutos, segundos);
        }
        return "00:00:00";
    }

    public void reiniciar(JButton numhabitacion) {
        tiempoOcupacion = 0;
        productos.clear();
        cantidades.clear(); // Si también deseas limpiar las cantidades asociadas a los productos
        ocupada = false;
        startTime = 0;
        historial.clear(); // Limpiar el historial de cobros y productos consumidos
        fechaHoraInicio = null; // Reiniciar la fecha de inicio
        numhabitacion.setBackground(Color.GREEN);
    }

    // Método para validar la placa
    public boolean validarPlaca(String placa) {
        return placa != null && placa.matches("[A-Za-z]{3}\\d{3}");
    }

    // Método para iniciar la habitación
    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    
    public void iniciarHabitacion(int numeroHabitacion, JButton botonHabitacion) {
        if (botonHabitacion == null) {
            JOptionPane.showMessageDialog(null, "Error: El botón de la habitación no puede ser nulo.");
            return;
        }
        if (ocupada) {
            JOptionPane.showMessageDialog(null, "La habitación " + numeroHabitacion + " ya está ocupada.");
        } else {
            try {
                String placa = JOptionPane.showInputDialog("Ingrese el número de la placa del vehículo:");
                if (placa == null || !validarPlaca(placa)) {
                    JOptionPane.showMessageDialog(null, "La placa debe tener 3 letras seguidas de 3 números.");
                    return;
                }
                this.placaVehiculo = placa;
                this.ocupada = true;
                botonHabitacion.setBackground(Color.BLUE);
                this.startTime = System.currentTimeMillis() / 1000;
                JOptionPane.showMessageDialog(null, "La habitación " + numeroHabitacion + " ha sido iniciada correctamente.");
                if (timer != null) {
                    timer.cancel();
                }
                timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        try {
                            SwingUtilities.invokeLater(() -> {
                                String tiempoOcupacion = tomarTiempoOcupacion();
                                botonHabitacion.setText("Habitación " + numeroHabitacion + " - Tiempo: " + tiempoOcupacion);
                            });
                        } catch (Exception e) {
                            System.err.println("Error al actualizar el tiempo de ocupación: " + e.getMessage());
                            e.printStackTrace();
                        }
                    }
                }, 0, 1000);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error al iniciar la habitación: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


    
    // Método para mostrar el historial
    public String mostrarHistorial() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("Número de habitación: ").append(numero).append("\n");
        sb.append("Fecha y hora de inicio: ").append(sdf.format(fechaHoraInicio)).append("\n");
        sb.append("Productos consumidos:\n");

        // Agregar los productos consumidos
        for (int i = 0; i < productos.size(); i++) {
            sb.append("- ").append(productos.get(i)).append(" (Cantidad: ").append(cantidades.get(i)).append(")\n");
        }

        // Agregar los registros del historial (cobros realizados)
        sb.append("\nHistorial de cobros:\n");
        for (String registro : historial) {
            sb.append(registro).append("\n");
        }

        return sb.toString();
    }


    // Método para agregar un cobro al historial
    public void agregarCobroAlHistorial(double totalPorTiempo, double totalProductos) {
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder sb = new StringBuilder();
        sb.append("Cobro realizado el ").append(new Date()).append("\n");
        sb.append("Tiempo total: ").append(df.format(totalPorTiempo)).append("\n");
        sb.append("Total por productos: ").append(df.format(totalProductos)).append("\n");
        sb.append("Total a pagar: ").append(df.format(totalPorTiempo + totalProductos)).append("\n");
        
        // Añadir la información de los productos consumidos
        sb.append("Productos consumidos:\n");
        for (int i = 0; i < productos.size(); i++) {
            sb.append("- ").append(productos.get(i))
              .append(" (Cantidad: ").append(cantidades.get(i)).append(")\n");
        }

        historial.add(sb.toString());
    }

    // Método para calcular el total y cobrar
    
    public double cobrar() {
        DecimalFormat df = new DecimalFormat("#.00");
        long tiempoTranscurrido = (System.currentTimeMillis() / 1000) - startTime;
        double horas = tiempoTranscurrido / 3600.0;
        double totalPorTiempo = horas * precioPorHora;
        String archivoProductos = "Productos.csv";
        double totalProductos = 0.0;

        StringBuilder detallesCobro = new StringBuilder();
        detallesCobro.append("Detalles del cobro:\n");
        detallesCobro.append("Tiempo transcurrido: ").append(df.format(horas)).append(" horas\n");
        detallesCobro.append("Precio por tiempo: $").append(df.format(totalPorTiempo)).append("\n\n");
        detallesCobro.append("Productos consumidos:\n");

        // Lista para almacenar los productos actualizados
        ArrayList<String[]> productosActualizados = new ArrayList<>();

        try {
            // Leer productos desde el archivo
            BufferedReader br = new BufferedReader(new FileReader(archivoProductos));
            String linea;
            while ((linea = br.readLine()) != null) {
                productosActualizados.add(linea.split(","));
            }
            br.close();

            // Recorrer los productos consumidos y actualizar existencias
            for (int i = 0; i < productos.size(); i++) {
                String productoSeleccionado = productos.get(i);
                int cantidadConsumida = cantidades.get(i);

                // Buscar el producto en el archivo
                boolean encontrado = false;
                for (String[] producto : productosActualizados) {
                    if (producto[0].equals(productoSeleccionado)) {
                        double precio = Double.parseDouble(producto[1]);
                        int existencia = Integer.parseInt(producto[2]);

                        // Verificar que haya suficiente existencia
                        if (cantidadConsumida <= existencia) {
                            // Descontar la cantidad consumida
                            producto[2] = String.valueOf(existencia - cantidadConsumida);
                            double costoProducto = precio * cantidadConsumida;
                            totalProductos += costoProducto;

                            detallesCobro.append("- ").append(productoSeleccionado)
                                         .append(" (Cantidad: ").append(cantidadConsumida)
                                         .append(", Precio unitario: $").append(df.format(precio))
                                         .append(", Total: $").append(df.format(costoProducto)).append(")\n");
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay suficiente existencia de " + productoSeleccionado);
                            return 0.0;  // Si no hay suficiente stock, cancelamos el cobro
                        }
                        encontrado = true;
                        break;
                    }
                }

                // Si no encontramos el producto en el archivo
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Producto " + productoSeleccionado + " no encontrado en el inventario.");
                    return 0.0;  // Si no se encuentra el producto, cancelamos el cobro
                }
            }

            // Escribir los productos actualizados en el archivo
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivoProductos));
            for (String[] producto : productosActualizados) {
                bw.write(String.join(",", producto));
                bw.newLine();
            }
            bw.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer o escribir el archivo de productos: " + e.getMessage());
            return 0.0;
        }

        detallesCobro.append("\nTotal por productos: $").append(df.format(totalProductos));
        detallesCobro.append("\nTotal a pagar: $").append(df.format(totalPorTiempo + totalProductos));

        // Agregar la información al historial
        agregarCobroAlHistorial(totalPorTiempo, totalProductos);

        // Mostrar el cobro en el cuadro de diálogo
        JOptionPane.showMessageDialog(null, detallesCobro.toString());
        return totalPorTiempo + totalProductos;
    }



    public static double obtenerPrecioProducto(String nombreProducto, String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            
            // Leer cada línea del archivo CSV
            while ((linea = br.readLine()) != null) {
                // Separar los datos de cada línea por la coma
                String[] datos = linea.split(",");
                
                // Asegurarse de que la línea tenga el formato adecuado
                if (datos.length == 3) {
                    String nombre = datos[0].trim();  // Nombre del producto
                    double precio = Double.parseDouble(datos[1].trim());  // Precio del producto
                    // int existencia = Integer.parseInt(datos[2].trim()); // Existencia (no utilizada en este caso)
                    
                    // Comparar el nombre del producto con el parámetro
                    if (nombre.equalsIgnoreCase(nombreProducto)) {
                        return precio;  // Devolver el precio si el nombre coincide
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Retornar -1 si el producto no se encuentra
        return -1;  // Producto no encontrado
    }

    
    public void agregarProducto() {
        if (!ocupada) {
            JOptionPane.showMessageDialog(null, "La habitación no está ocupada. No se pueden agregar productos.");
            return;
        }

        ArrayList<String[]> productosDisponibles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Productos.csv"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Suponemos que cada línea contiene: nombre, precio, existencia
                String[] producto = linea.split(",");
                productosDisponibles.add(producto);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de productos: " + e.getMessage());
            return;
        }

        // Crear un JComboBox solo con los nombres de los productos
        JComboBox<String> comboBox = new JComboBox<>();
        for (String[] producto : productosDisponibles) {
            comboBox.addItem(producto[0]); // Solo nombre
        }

        int opcion = JOptionPane.showConfirmDialog(
                null,
                comboBox,
                "Seleccione un producto:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (opcion == JOptionPane.OK_OPTION) {
            String productoSeleccionado = (String) comboBox.getSelectedItem();
            String cantidadStr = JOptionPane.showInputDialog("Ingrese la cantidad del producto:");

            // Buscar existencia del producto seleccionado
            String[] productoEncontrado = null;
            for (String[] producto : productosDisponibles) {
                if (producto[0].equals(productoSeleccionado)) {
                    productoEncontrado = producto;
                    break;
                }
            }

            try {
                int cantidad = Integer.parseInt(cantidadStr);
                int existencia = Integer.parseInt(productoEncontrado[2]);

                if (cantidad > 0 && cantidad <= existencia) {
                    this.productos.add(productoSeleccionado);
                    this.cantidades.add(cantidad);
                    JOptionPane.showMessageDialog(null, "Producto agregado correctamente.");
                } else if (cantidad > existencia) {
                    JOptionPane.showMessageDialog(null, "La cantidad no puede ser mayor a la existencia del producto.");
                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad debe ser un número positivo.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Cantidad inválida. Debe ser un número.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún producto.");
        }
    }
      
    
}
