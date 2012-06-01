package genericEventProcessor.util;

import genericEventProcessor.server.logger.RemoteLogger;
import genericEventProcessor.server.RemoteEvent;
import genericEventProcessor.util.SerializableObject;
import genericEventProcessor.util.LogStore;

public class LogStore extends SerializableObject
{

  private Integer data1;
  private Integer data2;
  public boolean equals(LogStore log)
  {
    if(data1.equals(log.getData1()) && data2.equals(log.getData2()))
        return true;
    return false;
  }
  public void setData1(Integer data1)
  {
    this.data1 = data1;
  }
  public void setData2(Integer data2)
  {
    this.data2 = data2;
  }
  public Integer getData1() {
    return data1;
  }
  public Integer getData2() {
    return data2;
  }
}
