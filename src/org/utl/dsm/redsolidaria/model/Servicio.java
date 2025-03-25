/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

/**
 *
 * @author arlet
 */
public class Servicio {
    private int idServicio;
    private String titulo;
    private String descripcion;
    private int modalidad; // 1-Presencial, 2-Virtual, 3-Mixto
    private int estatus; // 0-Inactivo, 1-Activo, 2-Eliminado
    private Categoria categoria;
    private Usuario usuario;

    public Servicio(int idServicio, String titulo, String descripcion, int modalidad, int estatus, Categoria categoria, Usuario usuario) {
        this.idServicio = idServicio;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.modalidad = modalidad;
        this.estatus = estatus;
        this.categoria = categoria;
        this.usuario = usuario;
    }

    public Servicio() {
    }

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
