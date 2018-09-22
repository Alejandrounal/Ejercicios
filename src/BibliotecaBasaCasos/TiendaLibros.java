
package BibliotecaBasaCasos;

import ExtensionLibros.Cliente;
import java.util.ArrayList;

public class TiendaLibros {
    private ArrayList<Libro> coleccion = new ArrayList<Libro>();
    private double caja = 1000000;
    private ArrayList<Cliente> clientes; 
    
    public TiendaLibros() {
        Libro l1 = new Libro("5569","Cien anos de soledad","Gabriel Garcia",20000,35000,5,"imagen");
        Libro l2 =new Libro("3635","Hora de aventura","Maria Fundillo",15600,17000,5,"imagen");
       coleccion.add(l2);
       coleccion.add(l1);
       
       this.clientes = new ArrayList<Cliente>();
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
     
     public void darLibromasCostoso(){
         Libro masCaro = coleccion.get(0);
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getpVenta() > masCaro.getpVenta()){
                 masCaro = coleccion.get(i);
             }
         }
         System.out.println("El libro mas caro es:  " + masCaro.mostrar());
     }
     
     public void darLibromasEconomico(){
         Libro masBarato = coleccion.get(0);
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getpVenta() < masBarato.getpVenta()){
                 masBarato = coleccion.get(i);
             }
         }
         System.out.println("El libro mas economico es:  " + masBarato.mostrar());
     }
     
     public void libromasVendido(){
         Libro masvendido = coleccion.get(0);
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getTransacciones().get(0).getCantidad() > masvendido.getTransacciones().get(0).getCantidad()){
              masvendido = coleccion.get(i);
             }
          }
         System.out.println("El libro mas vendido es:   " + masvendido.mostrar());
     }
     
     public int darCantidadAbastecimiento(String isbni){
         int conteo = 0;
         for (int i = 0; i < coleccion.size(); i++) {
             if(isbni.equals(coleccion.get(i).getIsbn())){
                 for (int j = 0; j < coleccion.get(i).getTransacciones().size(); j++) {
                 if(coleccion.get(i).getTransacciones().get(j).getTipo().equals("Abastecimiento")){
                    conteo = conteo+1;   
                     }
                 }           
             }
         }return conteo;
     }
     
     public void agregarCliente(String cedula, String nombres, String apellidos){
         Cliente cliente = new Cliente(cedula, nombres, apellidos);
         clientes.add(cliente);
     } 
     
     public Cliente buscarCliente(String cedula){
         Cliente resultado = new Cliente();
         for (int i = 0; i < clientes.size(); i++) 
             if(clientes.get(i).getCedula().equals(cedula))
                  resultado = clientes.get(i);
         return resultado;
     }
     
     public double calificacionPromedio(String isbn){
         int sumatoria = 0, veces=0;
         double promedio;
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getIsbn().equals(isbn)){
                 for (int j = 0; j < coleccion.get(i).getComentarios().size(); j++) {
                     sumatoria = sumatoria + coleccion.get(i).getComentarios().get(j).getCalificacion();
                     veces = veces+1;
                 }
             }
         } promedio = sumatoria/veces;
           return promedio;
     }
     
     public int librosConComentario(){
         int conteo = 0;
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getComentarios() != null){
                 conteo++;
             } 
         }return conteo;
     }
     
     public void nuevoComentario(String isbn,String cedula,String contenido, int calificion){
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getIsbn().equals(isbn)){
                 for (int j = 0; j < clientes.size(); j++) {
                     if(clientes.get(j).getCedula().equals(cedula)){
                         coleccion.get(i).agregarComentario(contenido, calificion, clientes.get(j));
                     }
                 }
             }
         }
     }
     
     public Libro buscarLibroLibro(String isbn){
         Libro l = new Libro();
         for (int i = 0; i < coleccion.size(); i++) {
             if(coleccion.get(i).getIsbn().equals(isbn)){
                 l = coleccion.get(i);
             }
         }return l;
     }
 
}
     
  
   