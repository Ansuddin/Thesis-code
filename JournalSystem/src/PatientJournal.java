package journalsystem;

import java.util.ArrayList;

public class PatientJournal{
	private int id; //low
	private String SSN; // high
	private String name; // low
	private String address; // low
	private ArrayList<String> publicNote; // low
	private ArrayList<PatientSession> sessions; // read low, write high

	public PatientJournal(){}

	public PatientJournal(int id, String SSN, String name, String address 
		, ArrayList<String> note, ArrayList<PatientSession> sessions){
		this.id = id;
		this.SSN = SSN;
		this.name = name;
		this.address = address;
		this.publicNote = note;
		this.sessions = sessions;
	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getSSN(){
		return this.SSN;
	}
	
	public void setSSN(String SSN){
		this.SSN = SSN;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}


	public String getAddress(){
		return this.address;
	}

	public void setAddress(String address){
		this.address = address;
	}	

	public ArrayList<String> getPublicNotes(){
		return this.publicNote;
	}

	public void setPublicNotes(ArrayList<String> publicNote){
		this.publicNote = publicNote;
	}	

	public ArrayList<PatientSession> getSessions(){
		return this.sessions;
	}

	public void setSessions(ArrayList<PatientSession> sessions){
		this.sessions = sessions;
	}

	public void addNote(String note){
		publicNote.add(note);
	}
	public void addSession(PatientSession session){
		sessions.add(session);
	}
}
