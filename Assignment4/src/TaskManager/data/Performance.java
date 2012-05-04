package TaskManager.data;


public class Performance
{
  int currentMemoryUsage;
  int currentCpuUsage;
  int totalPhysicalMemory;
  int totalCached;

  public Performance(int currMemUsage, int currCpuUsage, int totalPhysicalMem, int totCached)
  {
    currentMemoryUsage = currMemUsage;
    currentCpuUsage = currCpuUsage;
    totalPhysicalMemory = totalPhysicalMem;
    totalCached = totCached;
  }
  public String toString()
  {
    String ret = "Current Memory Usage " + currentMemoryUsage + " Current Cpu Usage " + currentCpuUsage + " Total Physical Memory " + totalPhysicalMemory + " Total Cached " + totalCached;
    return ret;
  }

}

