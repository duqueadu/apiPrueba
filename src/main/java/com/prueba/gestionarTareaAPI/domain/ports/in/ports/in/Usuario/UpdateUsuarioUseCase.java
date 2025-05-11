package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Usuario;

import com.prueba.gestionarTareaAPI.domain.model.Usuario.Usuario;

import java.util.Optional;

public interface UpdateUsuarioUseCase {
    Optional<Usuario> updateUsuario(Long id, Usuario updatedUsuario);
}
