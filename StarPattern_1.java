
import java.util.Scanner;

/*

OutPut -
*
**
***
****
*****

*/
public class StarPattern_1 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Number Of Row You Want to Print :");
        
        int n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
                
            }
            System.out.println("");
            
        }
    }
    
}
