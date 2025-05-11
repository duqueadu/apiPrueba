package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.Rol;


import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol.DeleteRolUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort;

public class DeleteRolUseCaseImpl implements DeleteRolUseCase {

    private final com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort RolesRepositoryPort;

    public DeleteRolUseCaseImpl(RolesRepositoryPort RolesRepositoryPort) {
        this.RolesRepositoryPort = RolesRepositoryPort;
    }

    @Override
    public boolean deleteRol(Long id) {
        return RolesRepositoryPort.deleteById(id);
    }
}
