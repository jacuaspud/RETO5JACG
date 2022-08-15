/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.Modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HOME
 */
public class Conexion {
Connection conectar = null;

    private final String db= "C:\\Users\\HOME\\Desktop\\jose.db";    

    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection("jdbc:sqlite:" + this.db );
        } catch (Exception e) {
            System.out.println("Jose dice:" + e.getMessage());
        }
        return conectar;
    }

   
    }

    

