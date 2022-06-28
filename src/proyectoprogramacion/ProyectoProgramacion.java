/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogramacion;

import Ficha.Libro;

/**
 *
 * @author joelv
 */
public class ProyectoProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro();
        System.out.println(libro.getAutor(0));
        }
    
}
