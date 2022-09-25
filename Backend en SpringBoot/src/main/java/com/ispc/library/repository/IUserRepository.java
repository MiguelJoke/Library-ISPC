

package com.ispc.library.repository;

import com.ispc.library.model.User;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface IUserRepository {
    public void guardarUsuario(User usuario); 
    public List<User> buscarUsuarios();
    public User buscarUnUsuario(String nombreUsuario);
}
