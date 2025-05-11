package com.prueba.gestionarTareaAPI.application.usecases.tarea;


import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea.DeleteTareaUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.tarea.TareaRepositoryPort;

public class DeleteTareaUseCaseImpl implements DeleteTareaUseCase {

    private final com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.tarea.TareaRepositoryPort tareaRepositoryPort;

    public DeleteTareaUseCaseImpl(TareaRepositoryPort RepositoryPort) {
        this.tareaRepositoryPort = RepositoryPort;
    }
    
    @Override
    public boolean deleteTarea(Long id) {
        return tareaRepositoryPort.deleteById(id);
    }
}
