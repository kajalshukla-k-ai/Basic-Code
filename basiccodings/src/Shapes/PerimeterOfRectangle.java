package Shapes;
import java.util.*;
public class PerimeterOfRectangle {
    void Perimeter(){
    Scanner l=new Scanner(System.in);
    Scanner b=new Scanner(System.in);
        System.out.println("Enter Length");
    int length=l.nextInt();
        System.out.println("Length : "+length);    
    System.out.println("Enter Breadth");
    int breadth=b.nextInt();
    System.out.println("Breadth : "+breadth);
    int para;
    para = 2*(length+breadth);
    System.out.println("Parameter of rectangle = "+para);
    
    }
    public static void main(String[] args) {
        PerimeterOfRectangle por = new PerimeterOfRectangle();
        por.Perimeter();
    }
}
