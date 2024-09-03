/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author camper
 */

public class Propiedades {

    public Properties cargarArchivoProperties() throws IOException {
        Properties propiedades = new Properties();
        try (InputStream archivo = getClass().getClassLoader().getResourceAsStream("ConexionDB.properties")) {
            if (archivo == null) {
                throw new IOException("El archivo properties no se encontró en el classpath");
            }
            propiedades.load(archivo);
        }
        return propiedades;
    }
}