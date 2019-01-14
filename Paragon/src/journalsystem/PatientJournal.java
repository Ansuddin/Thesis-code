import java.util.ArrayList;
public class PatientJournal
{
  public static final se.chalmers.paragon.runtime.Policy high = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {Doctor.class}, new se.chalmers.paragon.runtime.Variable(0)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {MatrixApi.class}, new se.chalmers.paragon.runtime.Variable(0)));
  public static final se.chalmers.paragon.runtime.Policy low = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {Secretary.class}, new se.chalmers.paragon.runtime.Variable(0)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {Doctor.class}, new se.chalmers.paragon.runtime.Variable(0)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {MatrixApi.class}, new se.chalmers.paragon.runtime.Variable(0)));
  private int id;
  private java.lang.String ssn;
  private java.lang.String name;
  private java.lang.String address;
  private java.lang.String publicNote;
  private java.lang.String[] sessions;
  public PatientJournal ()
  {
  }
  public PatientJournal (int id, java.lang.String ssn, java.lang.String name, java.lang.String address, java.lang.String publicNote, java.lang.String[] sessions)
  {
    this.id = id;
    this.ssn = ssn;
    this.name = name;
    this.address = address;
    this.publicNote = publicNote;
    this.sessions = sessions;
  }
  public int getId()
  {
    return this.id;
  }
  public void setInt(int id)
  {
    this.id = id;
  }
  public void setPublicNote(java.lang.String note)
  {
    this.publicNote = note;
  }
  public void setSessions(java.lang.String[] sessions)
  {
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