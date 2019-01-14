public class Secretary
{
  PatientJournal journal;
  public Secretary ()
  {
  }
  public void receive(PatientJournal journal)
  {
    this.journal = journal;
  }
}