/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

/**
 *
 * @author arlet
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasena;
    private Ciudad ciudad;
    private String foto;
    private String descripcion;
    private String configuracionPrivacidad;
    private float reputacion;
    private float saldoHoras;
    private int estadoVerificacion; 
    private int estatus; 
    private boolean preferenciasEmail;

    public Usuario(int idUsuario, String nombre, String apellidos, String correo, String contrasena, Ciudad ciudad, String foto, String descripcion, String configuracionPrivacidad, float reputacion, float saldoHoras, int estadoVerificacion, int estatus, boolean preferenciasEmail) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasena = contrasena;
        this.ciudad = ciudad;
        this.foto = foto;
        this.descripcion = descripcion;
        this.configuracionPrivacidad = configuracionPrivacidad;
        this.reputacion = reputacion;
        this.saldoHoras = saldoHoras;
        this.estadoVerificacion = estadoVerificacion;
        this.estatus = estatus;
        this.preferenciasEmail = preferenciasEmail;
    }

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getConfiguracionPrivacidad() {
        return configuracionPrivacidad;
    }

    public void setConfiguracionPrivacidad(String configuracionPrivacidad) {
        this.configuracionPrivacidad = configuracionPrivacidad;
    }

    public float getReputacion() {
        return reputacion;
    }

    public void setReputacion(float reputacion) {
        this.reputacion = reputacion;
    }

    public float getSaldoHoras() {
        return saldoHoras;
    }

    public void setSaldoHoras(float saldoHoras) {
        this.saldoHoras = saldoHoras;
    }

    public int getEstadoVerificacion() {
        return estadoVerificacion;
    }

    public void setEstadoVerificacion(int estadoVerificacion) {
        this.estadoVerificacion = estadoVerificacion;
    }

    public int getEstatus() {
        return estatus;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public boolean isPreferenciasEmail() {
        return preferenciasEmail;
    }

    public void setPreferenciasEmail(boolean preferenciasEmail) {
        this.preferenciasEmail = preferenciasEmail;
    }
    
    
}
