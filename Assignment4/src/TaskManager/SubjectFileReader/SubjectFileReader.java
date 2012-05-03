package TaskManager.subjectFileReader;


import TaskManager.data.User;
import TaskManager.data.Process;
import TaskManager.data.Performance;
import TaskManager.tabs.UserTab;
import TaskManager.tabs.ProcessTab;
import TaskManager.tabs.PerformanceTab;
import TaskManager.tabs.Tab;
import TaskManager.display.Display;
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
  public void beginProcess()
  {
    Scanner userInput;
    try {
      userInput = new Scanner(new File("input.txt"));
          while (userInput.hasNextLine()) {
            String[] data = userInput.nextLine().split("\t");
            if(data[0].equals("User"))
            {
              User user = new User(data[1], data[2]);
              System.out.println("sending info to user tab");
              this.addObserver(userTab);
              this.setChanged();
              this.notifyObservers(user);
              this.clearChanged();
              this.deleteObserver(userTab);
            }
            else if(data[0].equals("Processes"))
            {
              Process process = new Process(data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5]);

              System.out.println("sending info to Process tab");
              this.addObserver(processTab);
              this.setChanged();
              this.notifyObservers(process);
              this.clearChanged();
              this.deleteObserver(processTab);
            }
            else if(data[0].equals("Performance"))
            {
              Performance performance = new Performance(Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
              System.out.println("sending info to Performance tab");
              this.addObserver(performanceTab);
              this.setChanged();
              this.notifyObservers(performance);
              this.clearChanged();
              this.deleteObserver(performanceTab);
            }
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

