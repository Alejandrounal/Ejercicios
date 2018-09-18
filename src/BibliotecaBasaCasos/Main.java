/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BibliotecaBasaCasos;

/**
 *
 * @author Alejandro
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        TiendaLibros tienda = new TiendaLibros();
        tienda.darCatalogo();
        
            double pCompra, pVenta;
            String titulo, autor, isbn, rutaImagen;
            /*
            System.out.println("itroduzca el isbn ");
            isbn = leer.next();
            System.out.print(" tutulo     ");
            titulo = leer.next();
            System.out.println("autor     ");
            autor = leer.next();
            System.out.println("precio venta ");
            pVenta = leer.nextDouble();
            System.out.print(" precio compra     ");
            pCompra = leer.nextDouble();
            System.out.println("Ruta Imagen     ");
            rutaImagen = leer.next();
            
            tienda.registrarLibro(titulo, isbn, autor, pVenta, pCompra, rutaImagen);
            tienda.darCatalogo();
            */
            String fecha;
            int cantidad;
        System.out.println("itroduzca el isbn ");
        isbn = leer.next();
        System.out.println("itroduzca la fecha");
        fecha = leer.next();
         System.out.println("itroduzca la cantidad ");
        cantidad = leer.nextInt();
        tienda.abastecer(isbn, cantidad, fecha);     
        tienda.darCatalogo();
    
    }
        
    }

