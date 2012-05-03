package TaskManager.data;

public class Process
{
  String processName;
  String userName;
  int CPU;
  int memory;
  String description;

  public Process(String processName, String userName, int CPU, int memory, String description)
  {
    this.processName = processName;
    this.userName = userName;
    this.CPU = CPU;
    this.memory = memory;
    this.description = description;
  }

  public String toString()
  {
    String ret = "Process Name " + processName + " User Name " + userName + " CPU " + CPU + " Memory " + memory + " Description " + description;
    return ret;
  }


}


