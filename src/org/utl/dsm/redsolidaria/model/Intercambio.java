/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author arlet
 */
public class Intercambio {
    private int idIntercambio;
    private LocalDate dia;
    private LocalTime hora;
    private int estatus; 
    private int usuarioSolicitante;
    private int usuarioOferente;

    public Intercambio(int idIntercambio, LocalDate dia, LocalTime hora, int estatus, int usuarioSolicitante, int usuarioOferente) {
        this.idIntercambio = idIntercambio;
        this.dia = dia;
        this.hora = hora;
        this.estatus = estatus;
        this.usuarioSolicitante = usuarioSolicitante;
        this.usuarioOferente = usuarioOferente;
    }

    public Intercambio() {
    }

    public int getIdIntercambio() {
        return idIntercambio;
    }

    public void setIdIntercambio(int idIntercambio) {
        this.idIntercambio = idIntercambio;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public int getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(int usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public int getUsuarioOferente() {
        return usuarioOferente;
    }

    public void setUsuarioOferente(int usuarioOferente) {
        this.usuarioOferente = usuarioOferente;
    }
    
    
}
