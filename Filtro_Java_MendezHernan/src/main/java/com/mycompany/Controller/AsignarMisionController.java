/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controller;

import com.mycompany.Model.AsignarMisionDAO;
import com.mycompany.View.AsignarMision;
import javax.swing.JOptionPane;

/**
 *
 * @author camper
 */
public class AsignarMisionController {
    private AsignarMisionDAO AsignarMisionDAO;
    private AsignarMision AsignarMisionview;

    public AsignarMisionController(AsignarMisionDAO AsignarMisionDAO, AsignarMision AsignarMisionview) {
        this.AsignarMisionDAO = AsignarMisionDAO;
        this.AsignarMisionview = AsignarMisionview;
    }
    
    public boolean AsignarMision(int Id_Ninja, int Id_Mision) throws Exception {
        try {
            boolean success = AsignarMisionDAO.AsignarMision(Id_Ninja, Id_Mision);
            if (success) {
                System.out.println("Mision Asignada Exitosamente");
            }
            return success;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(AsignarMisionview, e.getMessage()); 
            return false;
        }
    }
}
