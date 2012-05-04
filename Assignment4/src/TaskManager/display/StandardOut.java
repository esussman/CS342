package TaskManager.display;

import TaskManager.display.Display;
import java.util.Observable;
import TaskManager.util.Debug;

public class StandardOut implements Display
{
  public void updateDisplay(Object x)
  {
   if(Debug.DEBUG_VALUE >= 1)
   {
     System.out.println(x.toString());
   }
  }
  public void update(Observable obs, Object x) {
      updateDisplay(x);
  }
}
