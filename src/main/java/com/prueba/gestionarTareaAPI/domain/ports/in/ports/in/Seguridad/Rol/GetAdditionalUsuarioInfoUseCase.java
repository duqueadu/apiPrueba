package com.prueba.gestionarTareaAPI.domain.ports.in.ports.in.Seguridad.Rol;

import com.prueba.gestionarTareaAPI.domain.model.Usuario.AdditionalUsuarioInfo;

public interface GetAdditionalUsuarioInfoUseCase {
    AdditionalUsuarioInfo getAdditionalUsuarioInfo(Long id);

}
