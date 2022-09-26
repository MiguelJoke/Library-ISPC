
package com.ispc.library.controller;

import com.ispc.library.model.User;
import com.ispc.library.service.IUserService;
import dto.LoguinDto;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IUserService userService;
    
    
    @PostMapping("/nuevoUsuario")
    public void guardarUsuario(@RequestBody User usuario){
        userService.registrarUsuario(usuario);
    }
    
    @PostMapping("/loguin")
    public boolean loguinUsuario( @RequestBody LoguinDto datosLoguin){
    
        //falta validar que llegue un string de usuario y de clave
        return userService.logginUsuario(datosLoguin);
    }
    
    /*
    prueba para ver si funcionaba la busqueda de todos los usuarios
    @GetMapping("/listaUsuarios")
    public List<User> buscarUsuarios(){
        return repoUser.buscarUsuarios();
    }
    */
}
