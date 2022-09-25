
package com.ispc.library.repository;

import com.ispc.library.model.Book;
import dto.LendingDto;
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
public class LendingRepository implements ILendingRepository {

    @Autowired
    private JdbcTemplate plantilla;
    
    @Override
    public void crearReserva(String nombreusuario, Book libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LendingDto> buscarReservasXUsuario(String nombreUsuario) {
        final String BUSCAR_RESERVAS_X_USUARIO = "Select l.book_id, b.title, b.author, l.date_out, l.date_return, l.user_id from lendings l, books b, users u where l.book_id = b.id AND l.user_id = u.id AND u.username ='"+ nombreUsuario+"'";
        
        return plantilla.query(BUSCAR_RESERVAS_X_USUARIO,  new ResultSetExtractor<List<LendingDto>>(){  
                                @Override  
                                 public List<LendingDto> extractData(ResultSet rs) throws SQLException,  
                                        DataAccessException {  

                                        List<LendingDto> list=new ArrayList<LendingDto>();  
                                        while(rs.next()){  
                                        LendingDto l=new LendingDto();  
                                        l.setIdLibro(rs.getInt(1));
                                        l.setNombreLibro(rs.getString(2));  
                                        l.setAutorLibro(rs.getString(3));
                                        l.setFechaSalida(rs.getString(4));
                                        l.setFechaPrevistaDevolucion(rs.getString(5));
                                        list.add(l);  
                                        }  
                                        return list;  
                                        }  
                                    });  
    }
    
}
