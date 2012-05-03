package TaskManager.data;

public class Process
{
  public Process(String processName, String userName, int CPU, int memory, String description)
  {
    this.processName = processName;
    this.userName = userName;
    this.CPU = CPU;
    this.memory = memory;
    this.description = description;
  }

  String processName;
  String userName;
  int CPU;
  int memory;
  String description;
}


