package TaskManager.display;

import TaskManager.display.Display;
import java.util.Observable;

public class StandardOut implements Display
{
  public void updateDisplay(Object x)
  {
    System.out.println(x.toString());
  }
  public void update(Observable obs, Object x) {
      updateDisplay(x);
  }
}
