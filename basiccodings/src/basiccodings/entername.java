/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basiccodings;

/**
 *
 * @author d
 */
import java.util.Scanner;
public class entername {
    public void UserValue(){
    String g;
    System.out.println("Hello Dear Enter Your Name");
    Scanner a=new Scanner(System.in);
    String b=a.nextLine();
    g=b;
    
    System.out.println("ThankYou  "+g);
    
    }
    public static void main(String[]arg){
    entername name=new entername();
    name.UserValue();
    }
    
}
