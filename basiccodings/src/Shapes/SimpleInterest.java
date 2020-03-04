package Shapes;
import java.util.*;
public class SimpleInterest {
    public static void main(String[] args) {
     Scanner p = new Scanner(System.in);
     Scanner r = new Scanner(System.in);
     Scanner t = new Scanner(System.in);
        System.out.println("Enter Principal Amount");
    int principal = p.nextInt();
    System.out.println("Principal Amount : "+principal);
    System.out.println("Enter Rate");
    int rate = r.nextInt();
    System.out.println("Rate : "+rate);
    System.out.println("Enter Time");
    int time=t.nextInt();
    System.out.println("Time : "+time);
    int interest;
    interest = (principal*rate*time)/100;
    System.out.println("Simple Interest is = "+interest);
    
    
    
    }
 
    
    
    
    
    
}
