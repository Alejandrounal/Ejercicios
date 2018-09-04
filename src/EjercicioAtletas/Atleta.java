
package EjercicioAtletas;

/**
 *
 * @author Alejandro
 */
public class Atleta {
    private String nombre;  // declaracion de variables
    private int numero;
    private float tiempo;

    public Atleta(String nombre, int numero, float tiempo) {
        this.nombre = nombre;
        this.numero = numero;
        this.tiempo = tiempo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public float getTiempo() {
        return tiempo;
    }
    
    public String mostrar(){
       return (nombre+" "+numero+"  "+tiempo);
    }
}

