package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.Permiso;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Permiso;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Permiso.UpdatePermisoUseCase;

import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.PermisosRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Permisos;

import java.util.Optional;

public class UpdatePermisoUseCaseImpl implements UpdatePermisoUseCase {

    private final PermisosRepositoryPort PermisoRepositoryPort;

    public UpdatePermisoUseCaseImpl(PermisosRepositoryPort PermisoRepositoryPort) {
        this.PermisoRepositoryPort = PermisoRepositoryPort;
    }

    @Override
    public Optional<Permiso> updatePermiso(Long id, Permisos updatePermiso) {
        return PermisoRepositoryPort.update(updatePermiso);
    }
}
