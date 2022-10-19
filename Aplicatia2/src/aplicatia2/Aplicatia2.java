//aplicatia27
package aplicatia2;


public class Aplicatia2 {

    public static void main(String[] args) throws Exception {
       
    int i = 10;
        for(; i>0;i--) {
        //    i--;  // pt numere impare
            System.out.println(i);
                 
    }
         Class myClass = Class.forName("aplicatia2.Aplicatia2");
         for (Field field: myClass.getFields()) {
             System.out.println(field.getName());
         }
    }
    }

