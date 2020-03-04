package Number;
import java.io.*;
import java.util.*;
public class DisariumNumber {
  public static void main(String[] args) {
      
    Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
    int n = s.nextInt();// create a variable
    int copy =n, d=0,sum=0; //copy the n
     
    String str= Integer.toString(n); // convert the n [number] into integer
    int len = str.length(); // find the length of value
    while(copy>0){// using while loop
    d=copy%10; // put the value of d = copy%10
    sum = sum+(int)Math.pow(d, len);//sum value = function of pow
    len--;// decrement in the value of len
    copy= copy/10;// copy = copy/10
    
    }
    if(sum == n)//checking the statement 
          System.out.println("it is Disarium");
   else
          System.out.println("it is not Disarium");


        
    }
}
