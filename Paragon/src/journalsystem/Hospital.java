import java.util.HashMap;
import java.util.Set;
import java.lang.System;
import java.util.Scanner;
public class Hospital
{
  private final java.util.HashMap<java.lang.String, java.lang.String> patients = new java.util.HashMap<java.lang.String, java.lang.String>();
  public Hospital ()
  {
  }
  public static PatientJournal getJournal(Employee employee, java.lang.String ssn)
  {
    return null;
  }
  public static void updateJournal(PatientJournal journal)
  {
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
                     employee.receive(getJournal(employee, ssn), scanner);
                   }
                   else
                   {
                     break;
                   }
                 }
  }
}