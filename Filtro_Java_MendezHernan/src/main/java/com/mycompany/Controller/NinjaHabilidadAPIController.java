/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controller;
import com.mycompany.Model.NinjaHabilidadAPI;
import com.mycompany.Model.NinjaHabilidadAPIDAO;
import com.mycompany.View.NinjasHabilidad;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author camper
 */
public class NinjaHabilidadAPIController {
    private NinjaHabilidadAPIDAO NinjaHabilidadDAO;
    private NinjasHabilidad NinjaHabilidadview;

    public NinjaHabilidadAPIController(NinjaHabilidadAPIDAO NinjaHabilidadDAO, NinjasHabilidad NinjaHabilidadview) {
        this.NinjaHabilidadDAO = NinjaHabilidadDAO;
        this.NinjaHabilidadview = NinjaHabilidadview;
    }

    public void updateTableStadistics() {
        List<NinjaHabilidadAPI> Description = NinjaHabilidadDAO.getNinjaHabilidad();
        DefaultTableModel model = (DefaultTableModel) NinjaHabilidadview.getTableStadistics().getModel();
    
        model.setRowCount(0);
        
        Description.stream()
                .map(stat -> new Object[]{
                    stat.getId_Ninja(),
                    stat.getDESCRIPCION(),
                    stat.getId_Habilidad(),
                    stat.getNombre()
                })
                .forEach(model::addRow);
    }
}
