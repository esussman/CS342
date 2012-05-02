package TaskManager.tabs;

import TaskManager.tabs.Tab;
import java.util.Observable;
import java.util.Observer;

class User extends Tab implements Observer
{
  public void update(Observable obs, Object x) {
      System.out.println("update(" + obs + "," + x + ");");
    }
}
