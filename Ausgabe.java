import java.awt.*;
import java.util.*;

public class Ausgabe{  
  public static void main(String[] args){     
    ArrayList<Person> myPerList = new ArrayList<Person>();        //myPerList
    boolean test = true;    
    while(test){                  // while(1) o. while(true)
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Eingabe:\n \t1 = Person erstellen,\n \t2 = Alle Personen Ausgeben,\n \t3 = Eintrag Loeschen,\n \t4 = Alle eintraege loeschen,\n \t5 = Beenden \n");
      int zahl = scan.nextInt();
      scan.nextLine();   
      
      switch(zahl){
        case 1:
          System.out.println("Bitte geben Sie ihren Vornamen ein"); 
          String vorname = scan.nextLine();
          
          System.out.println("Bitte geben Sie ihren Nachnamen ein");
          String nachname = scan.nextLine();
          
          System.out.println("Bitte geben Sie ihr Alter ein");
          int alter = scan.nextInt();        
          scan.nextLine();   // Immer nach nextInt() o. nextDouble() einmal diese Zeile nutzen
          
          Person person = new Person(vorname, nachname, alter);
          myPerList.add(person);
          System.out.println(person); 
          break;          
        case 2:
          if(myPerList.isEmpty()) {
            System.out.println("Error: Keine Person erstellt\n");
          }  else {
            for(Person ausgabe : myPerList){
              System.out.println(ausgabe);
            }
          }
          break;          
        case 3:
          System.out.println("Welchen Eintrag wollen Sie Löschen? Geben Sie die Zahl an(Index geht von 0-(Bsp.)10): ");
          int loeschen = scan.nextInt();
          scan.nextLine();
          System.out.println("Gelöschter Eintrag: " + myPerList.remove(loeschen)); 
          break;
        case 4:
          myPerList.clear();
          break;
        case 5:
          System.exit(0);  // default:
        case 6:
          System.out.println("Welchen Eintrag möchten Sie?");
      } 
    }
  }
}