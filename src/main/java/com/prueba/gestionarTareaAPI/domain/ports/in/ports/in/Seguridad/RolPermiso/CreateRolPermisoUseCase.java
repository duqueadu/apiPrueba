package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.RolPermiso;


import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Permisos;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.RolPermisos;


public interface CreateRolPermisoUseCase {
        RolPermisos  createRolPermiso(RolPermisos rolPermisos);
}