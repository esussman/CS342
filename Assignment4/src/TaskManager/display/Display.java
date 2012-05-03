package TaskManager.display;
import java.util.Observer;
import java.util.Observable;

public interface Display extends Observer
{
  public void updateDisplay(Object data);
  public void update(Observable obs, Object x);
}
