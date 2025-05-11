package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.RolPermiso;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Permiso;
import com.prueba.gestionarTareaAPI.domain.model.Seguridad.RolPermiso;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.RolPermisos;

import java.util.List;
import java.util.Optional;

public interface RetrieveRolPermisoUseCase {
    Optional<RolPermiso> getRolPermisoById(Long id);
    List<RolPermiso> getAllRolPermiso();
}
