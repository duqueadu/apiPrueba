package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Usuario;

import com.prueba.gestionarTareaAPI.domain.model.Usuario.Usuario;

import java.util.List;
import java.util.Optional;

public interface RetrieveUsuarioUseCase {
    Optional<Usuario> getUsuarioById(Long id);
    List<Usuario> getAllUsuarios();
}
