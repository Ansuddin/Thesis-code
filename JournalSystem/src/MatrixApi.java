package journalsystem;

import org.jpy.PyLib;
import org.jpy.PyModule;
import org.jpy.PyObject;
import org.jpy.PyInputMode;

public class MatrixApi {//implements Matrix {
	public void send(PyObject room, String message) {
		room.callMethod("send_text", message);

	}

	public String retrive() {
		return null;
	}
	public PyObject join(PyObject client, String roomId){ // TODO:Handle if user is banned from room
		PyObject room = client.callMethod("join_room", roomId);
		return room;

	}

	public void register(){

	}

	public void login() {

	}

	public void invite() {

	}

	public void ban() {

	}

	public void unban() {

	}

	public String[] getParticipants() {
		return null;
	}

	public PyObject getMatrixClient(){ // TODO: enable encryption
		PyModule matrix_client = PyModule.importModule("matrix_client.client");
		PyObject client = matrix_client.call("MatrixClient", "https://ansuddin.xyz");
		client.callMethod("login_with_password", "ans","test");
		return client;
	}

}