/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GYM_Project;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Selection {
    static Statement state;
    static Connection c ;
    static String query;
    public static void main(String[] args) {
        try{
            dbSecuer sql = new dbSecuer();
            c = (Connection) sql.connect();
            state = c.createStatement();
            boolean execute = state.execute( query );
            System.out.println("ok");
        }
        catch( SQLException ee ){
            System.out.println( ee.getMessage() );
        }
        finally{
            try{
                c.close();
                state.close();
            }
            catch( SQLException ee )
            {
                System.out.println( ee.getMessage() );
            }
        }
    }
    
}
