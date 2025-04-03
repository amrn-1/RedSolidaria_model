package org.utl.dsm.redsolidaria.model;

public class Servicio {
    private int idServicio;
    private String titulo;
    private String descripcion;
    private int modalidad; // 1-Presencial, 2-Virtual, 3-Mixto
    private int estatus; // 0-Inactivo, 1-Activo, 2-Eliminado
    private int idUsuario; // Agregar idUsuario directamente

    public Servicio() {
    }

    // Constructor
    public Servicio(int idServicio, String titulo, String descripcion, int modalidad, int estatus, int idUsuario) {
        this.idServicio = idServicio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.modalidad = modalidad;
        this.estatus = estatus;
        this.idUsuario = idUsuario; // Inicializar idUsuario
    }

    // Getters y Setters
    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getModalidad() {
        return modalidad;
    }

    public void setModalidad(int modalidad) {
        this.modalidad = modalidad;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public int getIdUsuario() { // Agregar getter para idUsuario
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) { // Agregar setter para idUsuario
        this.idUsuario = idUsuario;
    }
}