package com.prueba.gestionarTareaAPI.application.usecases.Usuario;

import com.prueba.gestionarTareaAPI.domain.model.Usuario.Usuario;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Usuario.UpdateUsuarioUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Usuario.UsuarioRepositoryPort;

import java.util.Optional;

public class UpdateUsuarioUseCaseImpl implements UpdateUsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UpdateUsuarioUseCaseImpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Optional<Usuario> updateUsuario(Long id, Usuario updatedUsuario) {
        return usuarioRepositoryPort.update(updatedUsuario);
    }
}
