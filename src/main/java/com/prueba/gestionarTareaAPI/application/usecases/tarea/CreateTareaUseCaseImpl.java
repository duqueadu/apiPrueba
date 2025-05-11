package com.prueba.gestionarTareaAPI.application.usecases.tarea;


import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol.CreateRolesUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea.CreateTareaUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.tarea.TareaRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;
import com.prueba.gestionarTareaAPI.infrastructure.entities.tarea.Tareas;

public class CreateTareaUseCaseImpl implements CreateTareaUseCase {

    private final com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.tarea.TareaRepositoryPort RepositoryPort;

    public CreateTareaUseCaseImpl(TareaRepositoryPort RepositoryPort) {
        this.RepositoryPort = RepositoryPort;
    }

    @Override
    public Tarea createTarea(Tarea Tarea) {
        return RepositoryPort.save(Tarea);
    }
}