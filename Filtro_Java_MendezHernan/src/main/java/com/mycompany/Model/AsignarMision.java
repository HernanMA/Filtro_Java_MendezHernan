/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Model;

/**
 *
 * @author camper
 */
public class AsignarMision {
    private int Id_Ninja;
    private int Id_Mision;

    public AsignarMision(int Id_Ninja, int Id_Mision) {
        this.Id_Ninja = Id_Ninja;
        this.Id_Mision = Id_Mision;
    }

    public int getId_Ninja() {
        return Id_Ninja;
    }

    public void setId_Ninja(int Id_Ninja) {
        this.Id_Ninja = Id_Ninja;
    }

    public int getId_Mision() {
        return Id_Mision;
    }

    public void setId_Mision(int Id_Mision) {
        this.Id_Mision = Id_Mision;
    }
    
    
}
