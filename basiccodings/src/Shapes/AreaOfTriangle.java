package Shapes;
import java.util.*;
public class AreaOfTriangle {
    void Triangle(){
    Scanner b=new Scanner(System.in);
    Scanner h=new Scanner(System.in);
    System.out.println("Enter breadth"); 
    int breadth=b.nextInt();
        System.out.println("Breadth : "+breadth);
    System.out.println("Enter Height");
    int height = h.nextInt();
    System.out.println("Height : "+height);
    int area=(breadth*height)/2;
    System.out.println("Area Of Triangle = "+area);
    
    }
    public static void main(String[] args) {
        AreaOfTriangle t=new AreaOfTriangle();
    t.Triangle();
    }
}
//Area of triagle and area of right angle triangle*/