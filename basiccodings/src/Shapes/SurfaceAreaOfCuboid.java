package Shapes;
import java.util.*;
public class SurfaceAreaOfCuboid {
    public static void main(String[] args) {
     
       Scanner l = new Scanner(System.in);
        Scanner w=new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        System.out.println("Enter Length");
        int lenght = l.nextInt();
        System.out.println("Lenght : "+lenght);
        System.out.println("Enter Width");
        int width =w.nextInt();
        System.out.println("Width : "+width);
        System.out.println("Enter Height");
        int height = h.nextInt();
        System.out.println("Height : "+height);
        int cuboid;
        cuboid = 2*(lenght*width + width*height+height*lenght);
        System.out.println("Surface Area Of Cuboid = "+cuboid);
        
        
        
        
        
        
        
        
    } 
}
