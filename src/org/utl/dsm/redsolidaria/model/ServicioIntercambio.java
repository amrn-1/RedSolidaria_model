/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

/**
 *
 * @author arlet
 */
public class ServicioIntercambio {
    private int idServicio;
    private int idIntercambio;

    public ServicioIntercambio(int idServicio, int idIntercambio) {
        this.idServicio = idServicio;
        this.idIntercambio = idIntercambio;
    }

    public ServicioIntercambio() {
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdIntercambio() {
        return idIntercambio;
    }

    public void setIdIntercambio(int idIntercambio) {
        this.idIntercambio = idIntercambio;
    }
    
    
}
