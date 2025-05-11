package com.prueba.gestionarTareaAPI.application.usecases.tarea;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Rol;
import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol.RetrieveRolUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea.RetrieveTareaUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad.RolesRepositoryPort;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.tarea.TareaRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTareaUseCaseImpl implements RetrieveTareaUseCase {

    private final TareaRepositoryPort RepositoryPort;

    public RetrieveTareaUseCaseImpl(TareaRepositoryPort RepositoryPort) {
        this.RepositoryPort = RepositoryPort;
    }


    @Override
    public Optional<Tarea> getTareaById(Long id) {
        return RepositoryPort.findById(id);
    }

    @Override
    public List<Tarea> getAllTareas() {
        return RepositoryPort.findAll();
    }
}
