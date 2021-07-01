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
<<<<<<< HEAD
public abstract class PasajeInterCantonal implements Serializable {
=======
public abstract class PasajeInterCantonal implements Serializable{
    
    protected String nombrePasajero;
    protected String cedula;
    protected String origen;
    protected String destino;
    protected double numDistancia;
    protected double tarifaBase;
    protected double valorPasaje;
    
    public PasajeInterCantonal(String n,String c,String ori,String d,double n,
            double t){
        
        
    }
       
    public void establecerNombrePasajero(String tipo){
        nombrePasajero = tipo;
    }
    public String obtenerNombrePasajero(){
        return nombrePasajero;
    }
    
    public void establecerCedula(String tipo){
        cedula = tipo;
    }
    public String obtenerCedula(){
        return cedula;
    }
    
    public void establecerOrigen(String tipo){
        origen = tipo;
    }
    public String obtenerOrigen(){
        return origen;
    }
    
    public void establecerDestino(String tipo){
        destino = tipo;
    }
    public String obtenerDestino(){
        return destino;
    }
    
    public void establecerNumDistancia(double tipo){
        numDistancia = tipo;
    }
    public double obtenerNumDistancia(){
        return numDistancia;
    }
    
    public void establecerTarifaBase(double tipo){
        tarifaBase = tipo;
    }
    public double obtenerTarifaBase(){
        return tarifaBase;
    }
    public abstract void establecerTarifaBase();
     
    public double obtenerValorPasaje(){
        return valorPasaje;
    }
>>>>>>> 9f201383d560599a10ff58847d492e9175466b13
    
   
    @Override
    public String toString(){
        return String.format("Pasaje.");
    }
    
    
}
