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
    if (args[0].equals("doctor"))
    {
      java.lang.System.out.println(args[0]);
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