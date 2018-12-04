/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12;

/**
 *
 * @author finfanterodal
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Garaje rosalia=new Garaje();
    rosalia.setCoche("GDG3213", "ford");
    Garaje rosalia2=new Garaje();
    rosalia2.setCoche("GDG3213", "ford");
    rosalia.comprobacionPlazas();
    rosalia2.comprobacionPlazas();
    rosalia2.calcularPrecio();
    rosalia.calcularPrecio();
    }
    
}
