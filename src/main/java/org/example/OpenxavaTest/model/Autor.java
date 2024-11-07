package org.example.OpenxavaTest.model;

import javax.persistence.Entity;


public class Autor {

    private String nombre;
    private String apellido;

    public String nombreCompleto() {
        return this.nombre +  this.apellido;
    }
}
