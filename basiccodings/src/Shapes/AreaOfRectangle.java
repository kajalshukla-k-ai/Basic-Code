package Shapes;
import java.util.Scanner;

public class AreaOfRectangle {
    
    public static void main(String[] args) {
     Scanner w = new Scanner(System.in);
    Scanner h = new Scanner(System.in);

    
    
    System.out.println("Enter the width");
int width = w.nextInt();
System.out.println(" Width is :"+ width);
    System.out.println("Enter the height");
   int height = h.nextInt();
   System.out.println(" Height is :" +height); 
   int  area ;
   area = width*height;
        System.out.println("Area Of Rectangle is :" + area);
    
    
    
       
    }
    
    
}
