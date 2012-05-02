package TaskManager.subjectFileReader;

import java.util.Observable;
import java.util.Observer;

public class SubjectFileReader extends Observable
{
  public void update()
  {
    this.setChanged();
  }
}

