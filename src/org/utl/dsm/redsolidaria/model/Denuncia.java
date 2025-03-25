/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

/**
 *
 * @author arlet
 */
public class Denuncia {
    private int idDenuncia;
    private String motivo;
    private String descripcion;
    private Usuario denunciante;
    private Usuario reportado;
    private Servicio servicio;
    private int estatus;

    public Denuncia(int idDenuncia, String motivo, String descripcion, Usuario denunciante, Usuario reportado, Servicio servicio, int estatus) {
        this.idDenuncia = idDenuncia;
        this.motivo = motivo;
        this.descripcion = descripcion;
        this.denunciante = denunciante;
        this.reportado = reportado;
        this.servicio = servicio;
        this.estatus = estatus;
    }

    public Denuncia() {
    }

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Usuario denunciante) {
        this.denunciante = denunciante;
    }

    public Usuario getReportado() {
        return reportado;
    }

    public void setReportado(Usuario reportado) {
        this.reportado = reportado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }
    
    
}
