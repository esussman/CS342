package TaskManager.Tabs;

import java.util.Observable;
import java.util.Observer;

class ProcessTab extends Observable implements Observer
{
  public void update(Observable obs, Object x) {
      System.out.println("update(" + obs + "," + x + ");");
    }
}
