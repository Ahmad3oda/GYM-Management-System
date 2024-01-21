/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GYM_Project;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Ahmed
 */
public class informationFromLogin {
    static ResultSet result;
    static Statement statement;
    static Connection connection;
    static String query;
    public static int selected=0;
    public static int idOfSelected=0;
    private static int AdminId =  idOfSelected;
    private static int index;
    public static ArrayList<Admin> infoAllAdmin = new ArrayList<>();
    
    public static void refresh(Object ob){
        try{
            dbSecuer sql = new dbSecuer();
            connection = sql.connect();
            statement = connection.createStatement();
            ( (Admin_profile) ob).setVisible(false);
            getFromDataBase();
            select sele = new select();
            setInselect(sele);
            sele.setVisible(true);
            selectFunctions.goToAdminProfile(sele);
            
        }
        catch(Exception ee){
            System.out.println( ee.getMessage() );
        }
    }
    public static int getAdminId() {
        return idOfSelected;
    }

    public static void setAdminId(int Id) {
        idOfSelected = Id;
    }

    public static void setIndex(int id) {
        index = id;
    }

    public static int getIndex() {
        return index;
    }
    //************************************************
    public static void getFromDataBase(){
        try{
            dbSecuer sql = new dbSecuer();
            connection = sql.connect();
            statement = connection.createStatement();
            query = "select * from admin";
            result = statement.executeQuery(query);
            while( result.next() ){
                Admin info = new Admin();
                info.setId(result.getInt("admin_id"));
                info.setFirstName(result.getString("admin_firstName"));
                info.setLastName(result.getString("admin_lastName"));
                info.setEmail(result.getString("admin_email"));
                info.setPassword(result.getString("admin_password"));
                info.setAddress(result.getString("admin_address"));
                info.setPhoneNumber(result.getString("admin_phoneNumber"));
                info.setBirthDate(result.getDate("admin_birthDate"));
                info.setSalary(result.getDouble("admin_salary"));
                informationFromLogin.infoAllAdmin.add(info);
            }
            for (int i = 0; i < informationFromLogin.infoAllAdmin.size(); i++) {
                if( informationFromLogin.infoAllAdmin.get(i).getId() == informationFromLogin.getAdminId() )
                {
                    informationFromLogin.setIndex(i);
                    break;
                }
            }
            
        }
        catch(Exception ee){
            System.out.println(ee.getMessage());
            
        }
    }
    //***************************************************************************
    //************************************************************************************
    public static void setInselect(Object ob){
        if( ob instanceof select && infoAllAdmin.size()>0){
            ( (select)ob ).setHiAdmin("Hi " + informationFromLogin.infoAllAdmin.get( informationFromLogin.getIndex() ).getFirstName());
        }
        }
    
