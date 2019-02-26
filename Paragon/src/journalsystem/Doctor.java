import java.util.Scanner;
public class Doctor implements Employee
{
  int id;
  java.lang.String name;
  java.lang.String[] patients;
  public Doctor (int id, java.lang.String name, java.lang.String[] patients)
  {
    this.id = id;
    this.name = name;
    this.patients = patients;
  }
  public void receive(PatientJournalD journal, java.util.Scanner scanner, Hospital hospital)
  {
    Doctor self = this;
    java.lang.String ssn = journal.getSsn();
    for (int i = 0 ; i < patients.length ; i++)
    {
      if (patients[i] == ssn)
      {
        se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Policy.IsReferred, new se.chalmers.paragon.runtime.Actor(self)));
      }
    }
    java.lang.System.out.println("Select an option: ");
    java.lang.System.out.println("1. Print journal");
    java.lang.System.out.println("2. Edit public note");
    java.lang.System.out.println("3. Add to public session");
    if (se.chalmers.paragon.runtime.LockState.isOpen(new se.chalmers.paragon.runtime.Lock(Policy.IsReferred, new se.chalmers.paragon.runtime.Actor(self))))
    {
      java.lang.System.out.println("4. Add to private session");
    }
    java.lang.System.out.println("0. Back");
    int option = scanner.nextInt();
    int endorsedOption = Policy.<java.lang.Integer>endorse(option).intValue();
    if (endorsedOption == 1)
    {
      Employee thisEmployee = (Employee) this;
      Util.printJournal(journal, thisEmployee);
    }
    else
    if (endorsedOption == 2)
    {
      java.lang.String input = Util.getUserInput();
      java.lang.String endorsed = Policy.<java.lang.String>endorse(input);
      journal.setPublicNote(endorsed);
      hospital.updateJournal(journal);
    }
    else
    if (endorsedOption == 3)
    {
      if (Policy.IsDoctor)
      {
        java.lang.String input = Util.getUserInput();
        java.lang.String endorsed = Policy.<java.lang.String>endorse(input);
        journal.addToPublicSessions(endorsed);
        hospital.updateJournal(journal);
      }
    }
    else
    if (endorsedOption == 4)
    {
      if (se.chalmers.paragon.runtime.LockState.isOpen(new se.chalmers.paragon.runtime.Lock(Policy.IsReferred, new se.chalmers.paragon.runtime.Actor(self))))
      {
        {
          java.lang.String input = Util.getUserInput();
          java.lang.String endorsed = Policy.<java.lang.String>endorse(input);
          journal.addToPrivateSessions(endorsed);
          hospital.updateJournal(journal);
        }
      }
    }
    else
    {
    }
  }
}