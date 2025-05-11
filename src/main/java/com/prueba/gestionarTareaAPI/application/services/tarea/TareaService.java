package com.prueba.gestionarTareaAPI.application.services.tarea;


import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;

import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea.CreateTareaUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea.DeleteTareaUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea.RetrieveTareaUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.tarea.UpdateTareaUseCase;


import java.util.List;
import java.util.Optional;

public class TareaService implements CreateTareaUseCase , RetrieveTareaUseCase, UpdateTareaUseCase, DeleteTareaUseCase {

    private final CreateTareaUseCase createTareaUseCase;
    private final RetrieveTareaUseCase retrieveTareaesUseCase;
    private final UpdateTareaUseCase updateTareaesUseCase;
    private final DeleteTareaUseCase deleteTareaesUseCase;

    public TareaService(CreateTareaUseCase createTareaUseCase, RetrieveTareaUseCase retrieveTareaesUseCase,
                        UpdateTareaUseCase updateTareaesUseCase, DeleteTareaUseCase deleteTareaesUseCase
                        ) {
        this.createTareaUseCase = createTareaUseCase;
        this.retrieveTareaesUseCase = retrieveTareaesUseCase;
        this.updateTareaesUseCase = updateTareaesUseCase;
        this.deleteTareaesUseCase = deleteTareaesUseCase;
    }



    @Override
    public Tarea createTarea(Tarea task) {
        return createTareaUseCase.createTarea(task);
    }

    @Override
    public boolean deleteTarea(Long id) {
        return deleteTareaesUseCase.deleteTarea(id);
    }

    @Override
    public Optional<Tarea> getTareaById(Long id) {
        return retrieveTareaesUseCase.getTareaById(id);
    }

    @Override
    public List<Tarea> getAllTareas() {
        return retrieveTareaesUseCase.getAllTareas();
    }

    @Override
    public Optional<Tarea> updateTarea(Long id, Tarea updatedUsuario) {
        return updateTareaesUseCase.updateTarea(id,updatedUsuario);
    }
}

