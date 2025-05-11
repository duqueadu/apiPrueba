package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.RolPermiso;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Permiso;
import com.prueba.gestionarTareaAPI.domain.model.Seguridad.RolPermiso;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Permisos;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.RolPermisos;

import java.util.Optional;

public interface UpdateRolPermisoUseCase {
    Optional<RolPermiso> updateRolPermiso(Long id, RolPermisos updatedRolPermiso);
}
