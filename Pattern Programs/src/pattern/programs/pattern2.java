// draw a pattren
//    *
//   **
//  ***
// ****
//*****
package pattern.programs;
import java.util.*;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value");
        int value=scanner.nextInt();
        for (int i = 1; i <=value; i++) {
            for (int j = value; j >i; j--) {
                 System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
                
                        System.out.println();
        }
    
    
    
    
    }
    
}
