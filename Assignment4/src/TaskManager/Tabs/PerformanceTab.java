package TaskManager.tabs;
import TaskManager.tabs.Tab;
import java.util.Observable;
import java.util.Observer;

public class PerformanceTab extends Tab
{
  public PerformanceTab()
  {

  }
  public void update(Observable obs, Object x) {
      changed(x);
    }
  public void changed(Object x)
  {
    this.setChanged();
    this.notifyObservers(x);
    this.clearChanged();
  }
}

