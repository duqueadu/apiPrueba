package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.Permiso;


import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Permiso.CreatePermisoUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.PermisosRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Permisos;

public class CreatePermisosUseCaseImpl implements CreatePermisoUseCase {

    private final com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.PermisosRepositoryPort PermisosRepositoryPort;

    public CreatePermisosUseCaseImpl(PermisosRepositoryPort PermisosRepositoryPort) {
        this.PermisosRepositoryPort = PermisosRepositoryPort;
    }

    @Override
    public Permisos createPermiso(Permisos rol) {
        return PermisosRepositoryPort.save(rol);
    }
}