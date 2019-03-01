
import org.jpy.PyObject; 
public interface Matrix {
	public void login(String user, String pass);

	public PyObject join(String roomId);

	public void send(String message, String roomString);

	public String retrieve(String roomString);

	public PatientJournalD JSONToObject(String json);

	public String objectToJSON(PatientJournalD object);

	//Unused
	public void invite(String userId);

}