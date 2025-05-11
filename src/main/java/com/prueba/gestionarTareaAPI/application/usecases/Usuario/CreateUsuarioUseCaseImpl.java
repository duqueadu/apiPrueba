package com.prueba.gestionarTareaAPI.application.usecases.Usuario;


import com.prueba.gestionarTareaAPI.domain.model.Usuario.Usuario;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Usuario.CreateUsuarioUseCase;
import com.prueba.gestionarTareaAPI.domain.ports.in.ports.out.Usuario.UsuarioRepositoryPort;

public class CreateUsuarioUseCaseImpl implements CreateUsuarioUseCase  {

    private final UsuarioRepositoryPort  UsuarioRepositoryPort;

    public CreateUsuarioUseCaseImpl(UsuarioRepositoryPort UsuarioRepositoryPort) {
        this.UsuarioRepositoryPort = UsuarioRepositoryPort;
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return UsuarioRepositoryPort.save(usuario);
    }


}