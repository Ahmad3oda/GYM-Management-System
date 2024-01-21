/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GYM_Project;

/**
 *
 * @author STW
 */
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Ahmed
 */
public class Member extends User {

    /*start data fields*/
    public static ArrayList<Member> Members = new ArrayList<>();
    private int coachId;
    //*****************
    private Date dateSubscriptionStart;
    private Date dateSubscriptionEnd;
    //******************
    private double SubscriptionPrice;
    private double weight;
    private double height;
    //*******************
    /* static varuables*/
    private static int numOfMembers;

    /*end data fields*/
    //***********************************************************************
    /* start constractoers */
    public Member(int id,String filrstName,String lastName,String email,String password,String address,String phoneNumber,Date birthDate,Date dateSubscriptionEnd,double SubscriptionPrice,double weight,double height,int coachId){
        super( id , filrstName , lastName , email , password , address , phoneNumber , birthDate );
        this.dateSubscriptionEnd = dateSubscriptionEnd;
        this.SubscriptionPrice = SubscriptionPrice;
        this.height = height;
        this.weight = weight;
        this.coachId = coachId;
        dateSubscriptionStart = new Date();
        numOfMembers++;
    }
     public Member(String firstName, String lastName, int id, Date dateSubscriptionEnd, int coach_Id) {
         setId(id);
         setCoachId(coach_Id) ;
         setFirstName(firstName) ;
         setLastName(lastName);
         this.dateSubscriptionEnd = dateSubscriptionEnd;
    }
    public Member(){
        
    }
    /* end constractoers */
    //***********************************************************************
    /*start seter*/

    public void setDateSubscriptionEnd(Date dateSubscriptionEnd) {
        this.dateSubscriptionEnd = dateSubscriptionEnd;
    }

    public void setSubscriptionPrice(double subscriptionPrice) {
        SubscriptionPrice = subscriptionPrice;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public void setDateSubscriptionStart(Date dateSubscriptionStart) {
        this.dateSubscriptionStart = dateSubscriptionStart;
    }

    /*start seter*/
    //***********************************************************************
    /*start geter*/
    public Date getDateSubscriptionEnd() {
        return dateSubscriptionEnd;
    }

    public Date getDateSubscriptionStart() {
        return dateSubscriptionStart;
    }

    public double getSubscriptionPrice() {
        return SubscriptionPrice;
    }

    public int getCoachId() {
        return coachId;
    }
    /*end geter*/
    public boolean isSubscriptionEnded(){
        return (getDateSubscriptionEnd().getYear()<=getDateSubscriptionStart().getYear()+1
                &&getDateSubscriptionEnd().getMonth()<=getDateSubscriptionStart().getMonth()+1
                &&getDateSubscriptionEnd().getDay()<=getDateSubscriptionStart().getDay());
    }
    public double getWeight()
    {
        return weight;
    }
    public double getHeight()
    {
        return height;
    }
    //***********************************************************************
}