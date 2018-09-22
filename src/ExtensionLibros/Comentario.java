/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExtensionLibros;

/**
 *
 * @author Alejandro
 */
public class Comentario {
    private String contenido;
    private int calificacion;
    
    private Cliente cliente;

    public Comentario(String contenido, int calificacion, Cliente cliente) {
        this.contenido = contenido;
        this.calificacion = calificacion;
        
        this.cliente = cliente;
    }

    public String getContenido() {
        return contenido;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    
}
