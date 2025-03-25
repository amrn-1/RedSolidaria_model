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
public class Mensaje {
    private int idMensaje;
    private String contenido;
    private int tipoContenido; 
    private LocalDate fechaEnvio;
    private int estatus; 
    private int idRemitente;
    private int idDestinatario;

    public Mensaje(int idMensaje, String contenido, int tipoContenido, LocalDate fechaEnvio, int estatus, int idRemitente, int idDestinatario) {
        this.idMensaje = idMensaje;
        this.contenido = contenido;
        this.tipoContenido = tipoContenido;
        this.fechaEnvio = fechaEnvio;
        this.estatus = estatus;
        this.idRemitente = idRemitente;
        this.idDestinatario = idDestinatario;
    }

    public Mensaje() {
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(int tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public int getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(int idRemitente) {
        this.idRemitente = idRemitente;
    }

    public int getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(int idDestinatario) {
        this.idDestinatario = idDestinatario;
    }
    
    
}
