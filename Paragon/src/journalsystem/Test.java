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
    Secretary untrustedObserver = new Secretary();
    Doctor trustedObserver = new Doctor();
    se.chalmers.paragon.runtime.Policy untrusted = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(untrustedObserver)));
    se.chalmers.paragon.runtime.Policy trusted = new se.chalmers.paragon.runtime.Policy(new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(untrustedObserver)), new se.chalmers.paragon.runtime.Clause(new Class<?>[] {}, new se.chalmers.paragon.runtime.Actor(trustedObserver)));
  }
}