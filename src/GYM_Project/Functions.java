package GYM_Project;
import static java.lang.Integer.parseInt;
import java.sql.*;
import javax.swing.JOptionPane;


public class Functions {
    static Connection connection;
    
    public static Connection connect() throws SQLException {
        return connection=DriverManager.getConnection("jdbc:mysql://localhost/GYM_db","root","");
    }
     
    public static boolean check(String username,String password,String id){
        int flag=0,subscriptionFlag=0;
        try{
            switch (informationFromLogin.selected) {
                case 1 -> { 
                    for(int i=0;i<Admin.Admins.size();i++){
                        if(Admin.Admins.get(i).getId()==parseInt(id)&&Admin.Admins.get(i).getEmail().equals(username)
                            &&Admin.Admins.get(i).getPassword().equals(password)){
                            informationFromLogin.idOfSelected=Admin.Admins.get(i).getId();
                            flag=1;
                            select ahmed = new select();
                            new select().setVisible(true);
                            break;
                        }
                    }  
                }
                case 2 -> { 
                    for(int i=0;i<Coach.Coachs.size();i++){
                        if(Coach.Coachs.get(i).getId()==parseInt(id)&&Coach.Coachs.get(i).getEmail().equals(username)
                            &&Coach.Coachs.get(i).getPassword().equals(password)){
                            informationFromLogin.idOfSelected=Coach.Coachs.get(i).getId();
                            flag=1;
                            new table(informationFromLogin.idOfSelected).setVisible(true);
                            break;
                        }
                    }
                }
                case 3 -> {
                    for(int i=0;i<Member.Members.size();i++){
                        if(Member.Members.get(i).getId()==parseInt(id)&&Member.Members.get(i).getEmail().equals(username)
                            &&Member.Members.get(i).getPassword().equals(password)){
                            System.out.println(Member.Members.get(i).getId()+" "+Member.Members.get(i).getEmail()+" "+Member.Members.get(i).getPassword());
                            if(!Member.Members.get(i).isSubscriptionEnded()){
                                informationFromLogin.idOfSelected=Member.Members.get(i).getId();
                                flag=1;
                                new member_page_korya().setVisible(true);
                                break; 
                            }
                            else{
                                subscriptionFlag=1;
                                break;
                            } 
                        }
                    }
                }
            }
            if(flag==0&&subscriptionFlag==0){
                informationFromLogin.selected=0;
                JOptionPane.showMessageDialog(null, "INCORRECT INFORMATION","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(flag==0&&subscriptionFlag==1){
                informationFromLogin.selected=0;
                JOptionPane.showMessageDialog(null, "Your subscription has expired","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }  
        return (flag==1&&subscriptionFlag==0);
    }
}

