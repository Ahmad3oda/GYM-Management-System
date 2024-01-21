/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GYM_Project;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static GYM_Project.informationFromLogin.connection;

/**
 *
 * @author Ahmed
 */
public class selectFunctions {
    static ResultSet result;
    static Statement statement;
    static Connection connection;
    static String query;
    //**************************************************
    public static void goToAdminProfile(select sele){
        Admin_profile admin_profile = new Admin_profile();
        informationFromLogin.setInAdminProdile(admin_profile);
        admin_profile.setVisible(true);
        admin_profile.setLocation(450, 200);
        sele.setVisible(false);
    }
    //*************************************************
    public static void goToMain(Object ob){
        if( ob instanceof Admin_profile)
        {
            ( (Admin_profile) ob ).setVisible(false);
        }
        else if( ob instanceof AdminAccess)
        {
            ( (AdminAccess) ob ).setVisible(false);
        }
        select sele = new select();
        sele.setVisible(true);
        sele.setLocation(450, 200);
    }
    //***************************************************
    public static void logOut(Object ob){
        if( ob instanceof Admin_profile)
        {
            ( (Admin_profile) ob ).setVisible(false);
        }
        else if(ob instanceof select)
        {
            ( (select) ob ).setVisible(false);
        }
        else if(ob instanceof AdminAccess)
        {
            ( (AdminAccess) ob ).setVisible(false);
        }
        loginGomaa login = new loginGomaa();
        login.setVisible(true);            
    }
    //*****************************************************
    public static void goToAdminAccess(Object ob){
        if( ob instanceof select)
        {
            ( (select) ob ).dispose();
        }
        AdminAccess adminAccess = new AdminAccess();
        adminAccess.setVisible(true);
    }
    //****************************************************
    public static void addAdmin(Object ob){
        try{
            dbSecuer sql = new dbSecuer();
            connection = sql.connect();
            statement = connection.createStatement();
            String id2 = ( (AddAdmin) ob).getTextId();
            if(!id2.matches("[0-9]+"))
            {
                JOptionPane.showMessageDialog(( (AddAdmin) ob), "id should be numbers");
                return;
            }
            int id = Integer.parseInt(id2);
            String email = ( (AddAdmin) ob ).getTextEmail();
            int size = informationFromLogin.infoAllAdmin.size();
            System.out.println(size);
            for(int i=0;i < size;++i){
                System.out.println(i);
                if(id == informationFromLogin.infoAllAdmin.get(i).getId())
                {
                    JOptionPane.showMessageDialog(( (AddAdmin) ob), "id is Already used");
                    return ;
                }
                
                if(email.equals(informationFromLogin.infoAllAdmin.get(i).getEmail()))
                {
                    JOptionPane.showMessageDialog(( (AddAdmin) ob), "email is Already used");
                    return ;
                }
                
            }
            System.out.println("here");
            String name = ( (AddAdmin) ob ).getTextName();
            if(name.matches("[0-9]+") )
            {
                JOptionPane.showMessageDialog(( (AddAdmin) ob), "name should be valid");
                return;
            }
            
            String password = ( (AddAdmin) ob ).getTextPassword();
            String address = ( (AddAdmin) ob ).getTextAddress();
            String phone  = ( (AddAdmin) ob ).getTextPhone();
            String BirthDay = ( (AddAdmin) ob ).getTextBirthDay();
            String salary = ( (AddAdmin) ob ).getTextSalary();
            if(name.length() > 0 && email.length() > 0 && password.length() > 0 && salary.length() > 0)
            {
                query = "insert into admin "
                    + "values ( "
                    + "'" + id +"', "
                    + "'" + name +"', "
                    + "'" + " " +"', "
                    + "'" + salary +"', "
                    + "'" + email +"', "
                    + "'" + password +"',"
                    + "'" + address +"',"
                    + "'" + phone +"',"
                    + "'" + BirthDay +"' "
                    + ")";
            statement.execute(query);
            JOptionPane.showMessageDialog(( (AddAdmin) ob), "Added successfully");
            AdminAccess admin = new AdminAccess();
            ( (AddAdmin) ob).setVisible(false);
            ( (AddAdmin) ob).setVisible(true);
            informationFromLogin.getFromDataBase();
            }
            else
            {
                JOptionPane.showMessageDialog(( (AddAdmin) ob), "Missing information");
            }
            AdminAccess admin = new AdminAccess();
            ( (AddAdmin) ob).setVisible(false);
            ( (AddAdmin) ob).setVisible(true);
            
        }
        catch(Exception ee){
            JOptionPane.showMessageDialog(( (AddAdmin) ob), ee.getMessage());
            
        }
    }
    //*******************************************************************************************
    public static void goToList(Object ob)
    {
        if(ob instanceof AdminAccess)
            ( (AdminAccess)ob ).setVisible(false);
        else if(ob instanceof deleteAdmin)
            ( (deleteAdmin)ob ).setVisible(false);
        else if(ob instanceof AddAdmin)
            ( (AddAdmin)ob ).setVisible(false);
        AdminAccess admin = new AdminAccess();
        admin.setVisible(true);
        admin.setLocation(450,200);
    }
    public static void goToDelete(Object ob){
        if(ob instanceof AdminAccess)
            ( (AdminAccess)ob ).setVisible(false);
        else if(ob instanceof deleteAdmin)
            ( (deleteAdmin)ob ).setVisible(false);
        else if(ob instanceof AddAdmin)
            ( (AddAdmin)ob ).setVisible(false);
        deleteAdmin admin = new deleteAdmin();
        admin.setVisible(true);
        admin.setLocation(450,200);
    }
    //*********************************************************************************************
    public static void deleteAdmin(Object ob){
        if( !( ( (deleteAdmin)ob ).getTextId().matches("[0-9]+") ) ){
            JOptionPane.showMessageDialog(( (deleteAdmin)ob ), "id should be positive numbers only");
            return;
        }
        int id = Integer.parseInt( ( (deleteAdmin)ob ).getTextId() );
        if( informationFromLogin.getIndex() == 0 )
        {
            if( id == 0 )
            {
                JOptionPane.showMessageDialog(( (deleteAdmin) ob), "it's owner :)");
                return;
            }
            boolean flag = false;
            boolean dangerous = false;    
            for(int i=0;i<informationFromLogin.infoAllAdmin.size();i++)
            {
                if(  id == informationFromLogin.getIndex())
                {
                    JOptionPane.showMessageDialog(( (deleteAdmin) ob), "can't delet current account!!");
                    return;

                }
                if( id ==  informationFromLogin.infoAllAdmin.get(i).getId())
                {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                JOptionPane.showMessageDialog(( (deleteAdmin) ob), "id not found");
                return;
            }
            try{
                dbSecuer sql = new dbSecuer();
                connection = sql.connect();
                statement = connection.createStatement();

                query = "delete from admin where admin_id = '" + id +"'";
                statement.execute(query);
                informationFromLogin.getFromDataBase();
                ((deleteAdmin)ob).setVisible(false);
                ( (deleteAdmin) ob).setVisible(true);

            }
            catch(Exception ee){
                JOptionPane.showMessageDialog(( (deleteAdmin) ob), ee.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(( (deleteAdmin) ob), "Only the owner can delete");
        }
    }
    
}
