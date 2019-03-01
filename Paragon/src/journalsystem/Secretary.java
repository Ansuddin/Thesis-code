import java.util.Scanner;
public class Secretary implements Employee
{
  public int id;
  public java.lang.String name;
  public java.lang.String title;
  public Hospital hospital;
  public Secretary (int id, java.lang.String name, java.lang.String title, Hospital hospital)
  {
    this.id = id;
    this.name = name;
    this.title = title;
    this.hospital = hospital;
  }
  public void receive(PatientJournalD journal, java.util.Scanner scanner)
  {
    Employee upcastedSelf = (Employee) this;
    java.lang.System.out.println("Level 3");
    java.lang.System.out.println("Select an option: ");
    java.lang.System.out.println("1. Print journal");
    java.lang.System.out.println("2. Edit public note");
    java.lang.System.out.println("0. Back");
    int option = scanner.nextInt();
    int endorsedOption = Policy.<java.lang.Integer>endorse(option).intValue();
    if (endorsedOption == 1)
    {
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
    {
    }
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