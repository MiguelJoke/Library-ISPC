

package com.ispc.library.service;

import dto.LibrosDisponiblesDto;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface IBookService {
    public List<LibrosDisponiblesDto> buscarLibrosDisponibles();
    
}
