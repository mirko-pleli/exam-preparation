package summer.socialnetwork;

public abstract class Nachricht extends Person {

  protected int likes = 0;

  protected Person absender;

  public Nachricht() {
  }

  public Nachricht(Person absender) {
    this.absender = absender;
  }

  public void hinzufuegenLike() {
    likes += 1;
  }

  public abstract String getNachricht();

}
