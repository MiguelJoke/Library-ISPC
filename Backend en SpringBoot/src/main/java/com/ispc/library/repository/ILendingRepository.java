

package com.ispc.library.repository;

import dto.LendingDto;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface ILendingRepository {
    public List<LendingDto> buscarReservasXUsuario(String nombreusuario);
    public void crearReserva(LendingDto libro);
    
    
}
