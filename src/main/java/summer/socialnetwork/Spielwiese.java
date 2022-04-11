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
    System.out.println(getPassword("Ich generiere mir ein neues Passwort"));
  }

  public static String getPassword(String satz) {
    String[] sentence = satz.split(" ");
    StringBuilder passwort = new StringBuilder();
    char zeichen = ' ';
    boolean isUpperCase = true;

    for (String s : sentence) {
      zeichen = s.charAt(0);
      if (Character.isLetter(zeichen)) {
        if (isUpperCase) {
          zeichen = Character.toUpperCase(zeichen);
          isUpperCase = false;
        } else {
          zeichen = Character.toLowerCase(zeichen);
          isUpperCase = true;
        }
      }
      passwort.append(zeichen);
    }
    return passwort.toString();
  }
}
