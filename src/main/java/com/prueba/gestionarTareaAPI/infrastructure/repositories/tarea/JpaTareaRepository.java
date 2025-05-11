package com.prueba.gestionarTareaAPI.infrastructure.repositories.tarea;

import com.prueba.gestionarTareaAPI.domain.model.Tarea.Tarea;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Usuario.Usuarios;
import com.prueba.gestionarTareaAPI.infrastructure.entities.tarea.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTareaRepository extends JpaRepository<Tareas, Long> {

}
