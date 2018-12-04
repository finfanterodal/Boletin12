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
public class Coche {
//Atributos

    private String matricula;
    private String marca;
//Constructores

    public Coche() {
    }

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

 
//Getters y Setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
//ToString

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + '}';
    }
    
}
