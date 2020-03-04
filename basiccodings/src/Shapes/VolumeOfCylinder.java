package Shapes;
import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        Scanner h = new Scanner(System.in);
         System.out.println("Enter radius");
        int radius=r.nextInt();
         System.out.println("Radius : "+radius);
         System.out.println("Enter height");
        int height=h.nextInt();
         System.out.println("Height : "+height );
        double volume;
        volume = 3.14*radius*radius*height;
         System.out.println("Volume Of Cylinder = "+volume);
        
        
        
        
        
        
        
        
        
    }
}
