import java.lang.System;
import java.util.Scanner;
import java.util.HashMap;
import org.jpy.PyLib;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main
{
  public static void main(java.lang.String[] args)
  {
    java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>();
    map.put("2707932131", "!aBCPtniJlmBzUhXFkq:ansuddin.xyz");
    map.put("8912345678", "!gKZKAxpgJBvdqIzmMD:ansuddin.xyz");
    java.lang.String[] patients1 = {"2707932131", "8912345678"};
    Employee doctor1 = new Doctor(1, "John", patients1);
    java.lang.String[] patients2 = {"2707932131"};
    Employee doctor2 = new Doctor(2, "Michael", patients2);
    Employee secretary = new Secretary(3, "Donna");
    if (!org.jpy.PyLib.isPythonRunning())
    {
      org.jpy.PyLib.startPython();
      java.lang.System.out.println("Python started");
      try
      {
        MatrixApi matrix = new MatrixApi("https://ansuddin.xyz", "hospital1", "test", "!aBCPtniJlmBzUhXFkq:ansuddin.xyz");
        Hospital hospital = new Hospital(map, matrix);
        if (args[0].equals("doctor1"))
        {
          java.lang.System.out.println("Running as: " + args[0]);
          Employee employee = doctor1;
          se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Policy.IsDoctor, new se.chalmers.paragon.runtime.Actor(employee)));
          hospital.selectPatient(employee);
        }
        else
        if (args[0].equals("doctor2"))
        {
          java.lang.System.out.println("Running as: " + args[0]);
          Employee employee = doctor2;
          se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Policy.IsDoctor, new se.chalmers.paragon.runtime.Actor(employee)));
          hospital.selectPatient(employee);
        }
        else
        if (args[0].equals("secretary"))
        {
          java.lang.System.out.println("Running as: " + args[0]);
          Employee employee = secretary;
          hospital.selectPatient(employee);
        }
        else
        {
          java.lang.System.out.println("Wrong args:" + args[0] + ":");
          return;
        }
      }
      finally {
                org.jpy.PyLib.stopPython();
              }
    }
  }
}