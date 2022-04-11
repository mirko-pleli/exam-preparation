package summer.socialnetwork;

public class Spielwiese {

  public static void main(String[] args) {
    SozialesNetzwerk sozialesNetzwerk = new SozialesNetzwerk();

    Person person = new Person("Marabu", "Pleli");
    Person person1 = new Person("JJ", "Degener");

    sozialesNetzwerk.hinzufuegenMitglied(person);
    sozialesNetzwerk.hinzufuegenMitglied(person1);

    Textnachricht textnachricht = new Textnachricht("Hallo Degi", person);
    sozialesNetzwerk.hinzufuegenNachricht(textnachricht);
    textnachricht.hinzufuegenLike();

    Textnachricht textnachricht1 = new Textnachricht("Hallo Marabu", person1);
    sozialesNetzwerk.hinzufuegenNachricht(textnachricht1);
    textnachricht1.hinzufuegenLike();

    System.out.println(sozialesNetzwerk.getAlleNachrichten());
  }
}
