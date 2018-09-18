
package BibliotecaBasaCasos;

import java.util.ArrayList;

public class TiendaLibros {
    private ArrayList<Libro> coleccion = new ArrayList<Libro>();
    private double caja = 1000000;

    public TiendaLibros() {
        Libro l1 = new Libro("5569","Cien anos de soledad","Gabriel Garcia",15600,17000,5,"imagen");
        Libro l2 =new Libro("3635","Hora de aventura","Maria Fundillo",15600,17000,5,"imagen");
       coleccion.add(l2);
       coleccion.add(l1);
    }
    
    public void darCatalogo(){
        System.out.println("Coleccion:     ");
        for (int i = 0; i < coleccion.size(); i++) {
            Libro libro = coleccion.get(i);
            System.out.println(libro.mostrar());
        }
    }    

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
    
    public boolean registrarLibro(String titulo, String isbn, String autor, double pVenta, double pCompra, String rutaImagen){
        for (int i = 0; i < coleccion.size(); i++) {
            Libro libro = coleccion.get(i);
            if(libro.getIsbn() != isbn){
                Libro entrada = new Libro(isbn,titulo, autor, pCompra, pVenta,1,rutaImagen);
                coleccion.add(entrada);
                return true;
            }
        } return false;   
    }
    
    public void buscarLibroporIsbn(String isbn){
        int p = 0;
         for (int i = 0; i < coleccion.size(); i++) {
            Libro libro = coleccion.get(i);
            if(libro.getIsbn().equals(isbn)){
                System.out.println(libro.mostrar());
                p = 2;
            }      
         }
         if(p ==0){
             System.out.println("El isbn no se encontro");
         }   
    }
    
     public void buscarLibroporTitulo(String isbn){
        int p = 0;
         for (int i = 0; i < coleccion.size(); i++) {
            Libro libro = coleccion.get(i);
            if(libro.getTitulo().equals(isbn)){
                System.out.println(libro.mostrar());
                p = 2;
            }      
         }
         if(p ==0){
             System.out.println("El isbn no se encontro");
         }   
    }
     
    public boolean eliminarLibroporIsbn(String isbn){
        for (int i = 0; i < coleccion.size(); i++) {
            Libro libro = coleccion.get(i);
            if(libro.getIsbn().equals(isbn)){
                coleccion.remove(i);
                return true;
            }
        }return false;
    }  
    
    public boolean abastecer(String isbn, int cantidad, String fecha){
         for (int i = 0; i < coleccion.size(); i++) {
            Libro libro = coleccion.get(i);
            if(libro.getIsbn() != isbn){
                libro.abastecer(cantidad, fecha);
                return true;
            }
         }return false;
    }     
              
     public boolean vender(String isbn, int cantidad, String fecha){
         for (int i = 0; i < coleccion.size(); i++) {
            Libro libro = coleccion.get(i);
            if(libro.getIsbn() != isbn){
                libro.vender(cantidad, fecha);
                return true;
            }
         }return false;
    }     
}

   
   