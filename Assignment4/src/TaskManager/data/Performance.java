package TaskManager.data;

public class Performance
{
  public Performance(int currMemUsage, int currCpuUsage, int totalPhysicalMem, int totCached)
  {
    currentMemoryUsage = currMemUsage;
    currentCpuUsage = currCpuUsage;
    totalPhysicalMemory = totalPhysicalMem;
    totalCached = totCached;
  }
  int currentMemoryUsage;
  int currentCpuUsage;
  int totalPhysicalMemory;
  int totalCached;
}

