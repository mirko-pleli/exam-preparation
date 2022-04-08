package winter.praxis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Praxis {

  private List<Patient> patienten = new ArrayList<Patient>();

  private List<Behandlung> behandlungen = new ArrayList<Behandlung>();

  public List<Patient> getPatient(String name) {
    return patienten
        .stream()
        .filter(patient -> patient.getName().equals(name))
        .collect(Collectors.toList());
  }

  public List<Behandlung> getBehandlung(String kvNummer) {
    return behandlungen
        .stream()
        .filter(behandlung -> behandlung.getKvNummer().equals(kvNummer))
        .collect(Collectors.toList());
  }

  public int anzBehandlungen(String kvNummer) {
    return getBehandlung(kvNummer).size();
  }

  public String zeigePatienten(int anzBehandlungen) {
    StringBuilder liste = new StringBuilder();
    for(Patient patient : patienten) {
      if(getBehandlungen(patient) >= anzBehandlungen) {
        liste.append(patient.getName()).append("; ");
      }
    }
    return liste.toString();
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

  private int getBehandlungen(Patient patient) {
    return anzBehandlungen(patient.getKvNummer());
  }
}
