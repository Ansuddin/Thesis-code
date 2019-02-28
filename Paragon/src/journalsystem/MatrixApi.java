
import org.jpy.PyLib;
import org.jpy.PyModule;
import org.jpy.PyObject;
import org.jpy.PyInputMode;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MatrixApi { //implements Matrix {

	PyObject client;
	PyObject room;

	public MatrixApi(String homeserver, String user, String pass, String roomId) {
		// TODO: Enable encryption
		
				PyModule matrix_client = PyModule.importModule("matrix_client.client");
				this.client = matrix_client.call("MatrixClient", homeserver);
				login(user,pass);
				this.room = join(roomId);
			
		

	}

	private void login(String user, String pass) {

		this.client.callMethod("login_with_password", user, pass);
	}

	private PyObject join(String roomId){ // TODO:Handle if user is banned from room
		PyObject room = this.client.callMethod("join_room", roomId);
		return room;
	}

	public void send(String message, String roomString) {
		this.room = join(roomString);
		this.room.callMethod("send_text", message);

	}

	public String retrieve(String roomString) {
		this.room = join(roomString);
		this.room.callMethod("backfill_previous_messages", "True", "1");
		PyObject events = room.callMethod("get_events");
		HashMap<String,Object> global = new HashMap<>();
		HashMap<String,Object> local = new HashMap<>();
		global.put("events", events);
		PyObject pyVoid = PyObject.executeCode(
			"for event in events: \n\t" + 
			"if event['type'] == \"m.room.message\": \n\t\t" +
			"if event['content']['msgtype'] == \"m.text\": \n\t\t\t" +
			"msg=event['content']['body']",
			PyInputMode.SCRIPT, global, local);
		String message = (String) local.get("msg");
		return message;
	}

	public PatientJournalD JSONToObject(String json) {
		PatientJournalD object = new PatientJournalD();
		try {
			ObjectMapper mapper = new ObjectMapper();
			object = mapper.readValue(json, PatientJournalD.class);
		} catch (Exception e){
			e.printStackTrace();
		}		
		return object;	
	}

	public String objectToJSON(PatientJournalD object){
		String json = "";
		try {
			ObjectMapper mapper = new ObjectMapper();
			 json = mapper.writeValueAsString(object);
			return json;
		} catch (Exception e){
			e.printStackTrace();
		}
		return json;
	}

	//Unused
	public void invite(String userId) {
		this.room.callMethod("invite_user", userId);
	}

	//Unused
	public void ban(String userId) {
		this.room.callMethod("ban_user", userId, "adding data");
	}

	//Unused
	public void unban(String userId) {
		this.room.callMethod("unban_user", userId);
	}



}