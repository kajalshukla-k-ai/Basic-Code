package Shapes;
import java.util.*;
public class CGPAPercentage {
    public static void main(String[] args) {
       Scanner en = new Scanner(System.in);
    Scanner h=new Scanner(System.in);
    Scanner m = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    Scanner sst = new Scanner(System.in);
    Scanner total=new Scanner(System.in);
       System.out.println("Total Subjects");
       double t=total.nextDouble();
          System.out.println("Total Subjects :"+t);
        System.out.println("Enter english grades");
         double e=en.nextDouble();
         System.out.println("English grades : "+e);
        System.out.println("Enter hindi grades");
    double hi=h.nextDouble();
       System.out.println("Hindi grades : "+hi);
       System.out.println("Enter math grades");
   double ma=m.nextDouble();
      System.out.println("Math grades : "+ma);
       System.out.println("Enter science grades");
      double s=sc.nextDouble();
       System.out.println("Science grades : "+s);
       System.out.println("Enter social science grade");
    double ss=sst.nextDouble();
       System.out.println("Social Science grades : "+ss);
    double grades;
    grades=e+hi+ma+s+ss;
       System.out.println("Grades in all Subjects"+grades);
    double cgpa;
    cgpa=grades/t;
       System.out.println("CGPA = "+cgpa);
    
    
    
    
    }
    
            
}
