public class Person{                     // Klasse immer nach Objekt Typ benennen z.B. Person
  private String vorname;
  private String nachname;
  private int alter;
  private String zeile = "\n-----------------------------\n";
  
  public Person(String vorname, String nachname, int alter){
    this.vorname = vorname;
    this.nachname = nachname;
    this.alter = alter;
}
  
  public String getVorname(){           //getVorname
    return this.vorname;
  }
  public String getNachname(){
    return this.nachname;
  }
  public int getAlter(){
    return this.alter;
  }
  
  public void setVorname(String neuerVorname){       //setVorname
    this.vorname = neuerVorname;
  }
  public void setNachname(String neuerNachname){            //neuerVorname      -> CamelCase
    this.nachname = neuerNachname;
  }
  public void setAlter(int neuesAlter){
    this.alter = neuesAlter;
  }              
  public String toString(){
    return zeile + "\nPerson: " + "\nVorname: \t" + vorname + "\nNachname: \t" + nachname + "\nAlter: \t" + alter + "\n" + zeile;
  }                                 
}