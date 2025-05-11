package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.Rol;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Rol;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol.RetrieveRolUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveRolUseCaseImpl implements RetrieveRolUseCase {

    private final RolesRepositoryPort rolRepositoryPort;

    public RetrieveRolUseCaseImpl(RolesRepositoryPort rolRepositoryPort) {
        this.rolRepositoryPort = rolRepositoryPort;
    }



    @Override
    public Optional<Rol> getRolById(Long id) {
        return rolRepositoryPort.findById(id);
    }

    @Override
    public List<Rol> getAllRol() {
        return rolRepositoryPort.findAll();
    }
}
