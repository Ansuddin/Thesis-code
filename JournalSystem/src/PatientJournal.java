public class PatientJournal{
	private int id; //low
	private String SSN; // high
	private String name; // low
	private String address; // low
	private ArrayList<String> publicNote; // low
	private ArrayList<PatientSession> sessions; // read low, write high


	public void addNote(String note){
		publicNote.add(note);
	}
	public void addSession(Session session){
		sessions.add(session);
	}
}
