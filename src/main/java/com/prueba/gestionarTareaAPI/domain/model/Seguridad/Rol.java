package com.prueba.gestionarTareaAPI.domain.model.Seguridad;


public class Rol {

    private Long id;
    private String nombre;
    private String descripcion;

    public Rol(Long id, String nombre, String descripcion) {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
