
package com.ispc.library.controller;

import com.ispc.library.service.ILendingService;
import dto.LendingDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class LendingController {
    
    @Autowired
    private ILendingService lendingService;
    
    
    @PostMapping("/buscarReservas")
    public List<LendingDto> buscarReservasxUsuario(@RequestBody String nombreUsuario){
        return lendingService.buscarReservasxUsuario(nombreUsuario);
    }
    
    
    @PostMapping("/nuevaReserva")
    public void crearNuevaReserva (@RequestBody String nombreUsuario,
                                   @RequestBody LendingDto nuevaReserva){
        lendingService.registrarReserva(nombreUsuario, nuevaReserva) ;
    }
}
