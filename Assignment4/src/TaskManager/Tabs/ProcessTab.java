package TaskManager.tabs;

import TaskManager.tabs.Tab;
import TaskManager.data.Process;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class ProcessTab extends Tab
{
  public ProcessTab()
  {
	storage = new ArrayList<Process>();
  }
  public void update(Observable obs, Object x) {
    changed(x);
	storage.add((Process)x);
    }
  public void changed(Object x)
  {
    this.setChanged();
    this.notifyObservers(x);
    this.clearChanged();
  }
}
