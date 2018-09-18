
package BibliotecaBasaCasos;

import java.util.*;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private double pCompra;
    private double pVenta;
    private int cantidadAct;
    private String rutaImagen;
    
    private ArrayList<Transaccion> transacciones = new ArrayList<Transaccion>();
    
    public Libro(String isbn, String titulo, String autor, double pCompra, double pVenta, int cantidadAct, String rutaImagen) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pCompra = pCompra;
        this.pVenta = pVenta;
        this.cantidadAct = cantidadAct;
        this.rutaImagen = rutaImagen;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getpCompra() {
        return pCompra;
    }

    public double getpVenta() {
        return pVenta;
    }

    public int getCantidadAct() {
        return cantidadAct;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public String mostrar() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", pCompra=" + pCompra + ", pVenta=" + pVenta + ", cantidadAct=" + cantidadAct + ", rutaImagen=" + rutaImagen + '}';
    }
    
    
    public void vender(int cantidad, String fecha){
        this.cantidadAct += cantidad;
        Transaccion tran = new Transaccion("Venta",fecha,cantidad);
        transacciones.add(tran);
    }
    
    public void abastecer(int cantidad,String fecha){
        this.cantidadAct += cantidad;
        Transaccion tran = new Transaccion("Abastecimiento",fecha,cantidad);
        transacciones.add(tran);
    }
    
    
}
