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
public class PasajeNormal extends PasajeInterCantonal 
        implements Serializable{
    
    private double porcentajeAdicional;
    
    public PasajeNormal (double PA, String nombrePasajero, 
            String cedula, String origen, String destino, 
            double numDistancia, double tarifaBase) {
        super(nombrePasajero, cedula, origen, destino, numDistancia, tarifaBase);
        this.porcentajeAdicional = PA;
        
    }  

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double PA) {
        porcentajeAdicional = PA;
    }
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = (numDistancia*0.10)+(tarifaBase-(tarifaBase*(porcentajeAdicional/100)));
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Pasaje Transporte Menor de Edad: \n"
                + "Nombre del pasajero: %s\n"
                + "Cédula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Número de distancia: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Valor Base: %.2f\n", 
                obtenerNombrePasajero(),obtenerCedula(),obtenerOrigen(),
                obtenerDestino(),obtenerNumDistancia(),obtenerTarifaBase(),
                obtenerValorPasaje()); 
        return cadena;
    }
}
