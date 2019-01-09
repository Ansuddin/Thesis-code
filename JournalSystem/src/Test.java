package journalsystem;

import org.jpy.PyLib;
import org.jpy.PyModule;
import org.jpy.PyObject;
import org.jpy.PyInputMode;
import java.util.Map;
import java.util.HashMap;
	
public class Test {

	public static void main(String[] args) {
		System.out.println("Initialize");
		if(!PyLib.isPythonRunning()){
			PyLib.startPython();
			System.out.println("Python started");
			try{
				
				MatrixApi api = new MatrixApi("https://ansuddin.xyz","ans","test");
				PyObject room = api.join("!fLhiSuTZAupSQpcEXs:ansuddin.xyz");
				String test = api.retrieve(room);
				System.out.println(test);
				//api.send(room,"hej");
				
			} finally {
				PyLib.stopPython();
			}
		}
		
	}

}
