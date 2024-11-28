package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Motel {
    private String nombre;
    private String direccion;
    private List<Habitacion> habitaciones; 
    private List<Object[]> reservas;
    private List<Producto> productos;

    public Motel() {
    }
    
    public Motel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.productos = new ArrayList<>();
    }

    // Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Object[]> getReservas() {
        return reservas;
    }

    public void setReservas(List<Object[]> reservas) {
        this.reservas = reservas;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    // Método para agregar una habitación
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    // Método para realizar una reserva
    public void realizarReserva(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        boolean disponible = true;

        // Verificar la disponibilidad de la habitación
        for (Object[] r : reservas) {
            Habitacion h = (Habitacion) r[0];
            LocalDate inicio = (LocalDate) r[1];
            LocalDate fin = (LocalDate) r[2];

            if (h.equals(habitacion) && (inicio.isBefore(fechaFin) && fin.isAfter(fechaInicio))) {
                disponible = false;
                break;
            }
        }

        if (disponible) {
            reservas.add(new Object[]{habitacion, fechaInicio, fechaFin});
            JOptionPane.showMessageDialog(null, "Reserva realizada exitosamente.");
        } else {
            JOptionPane.showMessageDialog(null, "La habitación no está disponible para las fechas solicitadas.");
        }
    }

    // Método para cancelar una reserva
    public void cancelarReserva(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        boolean cancelada = false;

        for (Object[] r : reservas) {
            Habitacion h = (Habitacion) r[0];
            LocalDate inicio = (LocalDate) r[1];
            LocalDate fin = (LocalDate) r[2];

            if (h.equals(habitacion) && inicio.equals(fechaInicio) && fin.equals(fechaFin)) {
                reservas.remove(r);
                cancelada = true;
                System.out.println("Reserva cancelada exitosamente.");
                break;
            }
        }

        if (!cancelada) {
            System.out.println("No se encontró la reserva para cancelar.");
        }
    }

    // Método para listar todas las habitaciones
    public void listarHabitaciones() {
        for (Habitacion habitacion : habitaciones) {
            System.out.println("Habitación número: " + habitacion.getNumero());
            System.out.println("Estado: " + (habitacion.isOcupada() ? "Ocupada" : "Libre"));
            System.out.println("Placa del vehículo: " + habitacion.getPlacaVehiculo());
            System.out.println("--------------------------------");
        }
    }
    // Método para buscar una habitación por su número
    private Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                return habitacion;
            }
        }
        return null;
    }
}
