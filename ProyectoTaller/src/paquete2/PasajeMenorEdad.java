/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeMenorEdad extends PasajeInterCantonal 
        implements Serializable{
    
    private double atributo;

    public PasajeMenorEdad(String n, String c, String ori, String d, double n, double t) {
        super(n, c, ori, d, n, t);
    }
    
    
    
    public void establecerAtributo(double tipo){
        atributo = tipo;
    }
    public double obtenerAtributo(){
        return atributo;
    }
    
    public void establecerValorPasaje(){
        valorPasaje = (numDistancia*0.10)+(tarifaBase-(tarifaBase*(atributo/100)));
    }
    
}
