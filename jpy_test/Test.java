import org.jpy.PyLib;
import org.jpy.PyModule;
import org.jpy.PyObject;
import org.jpy.PyInputMode;
	
public class Test {

	public static void main(String[] args) {
		System.out.println("Initialize");
		if(!PyLib.isPythonRunning()){
			PyLib.startPython();
			System.out.println("Python started");
			try{
				PyObject.executeCode("print('this is from python')", PyInputMode.SCRIPT);
				PyModule matrix_client = PyModule.importModule("matrix_client.client");
				PyObject MatrixClient = matrix_client.call("MatrixClient", "https://ansuddin.xyz");
				MatrixClient.callMethod("login_with_password", "ans","test");
				PyObject Room = MatrixClient.callMethod("join_room","!fLhiSuTZAupSQpcEXs:ansuddin.xyz");
				Room.callMethod("send_text", "jpy");
			} finally {
				PyLib.stopPython();
			}
		}
		
	}

}
