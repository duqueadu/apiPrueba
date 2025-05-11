package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea;

import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;

import java.util.List;
import java.util.Optional;

public interface RetrieveTareaUseCase {
    Optional<Tarea> getTareaById(Long id);
    List<Tarea> getAllTareas();
}
