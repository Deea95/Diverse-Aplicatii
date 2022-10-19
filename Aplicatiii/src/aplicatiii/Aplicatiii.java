
package aplicatiii;
import java.util.Scanner;
public class Aplicatiii {

    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in); // cu acest scanner, utilizatorul poate introduce date;
      int sum = 0; // initializam suma cu 0;
      int read; // cream o noua variabila;

// WRITE YOUR PROGRAM HERE - Aplicatia 25 / moocfi
     
      for(int i = 0 ; i <3; i ++){                         // pentru i de la 0 la 3, fa-mi o adunare
         read = reader.nextInt();                  // initializam variabila printr-un scanner
         sum = sum + read;                             // calculam suma celor 3 numere introduse de la tastatura printr-o variabila
         
      }
// USE ONLY THE VARIABLES sum, reader AND read!

System.out.println("Sum: " + sum);            //afisam suma.
        
    }
    
}
