package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea;


import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;

public interface CreateTareaUseCase {
    Tarea createTarea(Tarea task);

}