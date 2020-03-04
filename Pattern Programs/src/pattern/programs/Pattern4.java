//draw the following pattern
//*****
// ****
//  ***
//   **
//    *

package pattern.programs;
import java.util.*;
public class Pattern4 {

    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
        System.out.println("Enter the value");
        int value=s.nextInt();
        for (int i = 1; i <= value; i++) {
            for (int j = value; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = value; k >= i; k--) {
                System.out.print(" *");   
            }
            System.out.println();
        }
        
        s.close();
        
        
    }
}
