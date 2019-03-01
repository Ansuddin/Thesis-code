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
    if (!org.jpy.PyLib.isPythonRunning())
    {
      org.jpy.PyLib.startPython();
      try
      {
        if (args[0].equals("hospital1"))
        {
          java.lang.System.out.println("Running as: " + args[0]);
          java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>();
          map.put("2707932131", "!aBCPtniJlmBzUhXFkq:ansuddin.xyz");
          map.put("8912345678", "!gKZKAxpgJBvdqIzmMD:ansuddin.xyz");
          Matrix matrix = new MatrixJPY("https://ansuddin.xyz", "hospital1", "test", "!aBCPtniJlmBzUhXFkq:ansuddin.xyz");
          Hospital hospital = new Hospital(map, matrix);
          java.lang.String[] patients1 = {"2707932131", "8912345678"};
          java.lang.String[] patients2 = {""};
          Employee doctor1 = new Doctor(1, "John", "Doctor", patients1, hospital);
          Employee doctor2 = new Doctor(2, "Michael", "Doctor", patients2, hospital);
          Employee secretary = new Secretary(3, "Donna", "Secretary", hospital);
          hospital.addEmployee(doctor1);
          hospital.addEmployee(doctor2);
          hospital.addEmployee(secretary);
          hospital.selectEmployee();
        }
        else
        if (args[0].equals("hospital2"))
        {
          java.lang.System.out.println("Running as: " + args[0]);
          java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>();
          map.put("2707932131", "!aBCPtniJlmBzUhXFkq:ansuddin.xyz");
          map.put("8912345678", "!gKZKAxpgJBvdqIzmMD:ansuddin.xyz");
          map.put("6789123456", "!JIVwFELdgbMXArYtxG:ansuddin.xyz");
          Matrix matrix = new MatrixJPY("https://ansuddin.xyz", "hospital1", "test", "!aBCPtniJlmBzUhXFkq:ansuddin.xyz");
          Hospital hospital = new Hospital(map, matrix);
          java.lang.String[] patients1 = {"2707932131", "6789123456"};
          Employee doctor1 = new Doctor(1, "Elizabeth", "Doctor", patients1, hospital);
          Employee secretary = new Secretary(3, "Danny", "Secretary", hospital);
          hospital.addEmployee(doctor1);
          hospital.addEmployee(secretary);
          hospital.selectEmployee();
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