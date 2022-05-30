package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author Owner Antun
 */
public class JavaApplication1 {

    /** comment on edit
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your string here: ");
        String s=scan.nextLine();
        
        char[] revString=new char[s.length()];
        
        for(int i=0; i<s.length(); i++)
        {
            revString[i]=s.charAt(i);
        }
        
        for(int i=revString.length-1; i>=0;i--)
        {
            System.out.print(revString[i]);
        }
        
        }
    }
    

