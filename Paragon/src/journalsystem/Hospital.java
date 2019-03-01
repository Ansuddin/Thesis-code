import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.lang.System;
import java.util.Scanner;
public class Hospital
{
  private final Matrix matrix;
  private final java.util.HashMap<java.lang.String, java.lang.String> patients;
  private final java.util.ArrayList<Employee> employees;
  public Hospital (java.util.HashMap<java.lang.String, java.lang.String> patients, Matrix matrix)
  {
    this.matrix = matrix;
    this.patients = patients;
    this.employees = new java.util.ArrayList();
  }
  public PatientJournalD getJournal(java.lang.String ssn)
  {
    java.lang.String room = patients.get(ssn);
    java.lang.String JSON = matrix.retrieve(room);
    PatientJournalD journal = Mapper.JSONToObject(JSON);
    return journal;
  }
  public void updateJournal(PatientJournalD journal)
  {
    java.lang.String room = patients.get(journal.getSsn());
    java.lang.String json = Mapper.objectToJSON(journal);
    matrix.send(json, room);
  }
  public void selectPatient(Employee employee)
  {
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String[] patientArray = patients.keySet().toArray(new java.lang.String[patients.size()]);
    while (true) {
                   java.lang.System.out.println("Level2");
                   java.lang.System.out.println("Select a patient:");
                   for (int i = 0 ; i < patients.size() ; i++)
                   {
                     java.lang.System.out.println(i + 1 + ". " + patientArray[i]);
                   }
                   java.lang.System.out.println("0. Back");
                   int option = scanner.nextInt();
                   if (option > 0 && option <= patientArray.length)
                   {
                     java.lang.String ssn = patientArray[option - 1];
                     employee.receive(getJournal(ssn), scanner);
                   }
                   else
                   {
                     break;
                   }
                 }
  }
  public void selectEmployee()
  {
    Employee[] list = new Employee[employees.size()];
    list = this.employees.<Employee>toArray(list);
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    while (true) {
                   java.lang.System.out.println("Level 1");
                   java.lang.System.out.println("Select an employee: ");
                   for (int i = 0 ; i < list.length ; i++)
                   {
                     java.lang.System.out.println(i + 1 + ". " + list[i].getName() + ", " + list[i].getTitle());
                   }
                   java.lang.System.out.println("0. Exit");
                   int option = scanner.nextInt();
                   if (option > 0 && option <= list.length)
                   {
                     Employee employee = list[option - 1];
                     selectPatient(employee);
                   }
                   else
                   {
                     break;
                   }
                 }
  }
  public void addEmployee(Employee employee)
  {
    this.employees.add(employee);
  }
}