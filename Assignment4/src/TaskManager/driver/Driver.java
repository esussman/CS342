package TaskManager.driver;

import TaskManager.subjectFileReader.SubjectFileReader;
import TaskManager.display.StandardOut;
import TaskManager.display.Display;
import TaskManager.data.Performance;
import TaskManager.tabs.PerformanceTab;
import TaskManager.tabs.Tab;
import java.util.Observer;

public class Driver
{
  public static void main(String[] args)
  {
    Performance p = new Performance(25, 20, 20 ,20);
    PerformanceTab pt = new PerformanceTab();
    Display sout = new StandardOut();
    pt.addObserver(sout);
    pt.changed(p);
  }
}
