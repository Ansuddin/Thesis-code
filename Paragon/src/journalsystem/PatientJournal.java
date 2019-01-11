package journalsystem;
public class PatientJournal
{
  public int id;
  public java.lang.String ssn;
  public java.lang.String name;
  public java.lang.String address;
  public PatientJournal ()
  {
  }
  public PatientJournal (int id, java.lang.String ssn, java.lang.String name, java.lang.String address)
  {
    this.id = id;
    this.ssn = ssn;
    this.name = name;
    this.address = address;
  }
}