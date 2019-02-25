public class PatientJournal
{
  private java.lang.String ssn;
  private java.lang.String name;
  private java.lang.String address;
  private java.lang.String publicNote;
  private java.lang.String[] publicSessions;
  private java.lang.String[] privateSessions;
  public PatientJournal ()
  {
  }
  public PatientJournal (java.lang.String ssn, java.lang.String name, java.lang.String address, java.lang.String publicNote, java.lang.String[] publicSessions, java.lang.String[] privateSessions)
  {
    this.ssn = ssn;
    this.name = name;
    this.address = address;
    this.publicNote = publicNote;
    this.publicSessions = publicSessions;
    this.privateSessions = privateSessions;
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
  public java.lang.String[] getPublicSessions()
  {
    return publicSessions;
  }
  public void setPublicSessions(java.lang.String[] publicSessions)
  {
    this.publicSessions = publicSessions;
  }
  public java.lang.String[] getPrivateSessions()
  {
    return privateSessions;
  }
  public void setPrivateSessions(java.lang.String[] privateSessions)
  {
    this.privateSessions = privateSessions;
  }
  public void addToPublicSessions(java.lang.String session)
  {
    java.lang.String[] newSessions = new java.lang.String[this.publicSessions.length + 1];
    for (int i = 0 ; i < this.publicSessions.length ; i++)
    {
      newSessions[i] = this.publicSessions[i];
    }
    newSessions[publicSessions.length] = session;
    this.publicSessions = newSessions;
  }
  public void addToPrivateSessions(java.lang.String session)
  {
    java.lang.String[] newSessions = new java.lang.String[this.privateSessions.length + 1];
    for (int i = 0 ; i < this.privateSessions.length ; i++)
    {
      newSessions[i] = this.privateSessions[i];
    }
    newSessions[privateSessions.length] = session;
    this.privateSessions = newSessions;
  }
}