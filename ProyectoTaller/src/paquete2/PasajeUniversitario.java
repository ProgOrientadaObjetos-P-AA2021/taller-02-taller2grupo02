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
public class PasajeUniversitario extends PasajeInterCantonal {
    
    private String nombre;

    public PasajeUniversitario(String nombre, String nombrePasajero, String cedula, String origen, String destino, double numDistancia, double tarifaBase) {
        super(nombrePasajero, cedula, origen, destino, numDistancia, tarifaBase);
        this.nombre = nombre;
    }
    
    public void establecerNombre(String tipo){
        nombre = tipo;
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = tarifaBase/2;
        
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Pasaje Transporte Universitario: \n"
                + "Nombre del pasajero: %s\n"
                + "Cédula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Nombre Universidad: %s\n"
                + "Número de distancia: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Valor pasaje: %.2f\n", 
                obtenerNombrePasajero(),obtenerCedula(),obtenerOrigen(),
                obtenerDestino(),obtenerNombre(),obtenerNumDistancia(),obtenerTarifaBase(),
                obtenerValorPasaje()); 
        return cadena;
    }
    
}
