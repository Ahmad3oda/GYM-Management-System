/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GYM_Project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author RMDN
 */
public class Train 
{
    private String Train_Message;
    private int Train_Hours;
    private int Coach_ID;
    private int member_ID;
    private String Train_Day;
    public static ArrayList<Train> Messages = new ArrayList<Train>();
    String user="root",pass="",add="jdbc:mysql://localhost/GYM_db";
    Security c1 = new Security();
    public void Trains() throws SQLException
    {                  
    }
    public String getTrain_Message() {
        return Train_Message;
    }

    public void setTrain_Message(String Train_Message) {
        this.Train_Message = Train_Message;
    }

    public int getTrain_Hours() {
        return Train_Hours;
    }

    public void setTrain_Hours(int Train_Hours) {
        this.Train_Hours = Train_Hours;
    }

    public int getCoach_ID() {
        return Coach_ID;
    }

    public void setCoach_ID(int Coach_ID) {
        this.Coach_ID = Coach_ID;
    }

    public int getMember_ID() {
        return member_ID;
    }

    public void setMember_ID(int member_ID) {
        this.member_ID = member_ID;
    }

    public String getTrain_Day() {
        return Train_Day;
    }

    public void setTrain_Day(String Train_Day) {
        this.Train_Day = Train_Day;
    }
}
