/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioAtletas;

import java.util.Scanner;

public class main {
    
    public static int tiempoGanador(Atleta atletas[]){
        float mejor = atletas[0].getTiempo();
        int indice = 0;
        for (int i = 0; i < atletas.length; i++) {
            if(mejor > atletas[i].getTiempo()){
                mejor =atletas[i].getTiempo();
                indice = i;
            }
            
        }
       return indice;
    }
    
    public static void main(String[] args) {
        String nombre;
        int numero;
        float tiempo;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca cuantos atletas competiran:   ");
        int numeroAtletas = leer.nextInt();
        Atleta[] atletas = new Atleta[numeroAtletas];
        
        for (int i = 0; i < atletas.length; i++){
            System.out.println("itroduzca los datos del atleta "+ i+1);
            System.out.print("Nombre  ");
            nombre = leer.next();
            System.out.print("\nNumero   ");
            numero = leer.nextInt();
            System.out.println("\ntiempo   ");
            tiempo = leer.nextFloat();
            
            atletas[i] = new Atleta(nombre,numero,tiempo);
        }
        
        System.out.println("El ganador de la carrera fue:   ");
        System.out.println(atletas[tiempoGanador(atletas)].getNombre());
        System.out.println(atletas[tiempoGanador(atletas)].getNumero());
        System.out.println(atletas[tiempoGanador(atletas)].getTiempo());
        System.out.println(atletas[tiempoGanador(atletas)].mostrar());
    }
}
