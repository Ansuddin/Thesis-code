import java.lang.System;
import java.util.Scanner;
import java.util.ArrayList;
import org.jpy.PyLib;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Test
{
  public static void main(java.lang.String[] args)
  {
    java.lang.String ssn = "270793-2131";
    java.lang.String name = "Ans Uddin";
    java.lang.String address = "Knapmagerstien 49";
    java.lang.String publicNote = "antibiotika intolerance";
    java.lang.String[] publicSessions = {" D-vitamin deficiancy"};
    java.lang.String[] privateSessions = {"Treatment for panic attacks started"};
    PatientJournal journal = new PatientJournal(ssn, name, address, publicNote, publicSessions, privateSessions);
    java.lang.String[] publicVar = journal.getPrivateSessions();
    Doctor doctor = new Doctor();
    se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Locks.IsDoctor));
    se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Locks.Referred));
    if (Locks.Referred && Locks.IsDoctor)
    {
      journal.addToPrivateSessions("test");
    }
  }
}