
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private Cliente cliente;
    private Date fecha;
    private double total;
    private List<ItemFactura> items = new ArrayList<>();

    public Factura(Cliente cliente1, Date date, double par) {
    }

    public Factura(Cliente cliente, Date fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<ItemFactura> getItems() {
        return items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
        total = 0;          
        for (ItemFactura item : items) { 
            total += item.getSubtotal(); 
        }
    }
    
    //Metodos
        
    public void agregarItem(ItemFactura item) {
        items.add(item);         
        total += item.getSubtotal(); 
    }
    
     public void eliminarItem(ItemFactura item) {
        if (items.remove(item)) { 
            total -= item.getSubtotal(); 
        }
    }
    
     public String mostrarInfoFactura() {
        String info = "Cliente: " + cliente.getNombre() + "\n" +
                      "Fecha: " + fecha + "\n" +
                      "Items:\n"; 

        for (ItemFactura item : items) { 
            info += item.mostrarInfoItem() + "\n"; 
        }

        info += "Total: " + total; 
        return info; 
    }
     
     public void vaciarFactura() {
        items.clear();  // Elimina todos los items de la lista
        total = 0;      
    }
}
