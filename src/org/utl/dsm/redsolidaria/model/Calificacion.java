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
public class Calificacion {
    private int idCalificacion;
    private Transaccion transaccion;
    private Usuario calificador;
    private Usuario calificado;
    private int calificacion; 
    private String comentario;
    private LocalDate fecha;

    public Calificacion(int idCalificacion, Transaccion transaccion, Usuario calificador, Usuario calificado, int calificacion, String comentario, LocalDate fecha) {
        this.idCalificacion = idCalificacion;
        this.transaccion = transaccion;
        this.calificador = calificador;
        this.calificado = calificado;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public Calificacion() {
    }

    public int getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    public Usuario getCalificador() {
        return calificador;
    }

    public void setCalificador(Usuario calificador) {
        this.calificador = calificador;
    }

    public Usuario getCalificado() {
        return calificado;
    }

    public void setCalificado(Usuario calificado) {
        this.calificado = calificado;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
