package boletin12;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Garaje {

    //Atributos
    private static int numCoches = 2;
    private Coche coche;
    private Date entrada;
    private Date salida;
    private double precio;
    private int tiempo;
    private String factura;
    private double pagado, devuelto;

    //Constructor
    public Garaje() {
        coche = new Coche();
    }

    //Getters/Setters
    public int getNumCoches() {
        return numCoches;
    }

    public void setNumCoches(int numCoches) {
        this.numCoches = numCoches;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(String matricula, String marca) {
        coche.setMatricula(matricula);
        coche.setMarca(marca);
    }

    //ToString
    public String toString() {
        return "Garaje{" + "numCoches=" + numCoches + ", coche=" + coche + '}';
    }

    //Comprobación plazas que hay disponibles, depende del valor del static numCoches.
    public void comprobacionPlazas() {
        if (numCoches >= 1) {
            entrada = new Date();
            entrada.getTime();
            JOptionPane.showMessageDialog(null, "PLAZAS DISPONIBLES: " + numCoches);
            numCoches = numCoches - 1;
        } else {
            JOptionPane.showMessageDialog(null, "COMPLETO");
        }
    }

    //Calcular precio, 1.5 euros por 3 horas, y luego por cada hora 0.20 más, en este caso una hora serían 1000ms, osea un segundo más o menos.
    public void calcularPrecio() {
        salida = new Date();
        tiempo =(int)(salida.getTime() -entrada.getTime());
        JOptionPane.showMessageDialog(null, tiempo);
        if (tiempo <= 3000) {
            precio = 1.5;
        } else {
            precio = (Math.round(1.5 + 0.2 *(tiempo/1000)));
        }
        JOptionPane.showMessageDialog(null, "Precio a pagar " + precio + " euros.");
        pagar();
        visualizarFactura();
    }
//Método para saber lo hemos pagado, y que nos indique si hemos introducido menos dinero, cuanto nos falta hasta que introduzcamos todo.
    public void pagar() {
        pagado = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a pagar"));
        if (pagado > precio) {
            devuelto = Math.round(Math.abs(precio - pagado));
        } else {
            double resto = precio - pagado;
            double totalPagado = pagado;
            do {
                pagado = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad que falta " + (resto)));
                resto = resto - pagado;
                totalPagado = totalPagado + pagado;
            } while (resto >= 0);
            devuelto = Math.abs(precio - totalPagado);
            pagado = totalPagado;
        }
    }
//Método para visualidar la factura final, dónde se muestran los siguientes datos:
    public String visualizarFactura() {
        JOptionPane.showMessageDialog(null, "FACTURA: "
                + "\nMATRICULA COCHE: " + coche.getMatricula()
                + "\nTIEMPO: " + tiempo /1000 + " horas"
                + "\nPRECIO: " + precio + " euros"
                + "\nDINERO RECIBIDO: " + pagado + " euros"
                + "\nDINERO DEVUELTO: " + devuelto + " euros"
                + "\nGRACIAS POR USAR ESTE APARCAMIENTO.");
        return factura;
    }

}
