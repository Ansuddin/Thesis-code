import journalsystem.MatrixApi;
import org.jpy.PyLib;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import journalsystem.*;
import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;
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
          journalsystem.MatrixApi api = new journalsystem.MatrixApi("https://ansuddin.xyz", "ans", "test", "!XtUmMyjaNdBdSbMfxK:ansuddin.xyz");
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
                         java.lang.System.out.println("2. Add and send new patient journal");
                         java.lang.System.out.println("3. Edit and send patient journal");
                         java.lang.System.out.println("4. Exit");
                         int option = scanner.nextInt();
                         if (option == 1)
                         {
                           java.lang.System.out.println("Retrieving journal");
                           java.lang.String json = api.retrieve();
                           if (json == null || json.equals(""))
                           {
                             java.lang.System.out.println("Journal not added");
                           }
                           else
                           {
                             java.lang.System.out.println(json);
                           }
                           java.lang.System.out.println();
                         }
                         else
                         if (option == 2)
                         {
                           java.lang.System.out.println("Adding and sending new journal");
                           java.lang.String json = api.retrieve();
                           if (json == null || json.equals(""))
                           {
                             java.lang.String[] sessions = {"started treatment for pollen"};
                             PatientJournal journal = new PatientJournal(1, "270793-2131", "Ans Uddin", "Knapmagerstien 49", "Has grass pollen allergy", sessions);
                             json = api.journalToString(journal);
                             api.send(json);
                             java.lang.System.out.println(json);
                             java.lang.System.out.println("Journal added");
                           }
                           else
                           {
                             java.lang.System.out.println("Journal already exists");
                           }
                           java.lang.System.out.println();
                         }
                         else
                         if (option == 3)
                         {
                           java.lang.System.out.println("Editing and sending journal");
                           java.lang.String json = api.retrieve();
                           if (json != null)
                           {
                             if (!json.equals(""))
                             {
                               PatientJournal journal = api.stringToJournal(json);
                               java.lang.System.out.println("Select option:");
                               java.lang.System.out.println("1. Change public note");
                               java.lang.System.out.println("2. Add session");
                               int editOption = scanner.nextInt();
                               java.util.Scanner editScanner = new java.util.Scanner(java.lang.System.in);
                               if (editOption == 1)
                               {
                                 java.lang.System.out.println("Add new public note");
                                 java.lang.String note = editScanner.nextLine();
                                 journal.publicNotes = note;
                                 json = api.journalToString(journal);
                                 api.send(json);
                               }
                               else
                               if (editOption == 2)
                               {
                                 java.lang.System.out.println("Add new session");
                                 java.lang.String newSession = editScanner.nextLine();
                                 journal.addToSessions(newSession);
                                 json = api.journalToString(journal);
                                 api.send(json);
                               }
                               else
                               {
                                 java.lang.System.out.println("Wrong option!");
                               }
                               java.lang.System.out.println(json);
                               java.lang.System.out.println("Journal edited");
                             }
                             else
                             {
                               java.lang.System.out.println("Journal not added.");
                             }
                           }
                           else
                           {
                             java.lang.System.out.println("Journal not added");
                           }
                           java.lang.System.out.println();
                         }
                         else
                         if (option == 4)
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