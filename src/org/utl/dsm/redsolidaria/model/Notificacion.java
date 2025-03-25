/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

import java.time.LocalDate;

/**
 *
 * @author arlet
 */
public class Notificacion {
    private int idNotificacion;
    private String tipo;
    private String contenido;
    private LocalDate fecha;
    private int estatus; 
    private Usuario usuario;
    private int idEvento;
    private int tipoEvento; 

    public Notificacion(int idNotificacion, String tipo, String contenido, LocalDate fecha, int estatus, Usuario usuario, int idEvento, int tipoEvento) {
        this.idNotificacion = idNotificacion;
        this.tipo = tipo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.estatus = estatus;
        this.usuario = usuario;
        this.idEvento = idEvento;
        this.tipoEvento = tipoEvento;
    }

    public Notificacion() {
    }

    public int getIdNotificacion() {
        return idNotificacion;
    }

    public void setIdNotificacion(int idNotificacion) {
        this.idNotificacion = idNotificacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public int getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(int tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    
    
}
