package com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Seguridad;

import com.prueba.gestionarTareaAPI.domain.model.Seguridad.Rol;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;

import java.util.List;
import java.util.Optional;

public interface RolesRepositoryPort {
    Roles save(Roles rol);

    Rol save(Rol rol);
    Optional<Rol> findById(Long id);

    Optional<Rol> update(Roles rol);

    List<Rol> findAll();

    Optional<Rol> update(Rol roles);

    boolean deleteById(Long id);
}
