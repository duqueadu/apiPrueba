package com.prueba.gestionarTareaAPI.infrastructure.entities.tarea;


import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import com.prueba.gestionarTareaAPI.domain.model.Usuario.Usuario;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Usuario.Usuarios;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tareas")
public class Tareas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre_tarea", nullable = false)
    private String nombreTarea;

    @Column(name = "estado", nullable = false)
    private int estado;

    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "usuario", nullable = false)
    private int usuario;

    public Tareas() {}

    public Tareas(int id, String nombreTarea, int estado, Date fechaCreacion, int usuario) {
        this.id = id;
        this.nombreTarea = nombreTarea;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.usuario = usuario;
    }
    public static Tareas fromDomainModel(Tarea tarea) {
        return new Tareas((int) tarea.getId(), tarea.getNombreTarea(), tarea.getEstado(), tarea.getFechaCreacion(), tarea.getUsuario() );
    }

    public Tarea toDomainModel() {
        return new Tarea(id, nombreTarea, estado, fechaCreacion,usuario);
    }


    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombreTarea() { return nombreTarea; }
    public void setNombreTarea(String nombreTarea) { this.nombreTarea = nombreTarea; }

    public int getEstado() { return estado; }
    public void setEstado(int estado) { this.estado = estado; }

    public Date getFechaCreacion() { return fechaCreacion; }
    public void setFechaCreacion(Date fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public int getUsuario() { return usuario; }
    public void setUsuario(int usuario) { this.usuario = usuario; }
}
