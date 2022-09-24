

package com.ispc.library.repository;

import com.ispc.library.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Caro
 */
@Repository
public class UserRepository {
    
    private JdbcTemplate plantilla;
    
    public UserRepository(JdbcTemplate plantilla) {
    this.plantilla = plantilla;
  }
    
    @Transactional
    public void guardarUsuario(User usuario){
        
        System.out.println(usuario.getName());
        System.out.println(usuario.getLast_name_m());
        System.out.println(usuario.getLast_name_p());
        plantilla.update("INSERT INTO Users (username, password, name, last_name_p, last_name_m, domicilio, tel, sanctions,sanc_money) values (?,?,?,?,?,?,?,?,?)", usuario.getUsername(), usuario.getPassword(), usuario.getName(), usuario.getLast_name_p(), usuario.getLast_name_m(), usuario.getDomicilio(), usuario.getTel(), usuario.getSanctions(), usuario.getSanc_money());
    }
    
}
