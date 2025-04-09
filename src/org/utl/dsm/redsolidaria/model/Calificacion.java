package org.utl.dsm.redsolidaria.model;

import java.time.LocalDate;

public class Calificacion {
    private int idCalificacion;
    private int idTransaccion;
    private int idUsuarioCalificador;
    private int idUsuarioCalificado;
    private int calificacion;
    private String comentario;
    private LocalDate fecha;
    private String nombreCalificador; // Campo adicional para mostrar el nombre del calificador
    
    // Constructor vacío
    public Calificacion() {
    }
    
    // Constructor completo
    public Calificacion(int idCalificacion, int idTransaccion, int idUsuarioCalificador, 
                       int idUsuarioCalificado, int calificacion, String comentario, 
                       LocalDate fecha) {
        this.idCalificacion = idCalificacion;
        this.idTransaccion = idTransaccion;
        this.idUsuarioCalificador = idUsuarioCalificador;
        this.idUsuarioCalificado = idUsuarioCalificado;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecha = fecha;
    }
    
    // Getters y Setters
    public int getIdCalificacion() {
        return idCalificacion;
    }
    
    public void setIdCalificacion(int idCalificacion) {
        this.idCalificacion = idCalificacion;
    }
    
    public int getIdTransaccion() {
        return idTransaccion;
    }
    
    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }
    
    public int getIdUsuarioCalificador() {
        return idUsuarioCalificador;
    }
    
    public void setIdUsuarioCalificador(int idUsuarioCalificador) {
        this.idUsuarioCalificador = idUsuarioCalificador;
    }
    
    public int getIdUsuarioCalificado() {
        return idUsuarioCalificado;
    }
    
    public void setIdUsuarioCalificado(int idUsuarioCalificado) {
        this.idUsuarioCalificado = idUsuarioCalificado;
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
    
    public String getNombreCalificador() {
        return nombreCalificador;
    }
    
    public void setNombreCalificador(String nombreCalificador) {
        this.nombreCalificador = nombreCalificador;
    }
    
    @Override
    public String toString() {
        return "Calificacion{" +
                "idCalificacion=" + idCalificacion +
                ", idTransaccion=" + idTransaccion +
                ", idUsuarioCalificador=" + idUsuarioCalificador +
                ", idUsuarioCalificado=" + idUsuarioCalificado +
                ", calificacion=" + calificacion +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}