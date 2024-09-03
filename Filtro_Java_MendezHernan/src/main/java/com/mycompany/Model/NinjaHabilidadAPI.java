/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Model;

/**
 *
 * @author camper
 */
public class NinjaHabilidadAPI {
    private int Id_Habilidad;
    private int Id_Ninja;
    private String Nombre;
    private String DESCRIPCION;

    public NinjaHabilidadAPI(int Id_Habilidad, int Id_Ninja, String Nombre, String DESCRIPCION) {
        this.Id_Habilidad = Id_Habilidad;
        this.Id_Ninja = Id_Ninja;
        this.Nombre = Nombre;
        this.DESCRIPCION = DESCRIPCION;
    }

    public int getId_Habilidad() {
        return Id_Habilidad;
    }

    public void setId_Habilidad(int Id_Habilidad) {
        this.Id_Habilidad = Id_Habilidad;
    }

    public int getId_Ninja() {
        return Id_Ninja;
    }

    public void setId_Ninja(int Id_Ninja) {
        this.Id_Ninja = Id_Ninja;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDescription(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    
    
}
