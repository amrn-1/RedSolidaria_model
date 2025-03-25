/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

/**
 *
 * @author arlet
 */
public class Habilidad {
    private int idHabilidad;
    private String nombre;

    public Habilidad(int idHabilidad, String nombre) {
        this.idHabilidad = idHabilidad;
        this.nombre = nombre;
    }

    public Habilidad() {
    }

    public int getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(int idHabilidad) {
        this.idHabilidad = idHabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
