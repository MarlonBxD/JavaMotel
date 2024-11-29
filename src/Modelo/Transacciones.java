
package Modelo;

public class Transacciones {
    private String fecha;
    private int habitacion;
    private String placa;
    private String tiempo;
    //private String producto;
    //private int cantidad;
    private double total;

    public Transacciones() {
    }

    public Transacciones(String fecha, int habitacion, String placa, String tiempo, double total) {
        this.fecha = fecha;
        this.habitacion = habitacion;
        this.placa = placa;
        this.tiempo = tiempo;
        //this.producto = producto;
        //this.cantidad = cantidad;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
