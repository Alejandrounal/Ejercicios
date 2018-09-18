/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotecaBasaCasos;

/**
 *
 * @author Alejandro
 */
public class Transaccion {
    
    private String tipo;
    private String fecha;
    private int cantidad;

    public Transaccion(String tipo, String fecha, int cantidad) {
        this.tipo = tipo;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    
    
    public String getTipo() {
        return tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
}
