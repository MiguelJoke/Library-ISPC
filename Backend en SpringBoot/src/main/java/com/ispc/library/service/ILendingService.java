
package com.ispc.library.service;

import dto.LendingDto;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface ILendingService {
    public List<LendingDto> buscarReservasxUsuario(String username);
    public void registrarReserva(String username, LendingDto libro);
}
