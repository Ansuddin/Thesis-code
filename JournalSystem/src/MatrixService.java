package journalsystem;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MatrixService{
	
	private String[] roomIds;
	private String[] userIds;
	Matrix api;

	public MatrixService(){
		api = new MatrixApi();	
	}

	public void addJournal(String roomId, PatientJournal patientJournal, String[] userIds){
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

	public PatientJournal retrieveJournal(String roomId){
		// Retrieve journal 
		String strJournal = api.retrieve();

		// Deserialize journal
		PatientJournal patientJournal = stringToObject(strJournal);

		return patientJournal;
	}

	public PatientJournal stringToObject(String msg) {
		try {
			PatientJournal patientJournal = mapper.readValue(json, PatientJournal.class);
			return patientJournal;
		} catch (Exception e){
			e.printStackTrace();
		}			
		return null;
	}

	public String objectToString(PatientJournal patientJournal){
		try {
			String json = mapper.writeValueAsString(patientJournal);
			return json;
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}