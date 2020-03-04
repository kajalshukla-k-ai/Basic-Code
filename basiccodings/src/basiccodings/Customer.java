package basiccodings;
import java.util.*;
public class Customer {
    String mobile_no ,name,DOB,billing_address,city,resi_mobile_no,amount_outstanding;
    public void Accept(){
        System.out.println("====================================================");
        
    System.out.println("Enter Mobile Number");
    Scanner sc=new Scanner(System.in);
        mobile_no=sc.nextLine();
    System.out.println("Enter Name");
    Scanner sa=new Scanner(System.in);
        name=sa.nextLine();
    System.out.println("Enter DOB");
    Scanner sd=new Scanner(System.in);
        DOB=sd.nextLine();
    System.out.println("Enter Billing Address");
    Scanner sb=new Scanner(System.in);
        billing_address=sb.nextLine();
    System.out.println("Enter the City");
    Scanner st=new Scanner(System.in);
        city=st.nextLine();
    System.out.println("Enter Residence Phone Number");
    Scanner sr=new Scanner(System.in);
        resi_mobile_no=sr.nextLine();
    System.out.println("Enter Amount Outstanding");
    Scanner so=new Scanner(System.in);
        amount_outstanding=so.nextLine();
        System.out.println("--------------------------------------------------- ");
    }
    
    public void Display(){
    System.out.println("========================================================");
     System.out.println(" Mobile Number ==== "+mobile_no);
    System.out.println(" Name ==== "+name);
    System.out.println(" DOB ==== "+DOB);
    System.out.println(" Billing Address ==== "+billing_address);
    System.out.println("City ==== "+city);
    System.out.println(" Residence Phone Number ==== "+resi_mobile_no);
    System.out.println(" Amount Outstanding ==== "+amount_outstanding);
    System.out.println("------------------------------------------------------  ");
    System.out.println("THANK YOUR DEAR  "+name);
    
    }
    public static void main(String args[]){
    Customer cs=new Customer();
    cs.Accept();
    cs.Display();
    
    }
    
    
}
 