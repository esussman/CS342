package TaskManager.tabs;
import TaskManager.tabs.Tab;
import java.util.Observable;
import java.util.Observer;

public class PerformanceTab extends Tab
{
  public PerformanceTab()
  {

  }
  public void update(observable obs, object x) {
      changed(x);
    }
  public void changed(object x)
  {
    this.setchanged();
    notifyobservers(x);
    clearchanged();
  }
}

