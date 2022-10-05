package com.ispc.library.repository;

import com.ispc.library.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Caro
 */
@Repository 
public class UserRepository implements IUserRepository{
    
    @Autowired
    private JdbcTemplate plantilla;
   
    public UserRepository(JdbcTemplate plantilla) {
    this.plantilla = plantilla;
  }
    
    @Transactional
    public void guardarUsuario(User usuario){
        final String INSERT_USUARIO= "INSERT INTO Users (username, password, name, last_name_p, last_name_m, domicilio, tel, sanctions,sanc_money) values (?,?,?,?,?,?,?,?,?)";
        plantilla.update(INSERT_USUARIO, usuario.getUsername(), usuario.getPassword(), usuario.getName(), usuario.getLast_name_p(), usuario.getLast_name_m(), usuario.getDomicilio(), usuario.getTel(), usuario.getSanctions(), usuario.getSanc_money());
    }
    
    
    //@Transactional
    public List<User> buscarUsuarios(){
        final String LOGIN_USUARIO = "SELECT * FROM USERS";
        return plantilla.query(LOGIN_USUARIO, new ResultSetExtractor<List<User>>(){  
                                @Override  
                                 public List<User> extractData(ResultSet rs) throws SQLException,  
                                        DataAccessException {  

                                        List<User> list=new ArrayList<User>();  
                                        while(rs.next()){  
                                        User e=new User();  
                                        e.setId(rs.getInt(1));
                                        e.setUsername(rs.getString(2));  
                                        e.setPassword(rs.getString(3));  
                                        e.setName(rs.getString(4));  
                                        e.setLast_name_p(rs.getString(5));  
                                        e.setLast_name_m(rs.getString(6));  
                                        e.setDomicilio(rs.getString(7)); 
                                        e.setTel(rs.getString(8)); 
                                        e.setSanctions(rs.getInt(9)); 
                                        e.setSanc_money(rs.getInt(10)); 
                                        list.add(e);  
                                        }  
                                        return list;  
                                        }  
                                    });  
    }

    @Override
    public User buscarUnUsuario(String nombreUsuario) {
        final String BUSCAR_UN_USUARIO = "SELECT * FROM USERS WHERE username='"+ nombreUsuario+"'";
        return plantilla.query(BUSCAR_UN_USUARIO, new ResultSetExtractor<User>(){  
                                @Override  
                                 public User extractData(ResultSet rs) throws SQLException,  
                                        DataAccessException {  
                                        User usuario=new User();  
                                        usuario.setUsername(rs.getString(2));  
                                        usuario.setPassword(rs.getString(3));  
                                        usuario.setName(rs.getString(4));  
                                        usuario.setLast_name_p(rs.getString(5));  
                                        usuario.setLast_name_m(rs.getString(6));  
                                        usuario.setDomicilio(rs.getString(7)); 
                                        usuario.setTel(rs.getString(8)); 
                                        usuario.setSanctions(rs.getInt(9)); 
                                        usuario.setSanc_money(rs.getInt(10)); 
                                        
                                        return usuario;  
                                        }  
                                    });  
        
    }
}
