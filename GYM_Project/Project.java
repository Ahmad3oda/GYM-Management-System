package GYM_Project;

import java.sql.*;

public class Project 
{
    static Connection c ;
    static Statement state;
    static Security s=new Security();
    public static void main(String[] args) throws SQLException
    {
        try
        {
            c=s.connect();
            state=c.createStatement();
            login f=new login();
            f.setVisible(true);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            try
            {
                c.close();
                state.close();
            }
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
    
}

