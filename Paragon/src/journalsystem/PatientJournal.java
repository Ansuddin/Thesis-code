import java.util.ArrayList;
public class PatientJournal
{
  private int id;
  private java.lang.String ssn;
  private java.lang.String name;
  private java.lang.String address;
  private java.lang.String publicNote;
  private java.lang.String[] sessions;
  private boolean allowStatistics;
  public PatientJournal ()
  {
  }
  public PatientJournal (int id, java.lang.String ssn, java.lang.String name, java.lang.String address, java.lang.String publicNote, java.lang.String[] sessions, boolean allowStatistics)
  {
    this.id = id;
    this.ssn = ssn;
    this.name = name;
    this.address = address;
    this.publicNote = publicNote;
    this.sessions = sessions;
    this.allowStatistics = allowStatistics;
  }
  public int getId()
  {
    return this.id;
  }
  public void setInt(int id)
  {
    this.id = id;
  }
  public java.lang.String getSsn()
  {
    return this.ssn;
  }
  public void setSsn(java.lang.String ssn)
  {
    this.ssn = ssn;
  }
  public java.lang.String getName()
  {
    return this.name;
  }
  public void setName(java.lang.String name)
  {
    this.name = name;
  }
  public java.lang.String getAddress()
  {
    return this.address;
  }
  public void setAddress(java.lang.String address)
  {
    this.address = address;
  }
  public java.lang.String getPublicNote()
  {
    return this.publicNote;
  }
  public void setPublicNote(java.lang.String note)
  {
    this.publicNote = note;
  }
  public void setSessions(java.lang.String[] sessions)
  {
    this.sessions = sessions;
  }
  public void addToSessions(java.lang.String session)
  {
    java.lang.String[] newSessions = new java.lang.String[this.sessions.length + 1];
    for (int i = 0 ; i < this.sessions.length ; i++)
    {
      newSessions[i] = this.sessions[i];
    }
    newSessions[sessions.length] = session;
    this.sessions = newSessions;
  }
}