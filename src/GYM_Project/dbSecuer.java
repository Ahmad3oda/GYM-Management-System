/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GYM_Project;

import java.sql.*;

public class dbSecuer {
    private final String user = "root";
    private final String password = "";
    private final String add = "jdbc:mysql://localhost/GYM_db";
    private Connection c ;
    public Connection connect() throws SQLException{
        c = (Connection) DriverManager.getConnection( add , user , password );
        return c;
    }
}
