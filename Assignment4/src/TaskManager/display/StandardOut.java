package TaskManager.display;

import TaskManager.display.Display;

public class StandardOut implements Display
{
  public void updateDisplay(String data)
  {
    System.out.println(data);
  }
}
