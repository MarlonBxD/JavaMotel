package Modelo;

public class Producto {
    private String nombre;
    private double precio;
    private int existencia;

    public Producto(String nombre, double precio, int existencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getExistencia() {
        return existencia;
    }

}
