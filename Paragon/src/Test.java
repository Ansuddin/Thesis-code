import journalsystem.MatrixApi;
import org.jpy.PyLib;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import journalsystem.*;
import java.util.Scanner;
import java.lang.System;
public class Test
{
  public static void main(java.lang.String[] args)
  {
    if (!org.jpy.PyLib.isPythonRunning())
    {
      org.jpy.PyLib.startPython();
      java.lang.System.out.println("Python started");
      if (args.length > 0)
      {
        try
        {
          Employee employee;
          if (args[0].equals("doctor"))
          {
            java.lang.System.out.println(args[0]);
            employee = new Doctor(1, args[0]);
          }
          else
          if (args[0].equals("secretary"))
          {
            java.lang.System.out.println(args[0]);
            employee = new Secretary(2, args[0]);
          }
          else
          {
            java.lang.System.out.println("Wrong args:" + args[0] + ":");
            return;
          }
          while (true) {
                         java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
                         java.lang.System.out.println("Select an option: ");
                         java.lang.System.out.println("1. Retrieve patient journal");
                         java.lang.System.out.println("2. Edit and send patient journal");
                         java.lang.System.out.println("3. Exit");
                         int option = scanner.nextInt();
                         if (option == 1)
                         {
                           java.lang.System.out.println("Retrieved journal");
                           break;
                         }
                         else
                         if (option == 2)
                         {
                           java.lang.System.out.println("Editing and sending journal");
                           break;
                         }
                         else
                         if (option == 3)
                         {
                           java.lang.System.out.println("Exiting");
                           break;
                         }
                         else
                         {
                           java.lang.System.out.println("Wrong input!");
                           break;
                         }
                       }
        }
        finally {
                  org.jpy.PyLib.stopPython();
                }
      }
      else
      {
        java.lang.System.out.println("Args is empty");
      }
    }
  }
}