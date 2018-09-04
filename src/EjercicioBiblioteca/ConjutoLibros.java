/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioBiblioteca;

public class ConjutoLibros {
    
    private Libro[] coleccion = new Libro[5];

    public boolean agregarL(Libro libro){
        for (int i = 0; i < coleccion.length; i++) {
            if(coleccion[i] == null){
               coleccion[i] = libro;
               return true;
            }
        }return false;
    }
    
    public boolean eleminarAutor(String autor){
        for (int i = 0; i< coleccion.length ; i++) {
            if(coleccion[i].getAutor().equals(autor)){
                coleccion[i] =null;
                return true;
            }
        }return false;
    }
    
    public boolean eleminarTitulo(String titulo){
        for (int i = 0; i< coleccion.length ; i++) {
            if(coleccion[i].getTitulo().equals(titulo)){
                coleccion[i] =null;
                return true;
            }
        }return false;
    }
   
    public String mostrarMenor(){
        int indice = 0;
        int resultado = coleccion[0].getCalificacion();
        for (int i = 0; i < coleccion.length; i++) {
           if(coleccion[i].getCalificacion() < resultado){
               resultado= coleccion[i].getCalificacion();
               indice = i;
           }
        }return ("el menor puntuados es"+ coleccion[indice].mostrar());
    }   

    
    public String mostrarMayor(){
        int indice = 0;
        int resultado = coleccion[0].getCalificacion();
        for (int i = 0; i < coleccion.length; i++) {
           if(coleccion[i].getCalificacion() > resultado){
               resultado = coleccion[i].getCalificacion();
               indice = i;
           }
        }return ("el mejor puntuados es"+ coleccion[indice].mostrar());
    }   
    
    
   public void mostrarCole(){
       for (int i = 0; i < coleccion.length; i++) {
           System.out.println(coleccion[i].mostrar());
           System.out.println("");
       } 
}
}
