package com.lemon.listperson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    @Id
    @Column
    private Long Cuit;

    private Long Cuit_rep;

    private String Domicilio;

    private String Telefono;

    private String Actividad;

    private String Caracter;

    private String Condicion;

    public Long getCuit() {
        return Cuit;
    }

    public void setCuit(Long cuit) {
        Cuit = cuit;
    }

    public Long getCuit_rep() {
        return Cuit_rep;
    }

    public void setCuit_rep(Long cuit_rep) {
        Cuit_rep = cuit_rep;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String actividad) {
        Actividad = actividad;
    }

    public String getCaracter() {
        return Caracter;
    }

    public void setCaracter(String caracter) {
        Caracter = caracter;
    }

    public String getCondicion() {
        return Condicion;
    }

    public void setCondicion(String condicion) {
        Condicion = condicion;
    }
}
