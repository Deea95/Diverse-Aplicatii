package aplicatia26moocfi;
import java.util.Scanner;
public class Aplicatia26Moocfi {
    
    public static void main(String[] args) {
   Scanner reader = new Scanner(System.in);
    int sum = 0;
while (true) {                                                                  // el lucreaza la nesfarsit
    int read = Integer.parseInt(reader.nextLine());  // converteste din String(reader.nextLine() ) in Int
    if (read == 0) {
        break;                                                                   //opreste blocul(if)
    }
    sum = sum + read;
    // DO SOMETHING HERE

    System.out.println("Sum now: " + sum);
}

System.out.println("Sum in the end: " + sum);
        
    }
    
}
