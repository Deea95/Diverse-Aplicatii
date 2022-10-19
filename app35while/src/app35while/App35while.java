
package app35while;

public class App35while {

    public static void main(String[] args) {
        String stea = "";
        String steaMinus = "";
       for(int i = 0; i<10;i++) {
            stea += "*";
            System.out.println(stea);
    } 
        System.out.println("");
        int i = 10;
        while(i>0) {
         steaMinus = stea.substring(0, i);
         i--;
            System.out.println(steaMinus);
        }
    }
    
}
