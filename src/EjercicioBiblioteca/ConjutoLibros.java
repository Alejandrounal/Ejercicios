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
       int indice = 0;
        while(coleccion[indice] != null){
            if(coleccion[indice].getAutor().equals(autor)){
                coleccion[indice]=null;
                return true;
            }indice++;
        }return false;
    }
    
    public boolean eleminarTitulo(String titulo){
        int indice = 0;
        while(coleccion[indice] != null){
            if(coleccion[indice].getTitulo().equals(titulo)){
                coleccion[indice]=null;
                return true;
            }indice++;
        }return false;
    }
   
    public String mostrarMenor(){
        int indice = 0;
        int resultado = coleccion[0].getCalificacion();
        int subindice = 0;
        while(coleccion[indice] != null){
            if(coleccion[indice].getCalificacion() < resultado ){
                resultado = coleccion[indice].getCalificacion();
                subindice = indice;
            }indice++;
        }return("el mejor puntuado es  "+coleccion[subindice].mostrar());
    }   

    public String mostrarMayor(){
        int indice = 0;
        int resultado = coleccion[0].getCalificacion();
        int subindice = 0;
        while(coleccion[indice] != null){
            if(coleccion[indice].getCalificacion() > resultado ){
                resultado = coleccion[indice].getCalificacion();
                subindice = indice;
            }indice++;
        }return("el mejor puntuado es  "+coleccion[subindice].mostrar());
    }   
    
    
   public void mostrarCole(){
        int indice = 0;  
        while(coleccion[indice] != null){
            System.out.println(coleccion[indice].mostrar());
            System.out.println("");
            indice++;
        }   
       }
}

