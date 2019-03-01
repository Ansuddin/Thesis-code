import java.util.Scanner;
public class Doctor implements Employee
{
  public int id;
  public java.lang.String name;
  public java.lang.String title;
  public java.lang.String[] patients;
  public Hospital hospital;
  public Doctor (int id, java.lang.String name, java.lang.String title, java.lang.String[] patients, Hospital hospital)
  {
    this.id = id;
    this.name = name;
    this.title = title;
    this.patients = patients;
    this.hospital = hospital;
  }
  public void receive(PatientJournalD journal, java.util.Scanner scanner)
  {
    openLockIsDoctor((Employee) this);
    Doctor self = this;
    java.lang.String ssn = journal.getSsn();
    for (int i = 0 ; i < patients.length ; i++)
    {
      if (patients[i].equals(ssn))
      {
        se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Policy.IsReferred, new se.chalmers.paragon.runtime.Actor(self)));
      }
    }
    java.lang.System.out.println("Level 3");
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
      Employee upcastedSelf = (Employee) this;
      Util.printJournal(journal, upcastedSelf);
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
      Employee upcastedSelf = (Employee) this;
      if (se.chalmers.paragon.runtime.LockState.isOpen(new se.chalmers.paragon.runtime.Lock(Policy.IsDoctor, new se.chalmers.paragon.runtime.Actor(upcastedSelf))))
      {
        {
          java.lang.String input = Util.getUserInput();
          java.lang.String endorsed = Policy.<java.lang.String>endorse(input);
          journal.addToPublicSessions(endorsed);
          hospital.updateJournal(journal);
        }
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
  private void openLockIsDoctor(Employee employee)
  {
    se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Policy.IsDoctor, new se.chalmers.paragon.runtime.Actor(employee)));
  }
  public java.lang.String getName()
  {
    return this.name;
  }
  public java.lang.String getTitle()
  {
    return this.title;
  }
}