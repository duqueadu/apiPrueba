package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Usuario;


import com.prueba.gestionarTareaAPI.domain.model.Usuario.Usuario;

public interface CreateUsuarioUseCase {
    Usuario createUsuario(Usuario task);

}