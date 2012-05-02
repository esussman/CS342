package TaskManager.tabs;

import TaskManager.tabs.Tab;
import java.util.Observable;
import java.util.Observer;

public class ProcessTab extends Tab
{
  public void update(Observable obs, Object x) {
      System.out.println("update(" + obs + "," + x + ");");
    }
}
