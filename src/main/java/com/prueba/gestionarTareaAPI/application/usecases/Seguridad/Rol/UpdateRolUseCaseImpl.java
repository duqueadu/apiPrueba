package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.Rol;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Rol;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol.UpdateRolUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;

import java.util.Optional;

public class UpdateRolUseCaseImpl implements UpdateRolUseCase {

    private final RolesRepositoryPort rolRepositoryPort;

    public UpdateRolUseCaseImpl(RolesRepositoryPort rolRepositoryPort) {
        this.rolRepositoryPort = rolRepositoryPort;
    }

    @Override
    public Optional<Rol> updateRol(Long id, Roles updateRol) {
        return rolRepositoryPort.update(updateRol);
    }
}
