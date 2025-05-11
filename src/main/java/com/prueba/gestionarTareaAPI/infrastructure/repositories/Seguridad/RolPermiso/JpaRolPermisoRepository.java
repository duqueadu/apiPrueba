package com.prueba.gestionarTareaAPI.infrastructure.repositories.Seguridad.RolPermiso;

import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.RolPermisos;
import com.prueba.gestionarTareaAPI.infrastructure.entities.Seguridad.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRolPermisoRepository extends JpaRepository<RolPermisos, Long> {
    // Puedes agregar consultas personalizadas si lo necesitas
}
