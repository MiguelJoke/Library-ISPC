

package com.ispc.library.service;

import com.ispc.library.repository.IBooksRepository;
import dto.LibrosDisponiblesDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Caro
 */
@Service
public class BookService implements IBookService {

    @Autowired 
    private IBooksRepository librosRepository;
      
    @Override
    public List<LibrosDisponiblesDto> buscarLibrosDisponibles() {
        return librosRepository.traerLibrosDisponibles();
      
    }
    
}
