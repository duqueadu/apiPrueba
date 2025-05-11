package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Rol;

import java.util.List;
import java.util.Optional;

public interface RetrieveRolUseCase {
    Optional<Rol> getRolById(Long id);
    List<Rol> getAllRol();
}
