package winter.praxis;

public class Patient {

  private String kvNummer;

  private String name;

  private String vorname;

  public Patient() {
  }

  public Patient(String kvNummer, String name, String vorname) {
    this.kvNummer = kvNummer;
    this.name = name;
    this.vorname = vorname;
  }

  public String getKvNummer() {
    return kvNummer;
  }

  public String getName() {
    return name;
  }

  public String getVorname() {
    return vorname;
  }
}
