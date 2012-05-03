package TaskManager.driver;

import TaskManager.subjectFileReader.SubjectFileReader;
import TaskManager.tabs.PerformanceTab;
import TaskManager.tabs.Tab;
import java.util.Observer;
public class Driver
{
  public static void main(String[] args)
  {
    SubjectFileReader sfr = new SubjectFileReader();
    Tab p = new PerformanceTab();
    sfr.addObserver((Observer)p);
    sfr.update();
    sfr.notifyObservers();
  }
}
