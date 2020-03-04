package Shapes;
import java.util.*;
public class SurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner r =new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius = r.nextDouble();
        System.out.println("radius : "+radius);
        System.out.println("Enter height");
        double height = h.nextDouble();
        System.out.println("height : "+height);
        double area ;
        area= 2*3.14*(radius+height ); 
        System.out.println("Surface Area Of Cylinder = "+area);
        
        
        
        
    }
}
