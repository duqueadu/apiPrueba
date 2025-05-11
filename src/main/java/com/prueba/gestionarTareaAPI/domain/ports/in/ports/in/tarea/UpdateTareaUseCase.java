package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea;

import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import com.prueba.gestionarTareaAPI.domain.model.Usuario.Usuario;

import java.util.Optional;

public interface UpdateTareaUseCase {
    Optional<Tarea> updateTarea(Long id, Tarea updatedUsuario);
}
