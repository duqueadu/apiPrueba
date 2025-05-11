package com.prueba.gestionarTareaAPI.application.usecases.Seguridad.Permiso;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Permiso;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Permiso.RetrievePermisoUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.PermisosRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrievePermisoUseCaseImpl implements RetrievePermisoUseCase  {

    private final PermisosRepositoryPort PermisoRepositoryPort;

    public RetrievePermisoUseCaseImpl(PermisosRepositoryPort PermisoRepositoryPort) {
        this.PermisoRepositoryPort = PermisoRepositoryPort;
    }



    @Override
    public Optional<Permiso> getPermisoById(Long id) {
        return PermisoRepositoryPort.findById(id);
    }

    @Override
    public List<Permiso> getAllPermiso() {
        return PermisoRepositoryPort.findAll();
    }
}
