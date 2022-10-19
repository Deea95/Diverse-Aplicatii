
package agenda;
import java.util.*;
public class Agenda {
    String numeContact = "Niciun contact";
    String numarTelefon = "Niciun numar";
    public static void main(String ... args) {
    Agenda test = new Agenda();
    Scanner input = new Scanner(System.in);
    Agenda [] lista = new Agenda[10];
    for (int i = 0; i < 10 ; i++) {
        lista[i]= new Agenda();
    }
        lista[0].adaugaContactGeneral("Catalin", "0771243890"); //adaugare numere
        lista[1].adaugaContactGeneral("Aurelia", "0769729971");
        lista[2].adaugaContactGeneral("Florian", "0761524373");
        lista[3].adaugaContactGeneral("Andreea", "0769164388");
        lista[4].adaugaContactGeneral("Adriana", "0724290536");
        lista[5].adaugaContactGeneral("Nelu", "0722661969");
      
        meniu(lista); //afisare adresa
        adaugareContact(lista);
    }
   

static void meniu(Agenda[] x) {
    System.out.println("CONTACTE");
         for (int i = 0; i<x.length; i++) {
        System.out.println(x[i].numeContact);
        System.out.println(x[i].numarTelefon);
        System.out.println("===================");
    }
}
void adaugaContactGeneral(String nume, String nr) {
    this.numeContact = nume;
    this.numarTelefon = nr;
}

static void adaugareContact(Agenda[] lista) {
    int x = 1;
    int i = 0;
    Scanner in = new Scanner(System.in);
    String numeComparat = in.nextLine();
    
}

void editareContact() {
    
}
void stergereContact() {
    
}
 
}


