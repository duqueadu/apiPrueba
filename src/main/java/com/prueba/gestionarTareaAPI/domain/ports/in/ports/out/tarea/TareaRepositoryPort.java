package com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.tarea;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.RolPermiso;
import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.RolPermisos;
import com.prueba.gestionarTareaAPI.infrastructure.entities.tarea.Tareas;

import java.util.List;
import java.util.Optional;

public interface TareaRepositoryPort {
    Tarea save(Tarea tarea);

    Optional<Tarea> findById(Long id);

    List<Tarea> findAll();

    Optional<Tarea> update(Tarea tarea);

    boolean deleteById(Long id);
}
