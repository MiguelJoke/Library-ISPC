
package com.ispc.library.service;

import com.ispc.library.model.User;
import com.ispc.library.repository.IUserRepository;
import dto.LoguinDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Caro
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepo;
      
    @Override
    public void registrarUsuario(User usuario) {
        try{
        userRepo.guardarUsuario(usuario);
        }catch (Exception e){
            System.out.println("No se guardo el usuario, devolver mensaje de error");
        }
    }

    
    @Override
    public boolean logginUsuario(LoguinDto datosUsuario) {
        //trae la lista de usuario de la base de datos y busca si coinciden con los de la bbdd
        List<User> listaUsuarios = userRepo.buscarUsuarios();
        boolean logueo = false;
        for( User usuario : listaUsuarios){
            if (usuario.getUsername().equals(datosUsuario.getUsername()) && usuario.getPassword().equals(datosUsuario.getPassword())){
                logueo = true;
            }
        }
        //devuelve true si usuario y clave estan ok, false si el usuario o clave estan mal o no existen en la bbdd
        return logueo;
    }

   
}
