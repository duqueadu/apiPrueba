package com.prueba.gestionarTareaAPI.domain.model.Tarea;

// domain/model/Tarea.java

import java.util.Date;

public class Tarea {

    private int id;
    private String nombreTarea;
    private int estado;
    private Date fechaCreacion;
    private int usuario;

    public Tarea(int id, String nombreTarea, int estado, Date fechaCreacion, int usuario) {
        this.id = id;
        this.nombreTarea = nombreTarea;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
    }

    // Getters y setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
}
