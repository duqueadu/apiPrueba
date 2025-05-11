package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.Rol;


import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol.CreateRolesUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;

public class CreateRolesUseCaseImpl implements CreateRolesUseCase {

    private final com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort RolesRepositoryPort;

    public CreateRolesUseCaseImpl(RolesRepositoryPort RolesRepositoryPort) {
        this.RolesRepositoryPort = RolesRepositoryPort;
    }

    @Override
    public Roles createRol(Roles rol) {
        return RolesRepositoryPort.save(rol);
    }
}