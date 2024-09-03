/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Model;

import com.mycompany.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author camper
 */
public class AsignarMisionDAO {
    private Conexion conexion;
    
    public AsignarMisionDAO() {
        this.conexion = Conexion.getInstance();
    }
    
    public boolean AsignarMision(int Id_Ninja, int Id_Mision) throws Exception {
        String sql = "INSERT INTO MisionNinja (Id_Ninja, Id_Mision, Fecha_Inicio, Fecha_Fin) VALUES (?, ?)";
         try (Connection conn = conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
             
             pstmt.setInt(1, Id_Ninja);
             pstmt.setInt(2, Id_Mision);
             
             int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            throw new Exception("Error al crear el empleado: " + e.getMessage());
        }
    }
}
