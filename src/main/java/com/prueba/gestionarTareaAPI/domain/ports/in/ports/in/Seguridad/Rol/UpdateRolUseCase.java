package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Rol;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;

import java.util.Optional;

public interface UpdateRolUseCase {
    Optional<Rol> updateRol(Long id, Roles updatedRol);
}
