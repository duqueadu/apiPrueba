package com.prueba.gestionarTareaAPI.application.usecases.tarea;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Rol;
import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol.UpdateRolUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea.UpdateTareaUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.tarea.TareaRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;

import java.util.Optional;

public class UpdateTareaUseCaseImpl implements UpdateTareaUseCase  {

    private final TareaRepositoryPort RepositoryPort;

    public UpdateTareaUseCaseImpl(TareaRepositoryPort RepositoryPort) {
        this.RepositoryPort = RepositoryPort;
    }


    @Override
    public Optional<Tarea> updateTarea(Long id, Tarea updatedUsuario) {
        return RepositoryPort.update(updatedUsuario);
    }
}
