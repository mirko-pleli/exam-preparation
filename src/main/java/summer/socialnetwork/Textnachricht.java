package summer.socialnetwork;

public class Textnachricht extends Nachricht {

  private String nachricht;

  public Textnachricht() {
  }

  public Textnachricht(String nachricht, Person absender) {
    super(absender);
    this.nachricht = nachricht;
  }

  @Override
  public String getNachricht() {
    return " Nachricht: " + nachricht +  ", Absender: " + absender.getNachname() + ", " + absender.getVorname() + " Likes: " + likes;
  }
}
