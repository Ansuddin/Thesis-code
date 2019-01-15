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
    java.lang.String[] sessions = {"startet behandling"};
    PatientJournal journal = new PatientJournal(1, "270793-2131", "Ans", "Knapmagerstien", "H\248feber", sessions);
    java.lang.String fakeSsn = "012345-6789";
    journal.setSsn(fakeSsn);
  }
}