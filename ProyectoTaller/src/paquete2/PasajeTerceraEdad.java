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
public class PasajeTerceraEdad extends PasajeInterCantonal {

    public PasajeTerceraEdad(String nombrePasajero, String cedula, String origen, String destino, double numDistancia, double tarifaBase) {
        super(nombrePasajero, cedula, origen, destino, numDistancia, tarifaBase);
    }
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = (numDistancia*0.5)+(tarifaBase/2);
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Pasaje Transporte Tercera Edad: \n"
                + "Nombre del pasajero: %s\n"
                + "Cédula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Número de distancia: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Valor pasaje: %.2f\n", 
                obtenerNombrePasajero(),obtenerCedula(),obtenerOrigen(),
                obtenerDestino(),obtenerNumDistancia(),obtenerTarifaBase(),
                obtenerValorPasaje()); 
        return cadena;
    }
    
}
