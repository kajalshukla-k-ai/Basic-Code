//draw a pattern
//    *
//   ***
//  *****
// *******
//**********
package pattern.programs;
import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
    int value= s.nextInt();
        System.out.println("Pattern");
        for (int i = 1; i < value; i++) {
            
        
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        
            System.out.println();
        }
    s.close();
    }
    
}
