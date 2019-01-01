import org.jpy.*;
	
public class Test {

	public static void main(String[] args) {
		System.out.println("Initialize");
		if(!PyLib.isPythonRunning()){
			PyLib.startPython();
			System.out.println("Python started");		
			PyModule sys = PyModule.importModule("matrix_client.api");
			/*PyLib.execScript("paramInt = 123");
			PyModule mainModule = PyModule.getMain();
	       		PyObject paramIntObj = mainModule.getAttribute("paramInt");
	       		int paramIntValue = paramIntObj.getIntValue();
			System.out.println(paramIntValue);*/
		}
		
	}

}
