package TaskManager.tabs;

import TaskManager.tabs.Tab;
import java.util.Observable;
import java.util.Observer;

public class UserTab extends Tab
{
  public UserTab()
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
