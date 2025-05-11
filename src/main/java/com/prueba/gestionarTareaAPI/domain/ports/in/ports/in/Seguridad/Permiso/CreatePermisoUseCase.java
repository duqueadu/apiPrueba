package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Permiso;


import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Permisos;


public interface CreatePermisoUseCase {
    Permisos createPermiso(Permisos permiso);
}