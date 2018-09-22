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
        tienda.abastecer(isbn, cantidad, fecha);
        tienda.darCatalogo();
        tienda.darLibromasCostoso();
        tienda.darLibromasEconomico();
        tienda.vender("3635", 5, "12 de Octubre");
        tienda.libromasVendido();
        System.out.println("El numero de transacciones es:  "+ tienda.darCantidadAbastecimiento(isbn));
        tienda.agregarCliente("102526","Juan Orlando", "Perez Rojas");
        tienda.nuevoComentario(isbn, "102526", "Muy buen libro", 5);
        System.out.println("La calificacion promedio es :  " + tienda.calificacionPromedio(isbn));
        tienda.buscarLibroLibro(isbn).darComentarios();
        tienda.agregarCliente("1515","Pedro amigo", "Amargo LImon");
        tienda.nuevoComentario(isbn, "1515", "El libro es bueno pero largo", 1);
         System.out.println("La calificacion promedio es :  " + tienda.calificacionPromedio(isbn));
        tienda.buscarLibroLibro(isbn).darComentarios();
    }
        
    }

