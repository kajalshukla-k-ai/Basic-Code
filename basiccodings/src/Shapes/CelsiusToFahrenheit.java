package Shapes;
import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
    Scanner c=new Scanner(System.in);
        System.out.println("Enter Value");
    int celsius =c.nextInt();
        System.out.println("Value : "+celsius);
    int fahrenheit ;
    fahrenheit = ((celsius*9)/5)+32;
        System.out.println("Temprature in Fahrenheit = "+fahrenheit);
    }
}
