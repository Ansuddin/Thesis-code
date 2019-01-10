import journalsystem.MatrixApi;
import org.jpy.PyLib;
public class CPTest
{
  public static void main(java.lang.String[] args)
  {
    java.lang.System.out.println("Initialize");
    if (!org.jpy.PyLib.isPythonRunning())
    {
      org.jpy.PyLib.startPython();
      java.lang.System.out.println("Python started");
      try
      {
        journalsystem.MatrixApi api = new journalsystem.MatrixApi("https://ansuddin.xyz", "ans", "test", "!XtUmMyjaNdBdSbMfxK:ansuddin.xyz");
        api.send("Hello from Paragon");
      }
      finally {
                org.jpy.PyLib.stopPython();
              }
    }
  }
}