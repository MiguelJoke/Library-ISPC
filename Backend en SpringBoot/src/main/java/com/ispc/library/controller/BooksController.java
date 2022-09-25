
package com.ispc.library.controller;

import com.ispc.library.service.IBookService;
import dto.LibrosDisponiblesDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class BooksController {
    
    @Autowired
    private IBookService booksService;
    
    //devuelve los libros disponibles para ser reservados
    @GetMapping("/librosdisponibles")
    public List<LibrosDisponiblesDto> buscarLibrosDisponibles(){
        return booksService.buscarLibrosDisponibles();
    }
}
