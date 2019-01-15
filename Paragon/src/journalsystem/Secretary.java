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
  public void setPublicNote(java.lang.String test)
  {
    journal.setPublicNote(test);
  }
}