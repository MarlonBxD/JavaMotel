package Modelo;


import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfDocument;
import com.lowagie.text.pdf.PdfWriter;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.JOptionPane;

public class Factura {
    private Habitacion habitacion;
    private Date fecha;
    private double total;
    private List<ItemFactura> items = new ArrayList<>();

    // Constructores
    public Factura() {
    }

    public Factura(Habitacion habitacion, Date fecha, double total) {
        this.habitacion = habitacion;
        this.fecha = fecha;
        this.total = total;
    }

    // Getters y Setters
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
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

    public void setItems(List<ItemFactura> items) {
        this.items = items;
        total = items.stream().mapToDouble(ItemFactura::getSubtotal).sum();
    }

    // Métodos
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
        StringBuilder info = new StringBuilder("Cliente: " + habitacion + "\n" +
                                               "Fecha: " + fecha + "\n" +
                                               "Items:\n");
        for (ItemFactura item : items) {
            info.append(item.mostrarInfoItem()).append("\n");
        }
        info.append("Total: ").append(total);
        return info.toString();
    }

    public void vaciarFactura() {
        items.clear();
        total = 0;
    } 

    public void generarFacturaConTirilla() throws DocumentException {
        String archivoNumeroFactura = "NumeroFactura.txt";
        int numeroFactura = leerYActualizarNumeroFactura(archivoNumeroFactura);

        // Formatear la fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = sdf.format(new Date());

        // Crear el contenido de la tirilla
        StringBuilder tirilla = new StringBuilder();
        tirilla.append("====================================\n")
               .append("         FACTURA N° ").append(numeroFactura).append("\n")
               .append("====================================\n")
               .append("Habitación: ").append(habitacion.getNumero()).append("\n")
               .append("Placa del vehículo: ").append(habitacion.getPlacaVehiculo()).append("\n")
               .append("Tiempo: ").append(habitacion.tomarTiempoOcupacion()).append("\n")
               .append("Fecha: ").append(fechaFormateada).append("\n")
               .append("====================================\n")
               .append("Items:\n")
               .append("Producto         Cantidad\n");

        // Iterar sobre los productos y sus cantidades
        List<String> productos = habitacion.getProductos();
        List<Integer> cantidades = habitacion.getCantidades();
        for (int i = 0; i < productos.size(); i++) {
            tirilla.append(String.format("%-15s %-10d\n", productos.get(i), cantidades.get(i)));
        }

        tirilla.append("====================================\n")
               .append("TOTAL: $").append(String.format("%.2f", habitacion.calcularCostoTotal())).append("\n")
               .append("====================================\n")
               .append("      ¡Gracias por su visita!      \n")
               .append("====================================\n")
               .append("              MotelApp             \n");

        // Guardar factura en PDF
        guardarFacturaComoPdf(numeroFactura, fechaFormateada, tirilla.toString());

        // Enviar la tirilla a la impresora
        imprimirTirilla(tirilla.toString());
    }



    private int leerYActualizarNumeroFactura(String archivo) {
        int numeroFactura = 1;

        try {
            File file = new File(archivo);
            if (file.exists()) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    numeroFactura = Integer.parseInt(br.readLine());
                }
            }

            // Incrementar el número de factura y actualizar el archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write(String.valueOf(numeroFactura + 1));
            }
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al leer o actualizar el número de factura: " + e.getMessage());
        }

        return numeroFactura;
    }

    private void imprimirTirilla(String contenidoFactura) {
        try {
            PrintService service = PrintServiceLookup.lookupDefaultPrintService();
            if (service == null) {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna impresora predeterminada.");
                return;
            }

            DocPrintJob job = service.createPrintJob();
            byte[] bytes = contenidoFactura.getBytes();
            Doc doc = new SimpleDoc(bytes, DocFlavor.BYTE_ARRAY.AUTOSENSE, null);
            PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
            attributes.add(new Copies(1));

            job.print(doc, attributes);
            JOptionPane.showMessageDialog(null, "Factura enviada a la impresora.");
        } catch (PrintException e) {
            JOptionPane.showMessageDialog(null, "Error al imprimir la factura: " + e.getMessage());
        }
    }

    private void guardarFacturaComoPdf(int numeroFactura, String fecha, String contenidoFactura) throws DocumentException {
        String nombreArchivoPdf = "Factura_" + numeroFactura + ".pdf";

        try {
            // Configurar el documento y el escritor
            com.lowagie.text.Document document = new com.lowagie.text.Document();
            PdfWriter.getInstance(document, new FileOutputStream(nombreArchivoPdf));

            // Abrir el documento
            document.open();

            // Añadir encabezado
            document.add(new com.lowagie.text.Paragraph("Factura N° " + numeroFactura));
            document.add(new com.lowagie.text.Paragraph("Fecha: " + fecha));
            document.add(new com.lowagie.text.Paragraph("\n"));

            // Añadir contenido
            for (String linea : contenidoFactura.split("\n")) {
                document.add(new com.lowagie.text.Paragraph(linea));
            }

            // Cerrar el documento
            document.close();

            JOptionPane.showMessageDialog(null, "Factura guardada como PDF: " + nombreArchivoPdf);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir el archivo PDF: " + e.getMessage());
        }
    }

}
