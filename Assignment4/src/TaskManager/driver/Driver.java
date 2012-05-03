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

public class Driver
{
  public static void main(String[] args)
  {
    Display d = new StandardOut();
    SubjectFileReader sfr = new SubjectFileReader(d);
    sfr.beginProcess();
  }
}
