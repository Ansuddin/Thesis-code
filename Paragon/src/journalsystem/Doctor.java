public class Doctor
{
  PatientJournal journal;
  public Doctor ()
  {
  }
  public void receive(PatientJournal journal)
  {
    this.journal = journal;
  }
}