package journalsystem;

/*import org.jpy.PyLib;
import org.jpy.PyModule;
import org.jpy.PyObject;
import org.jpy.PyInputMode;*/
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
	
public class Test {

	public static void main(String[] args) {

		
		ArrayList<String> notes = new ArrayList<>();
		notes.add("test");
		notes.add("test2");
		ArrayList<PatientSession> sessions = new ArrayList<>();
		PatientJournal pj = new PatientJournal(1,"2707932131", "Ans Uddin", "Knapmagerstien 49", notes ,sessions);
		ObjectMapper mapper = new ObjectMapper();

		try {
			String json = mapper.writeValueAsString(pj);
			System.out.println("JSON = " + json);

			PatientJournal journal = mapper.readValue(json, PatientJournal.class);
			System.out.println(journal.getName());
		} catch (Exception e){
			e.printStackTrace();
		}
		

		/*
		System.out.println("Initialize");
		if(!PyLib.isPythonRunning()){
			PyLib.startPython();
			System.out.println("Python started");
			try{
				
				//MatrixApi api = new MatrixApi("https://ansuddin.xyz","ans","test");
				
				//PyObject room = api.join("!fLhiSuTZAupSQpcEXs:ansuddin.xyz");
				//String test = api.retrieve(room);
				//System.out.println(test);
				//api.send(room,"hej");
				
			} finally {
				PyLib.stopPython();
			}
		}*/
		
	}

}
