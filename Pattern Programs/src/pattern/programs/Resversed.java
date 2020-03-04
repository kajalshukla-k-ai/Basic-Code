//draw the following pattern
//*****
//****
//***
//**
//*

package pattern.programs;
import java.util.Scanner;
public class Resversed {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     System.out.println("Enter the value");
int value = s.nextInt();
        System.out.println("Pattern");
        for (int i = 0; i <= value; i++) {
            for (int k = value; k >= i; k--) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        
        s.close();
    }
    }
