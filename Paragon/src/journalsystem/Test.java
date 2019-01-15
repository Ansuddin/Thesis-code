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
    int id = 1;
    java.lang.String ssn = "270793-2131";
    java.lang.String name = "Ans Uddin";
    java.lang.String address = "Knapmagerstien 49";
    java.lang.String publicNote = "H\248feber";
    java.lang.String[] sessions = {"startet behandling"};
    boolean allowStatistics = false;
    PatientJournal journal = new PatientJournal(id, ssn, name, address, publicNote, sessions, allowStatistics);
  }
}