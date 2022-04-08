package winter.praxis;

public abstract class Behandlung {

  private String kvNummer;

  private String beschreibung;

  private double kostensatz;

  public Behandlung() {
  }

  public Behandlung(String kvNummer, String beschreibung, double kostensatz) {
    this.kvNummer = kvNummer;
    this.beschreibung = beschreibung;
    this.kostensatz = kostensatz;
  }

  public String getKvNummer() {
    return kvNummer;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public double getKostensatz() {
    return kostensatz;
  }

  public abstract double getKosten();
}
