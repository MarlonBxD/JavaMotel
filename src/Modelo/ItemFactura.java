
package Modelo;


public class ItemFactura {
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public ItemFactura() {
    }
     
    public ItemFactura(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    //Metodos
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }
    
    public String mostrarInfoItem() {
        return "Producto: " + producto.getNombre() +
               ", Cantidad: " + cantidad +
               ", Precio Unitario: " + producto.getPrecio() +
               ", Subtotal: " + calcularSubtotal();
    }
    
    public void aumentarCantidad(int incremento) {
        if (incremento > 0) {
            this.cantidad += incremento;
            this.subtotal = calcularSubtotal(); // Actualiza el subtotal
        }
    }
    
   public void disminuirCantidad(int decremento) {
        if (decremento > 0 && cantidad - decremento >= 0) {
            this.cantidad -= decremento;
            this.subtotal = calcularSubtotal(); // Actualiza el subtotal
        }
    }
    
}
