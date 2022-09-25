
package com.ispc.library.service;

import com.ispc.library.model.User;
import dto.LoguinDto;

/**
 *
 * @author Caro
 */
public interface IUserService {
    public void registrarUsuario(User usuario);
    public boolean logginUsuario(LoguinDto datosUsuario);
    //public boolean borrarUsuario(User usuario); no va a poder borrar su usuario, tiene que hacerlo el bibliotecario
}
