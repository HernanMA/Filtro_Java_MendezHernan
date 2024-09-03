/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.util.Conexion;

/**
 *
 * @author camper
 */
public class NinjaHabilidadAPIDAO {
    
    public List<NinjaHabilidadAPI> getNinjaHabilidad() {
        List<NinjaHabilidadAPI> Description = new ArrayList<>();
        String query = "SELECT * FROM Habilidad";
        
        try (Connection conn = Conexion.getInstance().conectar();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                NinjaHabilidadAPI stats = new NinjaHabilidadAPI(
                rs.getInt("Id_Habilidad"),
                rs.getInt("Id_Ninja"),
                rs.getString("Nombre"),
                rs.getString("DESCRIPCION")
                );
                Description.add(stats);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Description;
    }
}
