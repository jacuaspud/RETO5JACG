/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.Modelo.VO;

/**
 *
 * @author HOME
 */
public class Lider {
  
private int id_lider;
    private String miNombrecito;
    private String primer_apellido;
    private String ciudad_residencia; 
  

   
    public Lider(int id_lider, String nombre, String primer_apellido, String ciudad_residencia) {
        this.id_lider = id_lider;
        this.miNombrecito = nombre;
        this.primer_apellido = primer_apellido;
        this.ciudad_residencia = ciudad_residencia;
    }

    public int obtenerElIdDelLider() {
        return id_lider;
    }

    /*public void setId_lider(int id_lider) {
        this.id_lider = id_lider;
    }*/

    public String getNombre() {
        return miNombrecito;
    }

    public void setNombre(String nombre) {
        this.miNombrecito = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getCiudad_residencia() {
        return ciudad_residencia;
    }

    public void setCiudad_residencia(String ciudad_residencia) {
        this.ciudad_residencia = ciudad_residencia;
    }
    
    
    
}
