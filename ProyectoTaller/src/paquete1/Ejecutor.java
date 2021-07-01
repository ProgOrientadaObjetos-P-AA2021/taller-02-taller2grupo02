/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {
        
        /*
        Integrantes: Jose Criollo
                     Alejandra Paute
        */

        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();

        PasajeNormal pasajeNormal = new PasajeNormal("Jose Criollo",
                "1104803620", "Loja", "Catamyo", 800, 15, 5);
        
        PasajeTerceraEdad pasajeTerceraEdad = new PasajeTerceraEdad("Rosa",
                "1102321559", "Loja", "Catacocha", 500, 20);

        PasajeMenorEdad pasajeMenorEdad = new PasajeMenorEdad("Alejandra", "1150582755",
                "Loja", "Vicabamba",300.5, 20.3, 20);
        PasajeUniversitario pasajeUniversitario = new PasajeUniversitario("Santiago", 
                "123284733", "Zamora",
                "Loja", 440.5, 30.70, "Utpl");

        pasajes.add(pasajeMenorEdad);
        pasajes.add(pasajeUniversitario);
        pasajes.add(pasajeNormal);
        pasajes.add(pasajeTerceraEdad);
        
        for (int i = 0; i < pasajes.size(); i++) {
            pasajes.get(i).establecerValPasaje();
        }

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < pasajes.size(); i++) {

            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}

