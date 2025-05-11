package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Permiso;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Permiso;
import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Rol;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Permisos;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;

import java.util.Optional;

public interface UpdatePermisoUseCase {
    Optional<Permiso> updatePermiso(Long id, Permisos updatedPermiso);
}
