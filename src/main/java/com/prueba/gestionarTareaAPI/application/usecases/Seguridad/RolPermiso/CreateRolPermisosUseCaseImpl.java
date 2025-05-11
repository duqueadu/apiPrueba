package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.RolPermiso;


import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.RolPermiso.CreateRolPermisoUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolPermisoRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.RolPermisos;

public class CreateRolPermisosUseCaseImpl implements CreateRolPermisoUseCase {

    private final RolPermisoRepositoryPort rolPermisosRepositoryPort;

    public CreateRolPermisosUseCaseImpl(RolPermisoRepositoryPort rolPermisosRepositoryPort) {
        this.rolPermisosRepositoryPort = rolPermisosRepositoryPort;
    }

    @Override
    public RolPermisos createRolPermiso(RolPermisos RolPermisos) {
        return rolPermisosRepositoryPort.save(RolPermisos);
    }
}