
package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Motel {
    private String nombre;
    private String direccion;
    private static List<Habitacion> habitaciones = new ArrayList<>(); // Lista estática de habitaciones
    private List<Object[]> reservas = new ArrayList<>();
    private List<Object[]> productos = new ArrayList<>();

    public Motel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        inicializarHabitaciones(); // Llamar al método para inicializar habitaciones
    }
    //Getters and Setters

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

    public static List<Habitacion> getHabitaciones() {
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
    

    public void setProductos(List<Object[]> productos) {
        this.productos = productos;
    }
    //meoto para agregar una habitacion 
    private static void inicializarHabitaciones() {
        if (habitaciones.isEmpty()) { // Solo inicializa si la lista está vacía
            for (int i = 1; i <= 6; i++) {
                habitaciones.add(new Habitacion(i, ""));
            }
        }
    }


    //meotodo para hacer una reserva
    public void realizarReserva(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        boolean disponible = true;

        // Verificar la disponibilidad de la habitación
        for (Object[] r : reservas) {
            Habitacion h = (Habitacion) r[0];
            LocalDate inicio = (LocalDate) r[1];
            LocalDate fin = (LocalDate) r[2];

            if (h.equals(habitacion) && 
                (inicio.isBefore(fechaFin) && fin.isAfter(fechaInicio))) {
                disponible = false;
                break;
            }
        }

        if (disponible) {
            // Almacena la reserva como un arreglo de objetos
            reservas.add(new Object[]{habitacion, fechaInicio, fechaFin});
            System.out.println("Reserva realizada exitosamente.");
        } else {
            System.out.println("La habitación no está disponible para las fechas solicitadas.");
        }
    }



    // Método para cancelar una reserva
    public void cancelarReserva(Habitacion habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        boolean cancelada = false;

        // Buscar la reserva y eliminarla
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


    
  
    
}

