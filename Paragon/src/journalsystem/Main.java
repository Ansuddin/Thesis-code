import java.lang.System;
import java.util.Scanner;
import java.util.ArrayList;
import org.jpy.PyLib;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main
{
  public static void main(java.lang.String[] args)
  {
    Employee employee;
    if (args[0].equals("doctor"))
    {
      java.lang.System.out.println(args[0]);
      java.lang.String[] patients = new java.lang.String[2];
      employee = new Doctor(1, args[0], patients);
      se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Policy.IsDoctor));
    }
    else
    if (args[0].equals("secretary"))
    {
      java.lang.System.out.println(args[0]);
    }
    else
    {
      java.lang.System.out.println("Wrong args:" + args[0] + ":");
      return;
    }
  }
}