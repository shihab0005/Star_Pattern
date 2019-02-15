
import java.util.Scanner;

/*
Output -

*
**
***
****
*****
****
***
**
*

/**
 *
 * @author SK
 */
public class StarPattern_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Of Row You Want to Print :");

        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");

            }
            System.out.println("");

        }
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

}
