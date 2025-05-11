package com.prueba.gestionarTareaAPI.infrastructure.repositories.tarea;

import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.tarea.TareaRepositoryPort;
import com.prueba.gestionarTareaAPI.infrastructure.entities.tarea.Tareas;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaTareasRepositoryAdapter implements TareaRepositoryPort {

    private final JpaTareaRepository tareaRepository;

    public JpaTareasRepositoryAdapter(JpaTareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;

    }


    @Override
    public Tarea save(Tarea Tarea) {

        Tareas taskEntity = Tareas.fromDomainModel(Tarea);
        Tareas savedTaskEntity = tareaRepository.save(taskEntity);
        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Tarea> findById(Long id) {
        return tareaRepository.findById(id).map(Tareas::toDomainModel);
    }

    @Override
    public List<Tarea> findAll() {
        return tareaRepository.findAll().stream()
                .map(Tareas::toDomainModel)
                .collect(Collectors.toList());
    }



    @Override
    public Optional<Tarea> update(Tarea tarea) {
        if (tareaRepository.existsById(tarea.getId())) {
            Tareas taskEntity = Tareas.fromDomainModel(tarea);
            Tareas updatedTaskEntity = tareaRepository.save(taskEntity);
            return Optional.of(updatedTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (tareaRepository.existsById(id)) {
            tareaRepository.deleteById(id);
            return true;
        }
        return false;
    }









}
