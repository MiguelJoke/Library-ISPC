
package com.ispc.library.controller;

import com.ispc.library.model.User;
import com.ispc.library.service.IUserService;
import dto.LoguinDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@CrossOrigin
@RestController
public class UserController {
   
    @Autowired
    private IUserService userService;
    
    
    @PostMapping("/nuevoUsuario")
    public void guardarUsuario(@RequestBody User usuario){
        userService.registrarUsuario(usuario);
    }
    
    @PostMapping("/loguin")
    public boolean loguinUsuario( @RequestParam String username,
                                  @RequestParam String password){
        
        LoguinDto datosUsu = new LoguinDto();
        datosUsu.setUsername(username);
        datosUsu.setPassword(password);
        System.out.println("usuario " + username);
        System.out.println("clave " + password);
        //falta validar que llegue un string de usuario y de clave
        System.out.println("llega aca");
        boolean retorno = userService.logginUsuario(datosUsu);
        System.out.println("retorno " + retorno);
        return retorno;
    }
    
    /*
    prueba para ver si funcionaba la busqueda de todos los usuarios
    @GetMapping("/listaUsuarios")
    public List<User> buscarUsuarios(){
        return repoUser.buscarUsuarios();
    }
    */
}
