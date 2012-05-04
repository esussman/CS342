package TaskManager.driver;

import TaskManager.subjectFileReader.SubjectFileReader;
import TaskManager.display.StandardOut;
import TaskManager.display.Display;
import TaskManager.data.Performance;
import TaskManager.data.Process;
import TaskManager.data.User;
import TaskManager.tabs.PerformanceTab;
import TaskManager.tabs.Tab;
import java.util.Observer;
import TaskManager.util.Debug;

public class Driver
{
  public static void main(String[] args)
  {
  
    int debug_value = 0;
    if(args.length != 1)
    {
      System.err.println("Bad number of arguments");
      System.exit(-1);
    }
    try
    {
      debug_value = Integer.parseInt(args[0]);
    }
    catch (NumberFormatException e)
    {
      System.err.println("invalid input");
      System.exit(1);
    }
	finally
    {

    }
	
	Debug.DEBUG_VALUE = debug_value;
	
    Display d = new StandardOut();
    SubjectFileReader sfr = new SubjectFileReader(d);
    sfr.beginProcess();
  }
}
