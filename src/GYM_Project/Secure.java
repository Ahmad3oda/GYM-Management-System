package GYM_Project;
import java.sql.*;


/**
 *
 * @author Ouda
 */
public class Secure {
    private final String user="root";
    private final String password="";
    private final String address="jdbc:mysql://localhost/gym_db";
    
    public Connection connect() throws SQLException{
        return DriverManager.getConnection(address,user,password);
    }
}