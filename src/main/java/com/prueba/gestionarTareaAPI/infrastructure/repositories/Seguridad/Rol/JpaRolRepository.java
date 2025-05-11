package com.prueba.gestionarTareaAPI.infrastructure.repositories.Seguridad.Rol;

import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRolRepository extends JpaRepository<Roles, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
