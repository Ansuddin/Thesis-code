package journalsystem;
import java.util.ArrayList;
public class PatientJournal
{
  public int id;
  public java.lang.String ssn;
  public java.lang.String name;
  public java.lang.String address;
  public java.lang.String publicNotes;
  public java.lang.String[] sessions;
  public PatientJournal ()
  {
  }
  public PatientJournal (int id, java.lang.String ssn, java.lang.String name, java.lang.String address, java.lang.String publicNotes, java.lang.String[] sessions)
  {
    this.id = id;
    this.ssn = ssn;
    this.name = name;
    this.address = address;
    this.publicNotes = publicNotes;
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