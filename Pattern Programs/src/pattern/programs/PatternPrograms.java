//draw a pattren
//*
//**
//***
//****
//*****


package pattern.programs;
import java.util.*;
public class PatternPrograms {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the value");
    int value=scanner.nextInt();
        System.out.println("Design Pattern ");
        for (int i = 0; i <=value; i++) {
            for (int j = 0; j <=i; j++) {
                
                System.out.print("*");
               
            }
            System.out.println();
        }
       }
    
}
