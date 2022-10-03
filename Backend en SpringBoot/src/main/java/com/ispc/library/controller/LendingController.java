
package com.ispc.library.controller;

import com.ispc.library.service.ILendingService;
import dto.LendingDto;
import dto.LoguinDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */

@CrossOrigin( origins = "http://localhost:4200/")
@RestController
public class LendingController {
    
    @Autowired
    private ILendingService lendingService;
    
    
    @GetMapping("/buscarReservas")
    public List<LendingDto> buscarReservasxUsuario(@RequestParam String usuario){
        return lendingService.buscarReservasxUsuario(usuario);
    }
    
    
    @PostMapping("/nuevaReserva")
    public void crearNuevaReserva (@RequestBody LendingDto nuevaReserva){
        lendingService.registrarReserva(nuevaReserva) ;
    }
}
