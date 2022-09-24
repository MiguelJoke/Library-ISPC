

package com.ispc.library.controller;

import com.ispc.library.model.User;
import com.ispc.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class UserController {
   
    @Autowired
    private UserRepository repoUser;
    
    
    @PostMapping("/nuevoUsuario")
    public void guardarUsuario(@RequestBody User usuario){
        repoUser.guardarUsuario(usuario);
        
    }
}
