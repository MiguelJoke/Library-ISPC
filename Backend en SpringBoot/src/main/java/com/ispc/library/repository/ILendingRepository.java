

package com.ispc.library.repository;

import com.ispc.library.model.Book;
import dto.LendingDto;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface ILendingRepository {
    public List<LendingDto> buscarReservasXUsuario(String nombreusuario);
    public void crearReserva(String nombreusuario, Book libro);
    
    
}
