package basiccodings;
import java.util.*;

public class custom {
    String  First_name,last_name,city,phone_number;
public void accept(){
    System.out.println("------------------------------------------------");
    System.out.println("Enter First Name");
    Scanner fn=new Scanner(System.in);
    First_name=fn.next();
System.out.println("Enter Last Name");
    Scanner ln=new Scanner(System.in);
    last_name=ln.nextLine();
System.out.println("Enter City");
    Scanner c=new Scanner(System.in);
    city=c.next();
System.out.println("Enter Phone Number");
    Scanner pn=new Scanner(System.in);
    phone_number=pn.next();
System.out.println("--------------------------------------------------------");
System.out.println("**********************************************************");
}
public void display(){
    
System.out.println("First Name "+First_name);
System.out.println("Last Name "+last_name);
System.out.println("City "+city);
System.out.println("Phone Number "+phone_number);
}
public static void main(String args[]){
custom ct=new custom();
ct.accept();
ct.display();
}
}
