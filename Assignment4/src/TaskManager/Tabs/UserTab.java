package TaskManager.tabs;

import TaskManager.tabs.Tab;
import TaskManager.data.User;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class UserTab extends Tab
{

  public UserTab()
  {
	storage = new ArrayList<User>();
  }
  public void update(Observable obs, Object x) {
      changed(x);
	  storage.add((User)x);
    }
  public void changed(Object x)
  {
    this.setChanged();
    this.notifyObservers(x);
    this.clearChanged();
  }
}
