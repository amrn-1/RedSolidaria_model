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
public class Transaccion {
    private int idTransaccion;
    private Intercambio intercambio;
    private Usuario oferente;
    private Usuario solicitante;
    private float horasIntercambiadas;
    private LocalDate fecha;
    private String detalles;
    private boolean verificadoOferente;
    private boolean verificadoSolicitante;

    public Transaccion(int idTransaccion, Intercambio intercambio, Usuario oferente, Usuario solicitante, float horasIntercambiadas, LocalDate fecha, String detalles, boolean verificadoOferente, boolean verificadoSolicitante) {
        this.idTransaccion = idTransaccion;
        this.intercambio = intercambio;
        this.oferente = oferente;
        this.solicitante = solicitante;
        this.horasIntercambiadas = horasIntercambiadas;
        this.fecha = fecha;
        this.detalles = detalles;
        this.verificadoOferente = verificadoOferente;
        this.verificadoSolicitante = verificadoSolicitante;
    }

    public Transaccion() {
    }

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Intercambio getIntercambio() {
        return intercambio;
    }

    public void setIntercambio(Intercambio intercambio) {
        this.intercambio = intercambio;
    }

    public Usuario getOferente() {
        return oferente;
    }

    public void setOferente(Usuario oferente) {
        this.oferente = oferente;
    }

    public Usuario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Usuario solicitante) {
        this.solicitante = solicitante;
    }

    public float getHorasIntercambiadas() {
        return horasIntercambiadas;
    }

    public void setHorasIntercambiadas(float horasIntercambiadas) {
        this.horasIntercambiadas = horasIntercambiadas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public boolean isVerificadoOferente() {
        return verificadoOferente;
    }

    public void setVerificadoOferente(boolean verificadoOferente) {
        this.verificadoOferente = verificadoOferente;
    }

    public boolean isVerificadoSolicitante() {
        return verificadoSolicitante;
    }

    public void setVerificadoSolicitante(boolean verificadoSolicitante) {
        this.verificadoSolicitante = verificadoSolicitante;
    }
    
    
}
