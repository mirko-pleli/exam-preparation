package winter.praxis;

public class Spielwiese {

  public static void main(String[] args) {
    Praxis praxis = new Praxis();
    Behandlung chirogymnastik = new Physiobehandlung("A12345", "Chirogymnastik", 12.87);
    Behandlung waermeanwendung = new Physiobehandlung("A12346", "Wärmeanwendung", 4.23);
    Behandlung arthrose = new Standardbehandlung("A12347", "Arthrose", 45.12);
    Behandlung ultraschall = new Standardbehandlung("A12348", "Ultraschall", 26.80);

    praxis.addBehandlung(chirogymnastik);
    praxis.addBehandlung(waermeanwendung);
    praxis.addBehandlung(arthrose);
    praxis.addBehandlung(ultraschall);

    System.out.println("Gesamtkosten aller Behandlungen: " + praxis.ermittleKosten() + " EUR");
  }
}
