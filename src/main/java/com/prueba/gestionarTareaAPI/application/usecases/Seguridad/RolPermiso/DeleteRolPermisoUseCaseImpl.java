package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.RolPermiso;


import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.RolPermiso.DeleteRolPermisoUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolPermisoRepositoryPort;

public class DeleteRolPermisoUseCaseImpl implements DeleteRolPermisoUseCase  {

    private final RolPermisoRepositoryPort rolPermisosRepositoryPort;

    public DeleteRolPermisoUseCaseImpl( RolPermisoRepositoryPort rolPermisosRepositoryPort) {
        this.rolPermisosRepositoryPort = rolPermisosRepositoryPort;

    }


    @Override
    public boolean deleteRolPermiso(Long id) {
        return rolPermisosRepositoryPort.deleteById(id);
    }
}
