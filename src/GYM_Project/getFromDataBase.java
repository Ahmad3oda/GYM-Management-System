package GYM_Project;
import GYM_Project.Admin;
import GYM_Project.Coach;
import GYM_Project.Member;
import java.sql.*;

public class getFromDataBase {
    static Connection connection;
    public static Connection connect() throws SQLException {
        
        return connection=DriverManager.getConnection("jdbc:mysql://localhost/GYM_db","root","");
    }
    public static void getData(){
        try{
            Connection c=connect();
            Statement state= c.createStatement();
            String query= "select admin_id,admin_email,admin_password from admin ";
                    ResultSet rs = state.executeQuery(query);
                    
                    while(rs.next()){
                        Admin nAdmin = new Admin();
                        nAdmin.setId(rs.getInt("admin_id"));
                        nAdmin.setEmail(rs.getString("admin_email"));
                        nAdmin.setPassword(rs.getString("admin_password"));
                        Admin.Admins.add(nAdmin);

                    }   

                    query= "select coach_id,coach_email,coach_password from coach ";
                    rs = state.executeQuery(query);
                    
                    while(rs.next()){
                        Coach nCoach = new Coach();
                        nCoach.setId(rs.getInt("coach_id"));
                        nCoach.setEmail(rs.getString("coach_email"));
                        nCoach.setPassword(rs.getString("coach_password"));
                        Coach.Coachs.add(nCoach);
                    }  

                    query="select member_id,member_email,member_password,member_subscription_startDate,member_subscription_endDate from member";
                    rs = state.executeQuery(query);
                    
                    while(rs.next()){
                        Member nMember = new Member();
                        nMember.setId(rs.getInt("member_id"));
                        nMember.setEmail(rs.getString("member_email"));
                        nMember.setPassword(rs.getString("member_password"));
                        nMember.setDateSubscriptionStart(rs.getDate("member_subscription_startDate"));
                        nMember.setDateSubscriptionEnd(rs.getDate("member_subscription_endDate"));
                        Member.Members.add(nMember);
                    }

            }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                  
        }
        
    } 
    