    //****************************************************************
    public static void updatesec(Object ob){
        ( (Admin_profile) ob).setAdminName      (( (Admin_profile) ob).getTextName() );
        ( (Admin_profile) ob).setAdminEmail     (( (Admin_profile) ob).getTextEmail() );
        ( (Admin_profile) ob).setAdminPassword  (( (Admin_profile) ob).getTextPassword() );
        ( (Admin_profile) ob).setAddress        (( (Admin_profile) ob).getTextAddress());
        ( (Admin_profile) ob).setAdminPhone     (( (Admin_profile) ob).getTextPhone());
        ( (Admin_profile) ob).setAdminBirthdate (( (Admin_profile) ob).getTextBirthDay());
    }
    public static void setInAdminProdile(Object ob){
    try{
        if(ob instanceof Admin_profile)
        {
            Admin admin = new Admin();
            admin = infoAllAdmin.get( getIndex() );
            ( (Admin_profile) ob).setAdminId        ( admin.getId() );
            ( (Admin_profile) ob).setAdminName      (admin.getFirstName()+ " " + admin.getLastName() );
            ( (Admin_profile) ob).setAdminEmail     (admin.getEmail() );
            ( (Admin_profile) ob).setAdminPassword  (admin.getPassword() );
            ( (Admin_profile) ob).setAddress        (admin.getAddress() );
            ( (Admin_profile) ob).setAdminPhone     (admin.getPhoneNumber());
            ( (Admin_profile) ob).setAdminBirthdate (admin.getBirthDate() + "" );
            //***************************************************************************
            ( (Admin_profile) ob).setTextName( admin.getFirstName()+ admin.getLastName() );
            ( (Admin_profile) ob).setTextEmail( admin.getEmail() );
            ( (Admin_profile) ob).setTextPassword( admin.getPassword() );
            ( (Admin_profile) ob).setTextAddress( admin.getAddress() );
            ( (Admin_profile) ob).setTextPhone( admin.getPhoneNumber() );
            ( (Admin_profile) ob).setTextBirthDay( admin.getBirthDate() + "");
        }
    }
    catch(Exception ee){
        select admin = new select();
        JOptionPane.showMessageDialog( admin, ee.getMessage() );
        
    }
        
}
    //******************************************
    public static void updateInAdminProfile(Object ob){
        try{
            if(ob instanceof Admin_profile)
            {
                dbSecuer sql = new dbSecuer();
                connection = sql.connect();
                statement = connection.createStatement();
                Admin admin = new Admin();
                admin = infoAllAdmin.get( getIndex() );
                int id = admin.getId();
                System.out.println(id);
                query = "update admin set admin_firstName = '" + ((Admin_profile) ob).getTextName() +"' "
                        + "where admin_id = '" + id +"'";
                statement.execute( query );
                query = "update admin set admin_lastName = '" + " " +"' "
                        + "where admin_id = '" + id +"'";
                statement.execute( query );
                query = "update admin set admin_email = '" + ((Admin_profile) ob).getTextEmail() +"' "
                        + "where admin_id = '" + id +"'";
                statement.execute( query );
                query = "update admin set admin_password = '" + ((Admin_profile) ob).getTextPassword() +"' "
                        + "where admin_id = '" + id +"'";
                statement.execute( query );
                query = "update admin set admin_address = '" + ((Admin_profile) ob).getTextAddress() +"' "
                        + "where admin_id = '" + id +"'";
                statement.execute( query );
                query = "update admin set admin_phoneNumber = '" + ((Admin_profile) ob).getTextPhone() +"' "
                        + "where admin_id = '" + id +"'";
                statement.execute( query );
                query = "update admin set admin_birthDate = '" + ((Admin_profile) ob).getTextBirthDay() +"' "
                        + "where admin_id = '" + id +"'";
                statement.execute( query );
                //*******************************************************************************
                //**********************
                try{
                    connection = sql.connect();
                    statement = connection.createStatement();
                    query = "select * from admin";
                    result = statement.executeQuery(query);
                    while( result.next() ){
                        Admin info = new Admin();
                        info.setId(result.getInt("admin_id"));
                        info.setFirstName(result.getString("admin_firstName"));
                        info.setLastName(result.getString("admin_lastName"));
                        info.setEmail(result.getString("admin_email"));
                        info.setPassword(result.getString("admin_password"));
                        info.setAddress(result.getString("admin_address"));
                        info.setPhoneNumber(result.getString("admin_phoneNumber"));
                        info.setBirthDate(result.getDate("admin_birthDate"));
                        info.setSalary(result.getDouble("admin_salary"));
                        informationFromLogin.infoAllAdmin.add(info);
                    }
                    for (int i = 0; i < informationFromLogin.infoAllAdmin.size(); i++) {
                        if( informationFromLogin.infoAllAdmin.get(i).getId() == informationFromLogin.getAdminId() )
                        {
                            informationFromLogin.setIndex(i);
                            break;
                        }
                    }

                }
                catch(Exception ee){
                    System.out.println(ee.getMessage());

                }
                //***********************
                admin.setFirstName( ((Admin_profile) ob).getTextName() );
                admin.setLastName("");
                admin.setPassword(((Admin_profile) ob).getTextPassword());
                admin.setAddress(((Admin_profile) ob).getTextAddress());
                String date = ((Admin_profile) ob).getTextBirthDay() + "";
                Date date2 = new Date(date);
                admin.setBirthDate( date2 );
                admin.setEmail(((Admin_profile) ob).getTextEmail());
                admin.setPhoneNumber( ((Admin_profile) ob).getTextPhone());
                updatesec(ob);
                System.out.println("ok");
            }
        }
        catch(Exception ee){
            System.out.println( ee.getMessage() );
        }
        
    }

} 
    
    

