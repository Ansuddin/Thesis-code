import java.util.Scanner;
public class Secretary implements Employee
{
  private int id;
  private java.lang.String name;
  public Secretary (int id, java.lang.String name)
  {
    this.id = id;
    this.name = name;
  }
  public void receive(PatientJournalD journal, java.util.Scanner scanner, Hospital hospital)
  {
    java.lang.System.out.println("Select an option: ");
    java.lang.System.out.println("1. Print journal");
    java.lang.System.out.println("2. Edit public note");
    java.lang.System.out.println("0. Back");
    int option = scanner.nextInt();
    int endorsedOption = Policy.<java.lang.Integer>endorse(option).intValue();
    if (endorsedOption == 1)
    {
      Employee self = (Employee) this;
      Util.printJournal(journal, self);
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
    {
    }
  }
}