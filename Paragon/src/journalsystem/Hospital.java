import java.util.HashMap;
import java.util.Set;
import java.lang.System;
import java.util.Scanner;
public class Hospital
{
  private final MatrixApi<PatientJournalD> api;
  private final java.util.HashMap<java.lang.String, java.lang.String> patients;
  public Hospital (MatrixApi<PatientJournalD> api, java.util.HashMap<java.lang.String, java.lang.String> patients)
  {
    this.api = api;
    this.patients = patients;
  }
  public PatientJournalD getJournal(java.lang.String ssn)
  {
    java.lang.String room = patients.get(ssn);
    java.lang.String JSON = api.retrieve(room);
    PatientJournalD journal = api.JSONToObject(JSON);
    return journal;
  }
  public void updateJournal(PatientJournalD journal)
  {
    java.lang.String json = api.objectToJSON(journal);
    api.send(json);
  }
  public void selectPatient(Employee employee) throws java.lang.NullPointerException
  {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String[] patientArray = patients.keySet().toArray(new java.lang.String[patients.size()]);
    while (true) {
                   java.lang.System.out.println("Select a patient:");
                   for (int i = 0 ; i < patients.size() ; i++)
                   {
                     java.lang.System.out.println(i + 1 + ". " + patientArray[i]);
                   }
                   java.lang.System.out.println(patientArray.length + ". Exit");
                   int option = scanner.nextInt();
                   if (option < patientArray.length)
                   {
                     java.lang.String ssn = patientArray[option];
                     employee.receive(getJournal(ssn), scanner, this);
                   }
                   else
                   {
                     break;
                   }
                 }
  }
}