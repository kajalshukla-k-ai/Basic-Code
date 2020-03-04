package Shapes;
import java.util.*;
public class VolumeOfShpere {
    public static void main(String[] args) {
     Scanner p = new Scanner(System.in);
      Scanner r = new Scanner(System.in);
        System.out.println("Enter the pie");
    double pie =p.nextDouble();
        System.out.println("pie = "+pie);
        System.out.println("Enter the radius");
     int radius =r.nextInt();
     System.out.println("radius =" +radius );
            double   volume;
            volume =(4.0/3.0)*pie*(radius*radius*radius);
        System.out.println(" Volume Of Shpere is:"+volume);
             
    
    }
    
}
