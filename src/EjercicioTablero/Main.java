/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTablero;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Tablero objeto = new Tablero(0,0);
        Scanner leer = new Scanner(System.in);
        String nombre = JOptionPane.showInputDialog("Inserte nombre");  
        int entrada = 0;
        while(entrada != 6) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Usario  " + nombre +" que desea hacer:  1. agregar movimiento     2. ver coordenadas      3.terminar programa "));
            switch(entrada){
                case 1:
                    int movimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hacia donde desea moverse:   1. arriba    2. abajo    3. izquierda   4.derecha"));
                    switch(movimiento){
                        case 1:
                            objeto.moverArriba();
                            break;
                        case 2:
                            objeto.moverAbajo();
                            break;
                        case 4:
                            objeto.moverDerecha();
                            break;
                        case 3:
                            objeto.moverIzquierda();
                            break;
                        default:
                            System.out.println("Moviento no valido");
                            break;           
                    }
                    break;
                case 2:
                    System.out.println(objeto.getX() + "  "+ objeto.getY());
                     break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        
    }
}
