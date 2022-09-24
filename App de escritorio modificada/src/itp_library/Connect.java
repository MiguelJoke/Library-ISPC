package itp_library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "123456";
    private static final String db = "library";
    private static final String url = "jdbc:mysql://localhost/"+db+"";
    
    public Connect(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            
            //Quitando mensajes del sistema
            // Connect?
            //if(conn != null)
            //  System.out.println("Conexión establecida exitosamente");
        }catch (ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, "No hay conexión con la base de datos. Por favor contacte con el administrador. \n Error: "+ex);
            //System.out.println("Conexión Fallida:\n\n"+ex); se cambia el sout por una ventana de error en caso de no poder establecerse la conexion
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}
