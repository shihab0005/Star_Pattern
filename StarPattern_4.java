
import java.util.Scanner;

/*
Output-
      #
     ##
    ###
   ####
  #####
 ######
#######

 */

/**
 *
 * @author SK
 */
public class StarPattern_4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number Of Row You Want to Print : ");
        int a=input.nextInt();
        for (int i = 1; i <= a; i++) {
            
            for (int j = a-1; j>= i; j--) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
                
            }
            System.out.println();
            
        }
    }
    
}
