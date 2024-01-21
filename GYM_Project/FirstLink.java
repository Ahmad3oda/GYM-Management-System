package GYM_Project;

import java.sql.*;
//import java.util.Scanner;
public class FirstLink {
    static String user = "root";
    static String password = "";
    static String add = "jdbc:mysql://localhost/gym_db";
    static Connection c ;
    static Statement state;
    static String query;
    static ResultSet result; 
    public static void main(String[] args) {
        try{
            c = DriverManager.getConnection( add , user , password );
            state = c.createStatement();
            
            /*create admin table*/
            
            /*query = "create table admin("
                    + "admin_id int primary key, "
                    + "admin_firstName nvarchar(50), "
                    + "admin_lastName nvarchar(50), "
                    + "admin_salary float, "
                    + "admin_email nvarchar(50), "
                    + "admin_password nvarchar(50), "
                    + "admin_address nvarchar(50), "
                    + "admin_phoneNumber nvarchar(25), "
                    + "admin_birthDate date "
                    + ")";*/
            /****************************************************************/
            /*create coach table*/
            /*
            query = "create table coach("
                    + "coach_id int primary key, "
                    + "coach_firstName nvarchar(50), "
                    + "coach_lastName nvarchar(50), "
                    + "coach_salary float, "
                    + "coach_email nvarchar(50), "
                    + "coach_password nvarchar(50), "
                    + "coach_address nvarchar(50), "
                    + "coach_phoneNumber nvarchar(25), "
                    + "coach_birthDate date "
                    + ")";*/
            
             /****************************************************************/
            /*create member table*/
            
            /*query = "create table member("
                    + "member_id int primary key, "
                    + "member_firstName nvarchar(50), "
                    + "member_lastName nvarchar(50), "
                    + "member_subscription int, "
                    + "member_email nvarchar(50) unique, "
                    + "member_password nvarchar(50), "
                    + "member_address nvarchar(50), "
                    + "member_phoneNumber nvarchar(25), "
                    + "member_birthDate date, "
                    + "member_age int, "
                    + "member_subscription_startDate date, "
                    + "member_subscription_endDate date, "
                    + "member_coachId int references coach(coach_id)"
                    + ")";*/
            
            /****************************************************************/
            /*create inbox table*/
            
            /*query = "create table inbox("
                    + "inbox_message nvarchar(150), "
                    + "inbox_date date, "
                    + "coach_id int references coach(coach_id), "
                    + "member_id int references member(member_id)"
                    + ")";*/
                       
            /****************************************************************/
            /*create inbox report*/
            
            /*
            query = "create table report("
                    + "report_message nvarchar(150), "
                    + "report_date date, "
                    + "admin_id int references admin(admin_id), "
                    + "member_id int references member(member_id)"
                    + ")";
            */
            /****************************************************************/
            
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