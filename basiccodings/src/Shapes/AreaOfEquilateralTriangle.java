package Shapes;
import java.util.*;
public class AreaOfEquilateralTriangle {
public  void Area(){
Scanner a = new Scanner(System.in);
    System.out.println("enter side");
int side=a.nextInt();
    System.out.println("Side : "+side);
double areas;
areas = (1.73 *side*side)/4;
    System.out.println("Are of equilateral Triangle = "+areas);


}
    
    public static void main(String[] args) {
        AreaOfEquilateralTriangle t =new AreaOfEquilateralTriangle();
        t.Area();
    }
 
}
