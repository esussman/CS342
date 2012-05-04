package TaskManager.tabs;

import TaskManager.tabs.Tab;
import TaskManager.data.Performance;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class PerformanceTab extends Tab
{
  
  public PerformanceTab()
  {
	storage = new ArrayList<Performance>();
  }
  public void update(Observable obs, Object x) {
      changed(x);
	  storage.add((Performance) x);
    }
  public void changed(Object x)
  {
    this.setChanged();
    this.notifyObservers(x);
    this.clearChanged();
  }
}

