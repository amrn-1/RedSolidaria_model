/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

/**
 *
 * @author arlet
 */
public class UsuarioHabilidad {
    private int idUsuario;
    private int idHabilidad;

    public UsuarioHabilidad(int idUsuario, int idHabilidad) {
        this.idUsuario = idUsuario;
        this.idHabilidad = idHabilidad;
    }

    public UsuarioHabilidad() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdHabilidad() {
        return idHabilidad;
    }

    public void setIdHabilidad(int idHabilidad) {
        this.idHabilidad = idHabilidad;
    }
    
    
}
