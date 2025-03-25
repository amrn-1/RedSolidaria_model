/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.utl.dsm.redsolidaria.model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author arlet
 */
public class Disponibilidad {
    private int idDisponibilidad;
    private LocalDate dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Servicio servicio;

    public Disponibilidad(int idDisponibilidad, LocalDate dia, LocalTime horaInicio, LocalTime horaFin, Servicio servicio) {
        this.idDisponibilidad = idDisponibilidad;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.servicio = servicio;
    }

    public Disponibilidad() {
    }

    public int getIdDisponibilidad() {
        return idDisponibilidad;
    }

    public void setIdDisponibilidad(int idDisponibilidad) {
        this.idDisponibilidad = idDisponibilidad;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    
}
