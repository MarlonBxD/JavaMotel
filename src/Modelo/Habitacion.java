package Modelo;

import Controlador.Procesos;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import Modelo.Factura;
import Modelo.Motel;
import com.lowagie.text.DocumentException;
import java.io.IOException;

public class Habitacion {
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
    private double precioPorHora;
    public ItemFactura itemf;
    private static int secondsElapsed = 0;

    public Habitacion() {
    }
    
    public Habitacion(int numero, String placaVehiculo) {
        this.numero = numero;
        this.tiempoOcupacion = 0;
        this.productos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.ocupada = false;
        this.startTime = 0;
        this.historial = new ArrayList<>();
        this.placaVehiculo = placaVehiculo;
        this.precioPorHora = 12000.0;
    }

    // Métodos getters y setters...

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

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public ItemFactura getItemf() {
        return itemf;
    }

    public void setItemf(ItemFactura itemf) {
        this.itemf = itemf;
    }

    // Método para iniciar la ocupación
//    public void iniciar(String placa) {
//        this.ocupada = true;
//        this.fechaHoraInicio = new Date();
//        this.startTime = System.currentTimeMillis();
//        this.historial.add("Habitación ocupada el: " + fechaHoraInicio+ " con placa: "+placa);
//        this.placaVehiculo=placa;
//    }
    
    public void reiniciar(JButton numhabitacion) {
        tiempoOcupacion = 0;
        productos.clear();
        cantidades.clear(); // Si también deseas limpiar las cantidades asociadas a los productos
        ocupada = false;
        startTime = 0;
        historial.clear(); // Limpiar el historial de cobros y productos consumidos
        fechaHoraInicio = null; // Reiniciar la fecha de inicio
        numhabitacion.setBackground(new Color(172, 255, 166));
    }
    
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
    
    // Método para tomar el timepo de la ocupación
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
                this.historial.add("Habitación ocupada el: " + fechaHoraInicio+ " con placa: "+placa);
                this.placaVehiculo=placa.toUpperCase();
                this.fechaHoraInicio = new Date();
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
                                botonHabitacion.setText("Habitación " + numeroHabitacion + " - " + tiempoOcupacion);
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
    // Método para finalizar la ocupación
    public void finalizar() {
        this.ocupada = false;
        long endTime = System.currentTimeMillis()/ 1000;
        this.tiempoOcupacion = (int) ((endTime - this.startTime) / 1000);
        this.historial.add("Habitación desocupada después de: " + this.tiempoOcupacion + " horas");
    }
    
    public boolean validarPlaca(String placa) {
        return placa != null && placa.matches("[A-Za-z]{3}\\d{3}");
    }

    // Método para agregar productos consumidos
    public void agregarProducto(String producto, int cantidad) throws IOException {
        this.productos.add(producto);
        this.cantidades.add(cantidad);
        this.historial.add("Producto agregado: " + producto + " Cantidad: " + cantidad);
        Procesos.descExistencia(producto, cantidad);
        try {
            Producto prod = new Producto(producto, Procesos.obtenerPrecioProducto(producto), cantidad); // Crear objeto Producto
            long tiempoActual = (System.currentTimeMillis() - this.startTime) / 1000; // Calcular tiempo en segundos
            itemf = new ItemFactura(prod, cantidad, tiempoActual);
            //this.itemsFactura.add(item);
        } catch (Exception e) {
            System.err.println("Error al agregar producto a la factura: " + e.getMessage());
        }
    }


    // Método para calcular el costo total de la ocupación
    public double calcularCostoTotal() {
        double costoTotal = 0.0;

        // Calcular el tiempo transcurrido en horas dinámicamente
        if (ocupada) {
            long elapsedTime = (System.currentTimeMillis() / 1000) - startTime; // Tiempo en segundos
            double tiempoOcupacion = elapsedTime / 3600.0; // Convertir a horas (puede incluir fracciones)
            costoTotal += tiempoOcupacion * this.precioPorHora; // Costo por tiempo de ocupación
        }

        double totalProductos = 0.0;

        // Calcular el costo total de los productos consumidos
        for (int i = 0; i < productos.size(); i++) {
            String nombreProducto = productos.get(i);
            int cantidad = cantidades.get(i);

            try {
                double precioProducto = Procesos.obtenerPrecioProducto(nombreProducto);
                totalProductos += precioProducto * cantidad;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al obtener el precio del producto: " + nombreProducto + ". " + e.getMessage());
            }
        }

        // Sumar el costo total de los productos al costo de la ocupación
        costoTotal += totalProductos;

        return costoTotal;
    }

    

    // Método para generar la factura (opcional)
    public String detalleFactura() {
        StringBuilder factura = new StringBuilder();
        long endTime = System.currentTimeMillis();
        factura.append("Factura de la habitación: ").append(this.numero).append("\n");
        factura.append("Placa del vehículo: ").append(this.placaVehiculo).append("\n");
        factura.append("Tiempo de ocupación: ").append(tomarTiempoOcupacion()).append("\n");
        factura.append("Productos consumidos:\n");
        for (int i = 0; i < this.productos.size(); i++) {
            factura.append(this.productos.get(i)).append(" x ").append(this.cantidades.get(i)).append("\n");
        }
        factura.append("Costo total: ").append(calcularCostoTotal()).append("\n");
        return factura.toString();
    }
    
    public void cobrar(JButton boton) throws DocumentException {
        // Calcular el costo total
        double total = calcularCostoTotal();

        // Detalle de la factura
        String detalle = detalleFactura();

        // Mostrar confirmación de cobro
        int confirmar = JOptionPane.showConfirmDialog(null, "Total a pagar: $" + total + "\n¿Desea generar la factura?", "Confirmar Cobro", JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION) {
            // Generar la factura usando la clase Factura
            Factura factura = new Factura(this, new Date(), total);
            factura.generarFacturaConTirilla();

            // Finalizar ocupación y reiniciar la habitación
            finalizar();
            reiniciar(boton);
            boton.setText("Habitación " + numero + " - Libre");
        }
    }

    
    public void mover(Habitacion habitacionDestino, Habitacion habitacionOrigen, JButton botonHabitacionOrigen, JButton botonHabitacionDestino) {
        if (habitacionOrigen.isOcupada()) {            
            habitacionDestino.setProductos(new ArrayList<>(habitacionOrigen.getProductos()));            
            habitacionDestino.setTimer(habitacionOrigen.getTimer());            
            habitacionDestino.setStartTime(habitacionOrigen.getStartTime());            
            habitacionDestino.setOcupada(true);
            botonHabitacionDestino.setBackground(Color.BLUE); // Por ejemplo, color azul para la habitación ocupada
            botonHabitacionDestino.setText("Ocupada");
            reiniciar(botonHabitacionOrigen);
            botonHabitacionOrigen.setText("Habitación " + habitacionOrigen.getNumero() + " - Libre" );
            if (habitacionDestino.getTimer() != null) {
                habitacionDestino.getTimer().cancel(); // Detener cualquier temporizador anterior
            }
            Timer timer = new Timer();
            habitacionDestino.setTimer(timer); // Guardar el nuevo temporizador
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    SwingUtilities.invokeLater(() -> {
                        // Actualizar el tiempo de ocupación de la habitación destino
                        String tiempoOcupacion = habitacionDestino.tomarTiempoOcupacion();
                        botonHabitacionDestino.setText("Habitación " + habitacionDestino.getNumero() + " - " + tiempoOcupacion);
                    });
                }
            }, 0, 1000); // Actualizar cada segundo
        }
    }
    
}
