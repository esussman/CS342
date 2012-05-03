package TaskManager.subjectFileReader;

import java.util.Observable;
import java.util.Observer;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SubjectFileReader extends Observable
{
  Display display;
  PerformanceTab performanceTab;
  ProcessTab processTab;
  UserTab userTab;

  public SubjectFileReader(Display d)
  {
    this.display = d;
    performanceTab = new PerformanceTab();
    performanceTab.addObserver(d);
    processTab = new ProcessTab();
    processTab.addObserver(d);
    userTab = new UserTab();
    userTab.addObserver(d);
  }
  public beginProcess()
  {
    Scanner userInput;
    try {
      userInput = new Scanner(new File("input.txt"));
          while (userInput.hasNextLine()) {
            System.out.println(userInput.nextLine());
          }
    }
    catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    finally
    {

    }
  }
  public void update()
  {
    this.setChanged();
  }
}

