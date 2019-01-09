package journalsystem;

import org.jpy.PyLib;
import org.jpy.PyModule;
import org.jpy.PyObject;
import org.jpy.PyInputMode;
import java.util.Map;
import java.util.HashMap;

public class MatrixApi { //implements Matrix {

	PyObject client;

	public MatrixApi(String homeserver, String user, String pass) {
		// TODO: Enable encryption
		PyModule matrix_client = PyModule.importModule("matrix_client.client");
		this.client = matrix_client.call("MatrixClient", homeserver);
		login(user,pass);
	}

	public void login(String user, String pass) {
		this.client.callMethod("login_with_password", user, pass);
	}

	public void send(PyObject room, String message) {
		room.callMethod("send_text", message);

	}

	public String retrieve(PyObject room) {
		room.callMethod("backfill_previous_messages", "True", "1");
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

	public PyObject join(String roomId){ // TODO:Handle if user is banned from room
		PyObject room = client.callMethod("join_room", roomId);
		return room;
	}

	public void invite() {

	}

	public void ban() {

	}

	public void unban() {

	}

}