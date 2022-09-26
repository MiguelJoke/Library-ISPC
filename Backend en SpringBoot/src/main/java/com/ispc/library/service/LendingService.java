
package com.ispc.library.service;


import com.ispc.library.repository.ILendingRepository;
import dto.LendingDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Caro
 */
@Service
public class LendingService implements ILendingService {
    
    @Autowired
    private ILendingRepository lendinRepository;

    @Override
    public List<LendingDto> buscarReservasxUsuario(String username) {
        return lendinRepository.buscarReservasXUsuario(username);
    }

    @Override
    public void registrarReserva(String username, LendingDto libro) {
        lendinRepository.crearReserva(username, libro);
    }
    
}
