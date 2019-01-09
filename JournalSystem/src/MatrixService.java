public class MatrixService{
	
	Matrix api;

	public MatrixService(){
		api = new MatrixApi();	
	}

	public void addJournal(PatientJournal patientJournal, String[] userIds){
		// Serialize journal
		String journal = objectToString(patientJournal)

		// Ban all users
		for ( String userId : userIds ) {
			api.ban(userId);
		}

		// Send journal
		api.send(journal);

		// Unban and invite all users
		for (String userId : userIds) {
			api.unban(userId);
			api.invite(userId);
		}
	}

	public PatientJournal retrieveJournal(){
		// Retrieve journal 
		String strJournal = api.retrieve();

		// Deserialize journal
		PatientJournal patientJournal = stringToObject(strJournal);

		return patientJournal;
	}

	public PatientJournal stringToObject(String msg) {
		//String to JSON
		//JSON to object
		return null;
	}

	public String objectToString(PatientJournal patientJournal){
		// Object to JSON
		// JSON to String
		return null;
	}
}