package Shapes;
import java.util.*;
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        Scanner p = new Scanner(System.in);
         System.out.println(" Enter Radius ");
         int radius=r.nextInt();
          System.out.println("Radius ="+radius);
     System.out.println(" Enter Height");
    int height = h.nextInt();
     System.out.println("Height ="+height);
     System.out.println("Enter pie");
     double pie=p.nextDouble();
     System.out.println("Pie ="+pie);
    double volume;
    volume = pie*radius*radius*height/3;
     System.out.println("Volume Of Cone ="+volume);
    
    
    }
    
}
