package winter.praxis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Praxis {

  private List<Patient> patienten = new ArrayList<>();

  private List<Behandlung> behandlungen = new ArrayList<>();

  public List<Patient> getPatient(String name) {
    return patienten
        .stream()
        .filter(patient -> patient.getName()
            .equals(name))
        .collect(Collectors.toList());
  }

  public List<Behandlung> getBehandlung(String kvNummer) {
    return behandlungen
        .stream()
        .filter(behandlung -> behandlung.getKvNummer()
            .equals(kvNummer))
        .collect(Collectors.toList());
  }

  public int anzBehandlungen(String kvNummer) {
    return getBehandlung(kvNummer).size();
  }

  public String zeigePatienten(int anzBehandlungen) {
   return patienten
       .stream()
       .filter(patient -> getBehandlung(patient.getKvNummer()).size() >= anzBehandlungen)
       .map(Patient::getName)
       .collect(Collectors.joining("; "));
  }

  public void addBehandlung(Behandlung behandlung) {
    behandlungen.add(behandlung);
  }

  public double ermittleKosten() {
    double summe = 0D;
    for (Behandlung behandlung : behandlungen) {
      summe += behandlung.getKosten();
    }
    return summe;
  }
}
