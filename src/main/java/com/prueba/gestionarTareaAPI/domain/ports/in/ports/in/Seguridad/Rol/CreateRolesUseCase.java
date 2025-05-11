package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol;


import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;

public interface CreateRolesUseCase {
    Roles createRol(Roles rol);
}