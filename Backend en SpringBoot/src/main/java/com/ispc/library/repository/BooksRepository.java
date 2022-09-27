

package com.ispc.library.repository;

import com.ispc.library.model.Book;
import dto.LendingDto;
import dto.LibrosDisponiblesDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caro
 */
@Repository
public class BooksRepository implements IBooksRepository{
    
    @Autowired
    private JdbcTemplate plantilla;
    

    @Override
    public List<Book> traerTodosLibros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //devuelve todos los libros que estan disponibles para ser prestados
    @Override
    public List<LibrosDisponiblesDto> traerLibrosDisponibles() {
        final String BUSCAR_LIBROS_DISPONIBLES = ("Select id, title, author, category, lang from books where available > 0");
         return plantilla.query(BUSCAR_LIBROS_DISPONIBLES,  new ResultSetExtractor<List<LibrosDisponiblesDto>>(){  
                                @Override  
                                 public List<LibrosDisponiblesDto> extractData(ResultSet rs) throws SQLException,  
                                        DataAccessException {  

                                        List<LibrosDisponiblesDto> list=new ArrayList<LibrosDisponiblesDto>();  
                                        while(rs.next()){  
                                        LibrosDisponiblesDto l=new LibrosDisponiblesDto();  
                                        l.setId(rs.getInt(1));
                                        l.setTitle(rs.getString(2));  
                                        l.setAutor(rs.getString(3));
                                        l.setCategory(rs.getString(4));
                                        l.setLang(rs.getString(5));
                                        list.add(l);  
                                        }  
                                        return list;  
                                        }  
                                    });  
    }

}
