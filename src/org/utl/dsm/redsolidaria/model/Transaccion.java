package org.utl.dsm.redsolidaria.model;

import java.time.LocalDate;

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
    private String tituloServicio;
    private int estatus;
    private float horasRecibidas; // Agregado
    private float horasOfrecidas; // Agregado
    private int intercambiosCompletados; // Agregado

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, Intercambio intercambio, Usuario oferente, Usuario solicitante, float horasIntercambiadas,
            LocalDate fecha, String detalles, boolean verificadoOferente, boolean verificadoSolicitante) {
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

    // Getters y setters existentes
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

    public String getTituloServicio() {
        return tituloServicio;
    }

    public void setTituloServicio(String tituloServicio) {
        this.tituloServicio = tituloServicio;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    // Nuevos getters y setters
    public float getHorasRecibidas() {
        return horasRecibidas;
    }

    public void setHorasRecibidas(float horasRecibidas) {
        this.horasRecibidas = horasRecibidas;
    }

    public float getHorasOfrecidas() {
        return horasOfrecidas;
    }

    public void setHorasOfrecidas(float horasOfrecidas) {
        this.horasOfrecidas = horasOfrecidas;
    }

    public int getIntercambiosCompletados() {
        return intercambiosCompletados;
    }

    public void setIntercambiosCompletados(int intercambiosCompletados) {
        this.intercambiosCompletados = intercambiosCompletados;
    }
}
