
package alfabet;

import java.util.*;
public class Alfabet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nr = Integer.parseInt(input.nextLine());
        for (int i = 0; i<=10; i++) {
            System.out.print(nr + " * " + i + " = ");
            System.out.printf(Locale.US, "%,d %n", (nr*i));
        }
        
    }
    
}
