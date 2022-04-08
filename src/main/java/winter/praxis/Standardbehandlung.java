package winter.praxis;

public class Standardbehandlung extends Behandlung {

  public Standardbehandlung() {
    super();
  }

  public Standardbehandlung(String kvNummer, String beschreibung, double kostensatz) {
    super(kvNummer, beschreibung, kostensatz);
  }

  @Override
  public double getKosten() {
    return getKostensatz();
  }
}
