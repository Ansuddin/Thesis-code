package journalsystem;

public class PatientSession {
	private int id; // Low
	private String date; // Low
	private String purpose; // Low
	private String note; // High

	public PatientSession() {}

	public PatientSession(int id, String date, String purpose, String note) {
		this.id = id;
		this.date = date;
		this.purpose = purpose;
		this.note = note;

	}

	public int getId(){
		return this.id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getDate(){
		return this.date;
	}
	
	public void setDate(String date){
		this.date = date;
	}

	public String getPurpose(){
		return this.purpose;
	}

	public void setPurpose(String purpose){
		this.purpose = purpose;
	}


	public String getNote(){
		return this.note;
	}

	public void setNote(String note){
		this.note = note;
	}
}