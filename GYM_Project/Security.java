package GYM_Project;

import java.sql.*;

public class Security
{
    private final String user="root",pass="",add="jdbc:mysql://localhost/GYM_db";

    public Connection connect() throws SQLException
    {
        return DriverManager.getConnection(add,user,pass);
    }

}

