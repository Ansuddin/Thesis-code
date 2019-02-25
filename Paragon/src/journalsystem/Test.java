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
    PatientJournalD journal = new PatientJournalD(ssn, name, address, publicNote, publicSessions, privateSessions);
    journal.setSsn("test");
    java.lang.String test = journal.getSsn();
    Doctor doctor = new Doctor();
    java.lang.String untrustedVar = "";
    java.lang.String trustedVar = "";
    untrustedVar = trustedVar;
    trustedVar = Policy.<java.lang.String>endorse(untrustedVar);
    journal.setPublicNote(Policy.<java.lang.String>endorse(untrustedVar));
    se.chalmers.paragon.runtime.Policy bottom = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {java.lang.Object.class}, new se.chalmers.paragon.runtime.Variable(0)));
    java.lang.String low = "";
    java.lang.String medium = "";
    java.lang.String high = "";
    medium = low;
    high = medium;
    high = low;
    se.chalmers.paragon.runtime.LockState.open(new se.chalmers.paragon.runtime.Lock(Policy.IsDoctor));
    java.lang.String out = Policy.<java.lang.String>declassifyMedium(medium);
    java.lang.System.out.println(out);
  }
}