package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.RolPermiso;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.RolPermiso;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.RolPermiso.UpdateRolPermisoUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolPermisoRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.RolPermisos;

import java.util.Optional;

public class UpdateRolPermisoUseCaseImpl implements UpdateRolPermisoUseCase {

    private final RolPermisoRepositoryPort rolPermisoRepositoryPort;

    public UpdateRolPermisoUseCaseImpl(RolPermisoRepositoryPort rolPermisoRepositoryPort) {
        this.rolPermisoRepositoryPort = rolPermisoRepositoryPort;
    }

    @Override
    public Optional<RolPermiso> updateRolPermiso(Long id, RolPermisos updateRolPermiso) {
        return rolPermisoRepositoryPort.update(updateRolPermiso);
    }
}
