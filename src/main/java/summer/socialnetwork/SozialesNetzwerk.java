package summer.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SozialesNetzwerk {

  List<Person> mitgliederliste = new ArrayList<>();

  List<Nachricht> nachrichtenliste = new ArrayList<>();

  public void hinzufuegenMitglied(Person person) {
    mitgliederliste.add(person);
  }

  public void hinzufuegenNachricht(Nachricht nachricht) {
    nachrichtenliste.add(nachricht);
  }

  public String getAlleNachrichten() {
    StringBuilder text = new StringBuilder();
    for (Nachricht nachricht : nachrichtenliste) {
      text.append(nachricht.getNachricht());
    }
    return text.toString();
  }
}
