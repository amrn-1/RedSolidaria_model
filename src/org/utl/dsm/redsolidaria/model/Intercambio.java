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
public class Intercambio {
    private int idIntercambio;
    private LocalDate dia;
    private String hora; // Cambiado de LocalTime a String
    private int estatus;
    private int idUsuarioSolicitante;
    private int idUsuarioOferente;

    public Intercambio(int idIntercambio, LocalDate dia, String hora, int estatus, int idUsuarioSolicitante, int idUsuarioOferente) {
        this.idIntercambio = idIntercambio;
        this.dia = dia;
        this.hora = hora;
        this.estatus = estatus;
        this.idUsuarioSolicitante = idUsuarioSolicitante;
        this.idUsuarioOferente = idUsuarioOferente;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public int getIdUsuarioSolicitante() {
        return idUsuarioSolicitante;
    }

    public void setIdUsuarioSolicitante(int idUsuarioSolicitante) {
        this.idUsuarioSolicitante = idUsuarioSolicitante;
    }

    public int getIdUsuarioOferente() {
        return idUsuarioOferente;
    }

    public void setIdUsuarioOferente(int idUsuarioOferente) {
        this.idUsuarioOferente = idUsuarioOferente;
    }

    @Override
    public String toString() {
        return "Intercambio{" +
                "idIntercambio=" + idIntercambio +
                ", dia=" + dia +
                ", hora=" + hora +
                ", estatus=" + estatus +
                ", idUsuarioSolicitante=" + idUsuarioSolicitante +
                ", idUsuarioOferente=" + idUsuarioOferente +
                '}';
    }
}