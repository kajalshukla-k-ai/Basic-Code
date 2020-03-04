package basiccodings;

import java.util.Scanner;
public class Railwaycustomer {
String r,k="KSV",z;

    public void Booking(){
        System.out.println("enter the customer name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        r=name;
    System.out.println("customer name: "+name);
    System.out.println("enter the customer email:");
    Scanner em=new Scanner(System.in);
        String email=em.nextLine();
    System.out.println("customer email:"+email);
   try{
    System.out.println("enter the customer phone no:");
    Scanner n=new Scanner(System.in);
        String num=n.nextLine();      
  System.out.println("customer phone no:"+num);
   }
   catch(Exception e){
   System.out.println("OOPS");
   }
        System.out.println("enter the customer Date of depature:");
    Scanner ac=new Scanner(System.in);
        String dof=ac.nextLine();
    System.out.println(" Date of depature:"+dof);
    }
    public void Status(){
    String a;
    a=z;
    if (a==k){
    System.out.println("Ticket has confirmed");
    }
    else{
    System.out.println("ticket is in the waiting list");
    }
    }
    public void Print(){
        String l;
        l=null;
    if (l==z){
    System.out.println("name:");
    System.out.println(" email: erkajalshukla@gmail.com");
    System.out.println(" phone no : 7678336256");
    System.out.println(" Date of depature: 07-06-2019");
    
    }
    else{
    System.out.println("next");
    }
    }
    public static void main(String args[]){
    Railwaycustomer rc=new Railwaycustomer();
    rc.Booking();
    rc.Status();
    rc.Print();
    
    
    }
}

