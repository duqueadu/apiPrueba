package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Permiso;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Permiso;

import java.util.List;
import java.util.Optional;

public interface RetrievePermisoUseCase {
    Optional<Permiso> getPermisoById(Long id);
    List<Permiso> getAllPermiso();
}
