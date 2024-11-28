package Modelo;

public class Producto {
    private String nombre;
    private double precio;
    private int existencia;

    public Producto() {
    }
    
    public Producto(String nombre, double precio, int existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    // Método para actualizar existencia
    public void actualizarExistencia(int cantidad) {
        if (this.existencia + cantidad < 0) {
            System.out.println("No se puede disminuir la existencia por debajo de cero.");
        } else {
            this.existencia += cantidad;
        }
    }

    // Método para aplicar un descuento al precio del producto
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("El porcentaje de descuento debe estar entre 0 y 100.");
        } else {
            this.precio -= this.precio * (porcentaje / 100);
        }
    }

    // Método para verificar disponibilidad
    public boolean verificarDisponibilidad(int cantidad) {
        return this.existencia >= cantidad;
    }
}
