/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.Modelo.DAO;

import com.mycompany.reto5.Modelo.VO.Lider;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HOME
 */
public class PrimerConsulta {

public void primerconsulta(DefaultTableModel modelo){
        
        
        Lider licercillo = null;
        
        
        
        try {
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT Id_Lider, Names, Primer_Apellido, Ciudad_Residencia FROM Leader ORDER BY Ciudad_Residencia");
            
            
            while(rs.next()){
                
                /*licercillo.setId_lider(rs.getInt(1));
                licercillo.setNombre(rs.getString(2));
                licercillo.setPrimer_apellido(rs.getString(3));
                licercillo.setCiudad_residencia(rs.getString(4));*/
                licercillo = new Lider( rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                modelo.addRow(new Object[]{licercillo.obtenerElIdDelLider(), licercillo.getNombre(), licercillo.getPrimer_apellido(),licercillo.getCiudad_residencia()});
            }
            
            
            rs.close();
            cn.close();
            
            
        } catch (SQLException ex) {
         System.out.println("Consulta ERROR:" + ex.getMessage());

            Logger.getLogger(PrimerConsulta.class.getName()).log(Level.SEVERE, null, ex);
} 
        //return lista;
    }
    
}
