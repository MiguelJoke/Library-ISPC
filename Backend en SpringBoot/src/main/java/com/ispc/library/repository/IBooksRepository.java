
package com.ispc.library.repository;

import com.ispc.library.model.Book;
import dto.LibrosDisponiblesDto;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface IBooksRepository {
    public List<Book> traerTodosLibros();
    public List<LibrosDisponiblesDto> traerLibrosDisponibles();
}
