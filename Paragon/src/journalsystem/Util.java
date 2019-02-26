import java.util.Scanner;
public class Util
{
  public static java.lang.String getUserInput()
  {
    java.lang.System.out.println("Please type now: ");
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String input = scanner.nextLine();
    return input;
  }
  public static void printJournal(PatientJournalD journal, Employee employee)
  {
    java.lang.String ssn = Policy.<java.lang.String>declassifyLow(journal.getSsn());
    java.lang.String name = Policy.<java.lang.String>declassifyLow(journal.getName());
    java.lang.String address = Policy.<java.lang.String>declassifyLow(journal.getAddress());
    java.lang.String publicNote = Policy.<java.lang.String>declassifyLow(journal.getPublicNote());
    java.lang.System.out.println("Patient journal: ");
    java.lang.System.out.println("\t" + "SSN: " + ssn);
    java.lang.System.out.println("\t" + "Name: " + name);
    java.lang.System.out.println("\t" + "Address: " + address);
    java.lang.System.out.println("\t" + "Public note: " + publicNote);
    if (Policy.IsDoctor)
    {
      java.lang.String[] publicSessions = Policy.<java.lang.String[]>declassifyMedium(journal.getPublicSessions());
      java.lang.System.out.println("\t" + "Public sessions:");
      for (int i = 0 ; i < publicSessions.length ; i++)
      {
        java.lang.System.out.println("\t\t" + "Session " + i + ": " + publicSessions[i]);
      }
      Doctor doctor = (Doctor) employee;
      if (se.chalmers.paragon.runtime.LockState.isOpen(new se.chalmers.paragon.runtime.Lock(Policy.IsReferred, new se.chalmers.paragon.runtime.Actor(doctor))))
      {
        {
          java.lang.String[] privateSessions = Policy.<java.lang.String[]>declassifyHigh(journal.getPrivateSessions());
          java.lang.System.out.println("\t" + "Private sessions:");
          for (int i = 0 ; i < privateSessions.length ; i++)
          {
            java.lang.System.out.println("\t\t" + "Session " + i + ": " + privateSessions[i]);
          }
        }
      }
    }
  }
}