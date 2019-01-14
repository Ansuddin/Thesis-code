import java.lang.System;
import java.util.Scanner;
import java.util.ArrayList;
import org.jpy.PyLib;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import journalsystem.*;
import journalsystem.MatrixApi;
public class Test
{
  public static void main(java.lang.String[] args)
  {
    if (!org.jpy.PyLib.isPythonRunning())
    {
      org.jpy.PyLib.startPython();
      java.lang.System.out.println("Python started");
      try
      {
        java.lang.String[] sessions = {"startet behandling"};
        PatientJournal journal = new PatientJournal(1, "270793-2131", "Ans", "Knapmagerstien", "H\248feber", sessions);
        int id = journal.getId();
      }
      finally {
                org.jpy.PyLib.stopPython();
              }
    }
  }
}