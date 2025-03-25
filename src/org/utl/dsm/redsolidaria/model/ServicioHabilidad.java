/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

/**
 *
 * @author arlet
 */
public class ServicioHabilidad {
    private int idServicio;
    private int idHabilidad;

    public ServicioHabilidad(int idServicio, int idHabilidad) {
        this.idServicio = idServicio;
        this.idHabilidad = idHabilidad;
    }

    public ServicioHabilidad() {
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(int idHabilidad) {
        this.idHabilidad = idHabilidad;
    }
    
}
