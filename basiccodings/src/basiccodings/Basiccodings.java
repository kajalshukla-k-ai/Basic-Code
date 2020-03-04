package basiccodings;
//import scanner for get value from users//
import java.util.Scanner;
public class Basiccodings {
public void sumSolution(){
int sum;

 Scanner sc=new Scanner(System.in);
 Scanner ab=new Scanner(System.in);
int a=sc.nextInt();
int b=ab.nextInt();
sum=a+b;
System.out.println("enter first num"+a);
System.out.println("enter second num"+b);

System.out.println("ans is  "+sum);
}
    public static void main(String[] args) {
Basiccodings y=new Basiccodings();

 y.sumSolution(); 
}
    
}
