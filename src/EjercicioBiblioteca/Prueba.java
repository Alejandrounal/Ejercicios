
package EjercicioBiblioteca;
import java.util.*;
public class Prueba {
    
    public static void main(String[] args) {
        
        ConjutoLibros conjunto = new ConjutoLibros();
        Scanner leer = new Scanner(System.in);
        int entrada = 0;
        
        while(entrada != 12){
            System.out.println("Que desea hacer   1. Agregar libro   2.Eliminar por autor   3. Eliminar por titulo    4.Mejor puntuado     5.Peor puntuado    6.Ver la biblioteca  7.Salir de la biblioteca");
            entrada = leer.nextInt();
        switch(entrada){
            case 1:
                System.out.println("Cuantos libros desea agregar entre 1 y 5:   ");
                int cuantos = leer.nextInt();
                for (int i = 0; i < cuantos; i++) {
                    System.out.println("ingrese el autor del libro "+(i+1)+":  ");
                    String autor = leer.next();
                    System.out.println("Ingrese el titulo del libro "+(i+1)+":  ");
                    String titulo = leer.next();
                    System.out.println("ingrese el numero de paginas del libro "+(i+1)+":  ");
                    int paginas = leer.nextInt();
                    System.out.println("Ingrese la calificacion del libro "+(i+1)+":  ");
                    int calificacion = leer.nextInt();
                    conjunto.agregarL(new Libro(autor,titulo,paginas,calificacion));
                }
                break;
            case 2:
                System.out.println("Ingrese el autor:   ");
                String autor = leer.next();
                conjunto.eleminarAutor(autor);
                break;
            case 3:
                System.out.println("Ingrese el titulo:   ");
                String titulo = leer.nextLine();
                conjunto.eleminarTitulo(titulo);
                break;
            case 4:
                System.out.println(conjunto.mostrarMayor());
                break;
            case 5:
                System.out.println(conjunto.mostrarMenor());
                break;
            case 6:
                conjunto.mostrarCole();
                break;
            case 7: 
                System.exit(0);
                break;
            default: 
                System.out.println("Opcion incorrecta");
                break;
        }
        
    }
    }
}
