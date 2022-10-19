
package app35;
import java.util.Scanner;
public class App35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
         int b = input.nextInt();
 //       System.out.println(Math.pow(a, b));    SAU
       int putere = 1;
        for(int i = 0; i <b;i++) {
            putere*=a;
        }
          System.out.println(putere);
    }
    
}
