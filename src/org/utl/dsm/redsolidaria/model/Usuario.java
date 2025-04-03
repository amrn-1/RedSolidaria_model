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
    private String contrasenia;
    private Ciudad ciudad;
    private String foto;
    private String descripcion;
    private int configuracionPrivacidad;
    private float reputacion;
    private float saldoHoras;
    private int estadoVerificacion;
    private int estatus;
    private boolean preferenciasEmail;
    private String lastToken;
    private String dateLastToken;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellidos, String correo, String contrasenia, Ciudad ciudad, String foto, String descripcion, int configuracionPrivacidad, float reputacion, float saldoHoras, int estadoVerificacion, int estatus, boolean preferenciasEmail, String lastToken, String dateLastToken) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.ciudad = ciudad;
        this.foto = foto;
        this.descripcion = descripcion;
        this.configuracionPrivacidad = configuracionPrivacidad;
        this.reputacion = reputacion;
        this.saldoHoras = saldoHoras;
        this.estadoVerificacion = estadoVerificacion;
        this.estatus = estatus;
        this.preferenciasEmail = preferenciasEmail;
        this.lastToken = lastToken;
        this.dateLastToken = dateLastToken;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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

    public int getConfiguracionPrivacidad() {
        return configuracionPrivacidad;
    }

    public void setConfiguracionPrivacidad(int configuracionPrivacidad) {
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

    public String getLastToken() {
        return lastToken;
    }

    public void setLastToken(String lastToken) {
        this.lastToken = lastToken;
    }

    public String getDateLastToken() {
        return dateLastToken;
    }

    public void setDateLastToken(String dateLastToken) {
        this.dateLastToken = dateLastToken;
    }



}
