
import java.util.Scanner;

/*
 Output -
****
***
**
*

 */

/**
  @author SK
 */
public class StarPattern_2 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        
        System.out.println("Enter Number Of Row To Print :");
        int a=input.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
         
    
}
