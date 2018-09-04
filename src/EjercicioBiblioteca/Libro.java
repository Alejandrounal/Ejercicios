/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioBiblioteca;



public class Libro {
    private String autor;
    private String titulo;
    private int numPaginas;
    private int calificacion;

    public Libro(String autor, String titulo, int numPaginas, int calificacion) {
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        this.calificacion = calificacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getCalificacion() {
        return calificacion;
    }
    
    public String mostrar(){
        return (titulo+" "+autor+"  "+numPaginas+"   "+calificacion);
    }
    
}
