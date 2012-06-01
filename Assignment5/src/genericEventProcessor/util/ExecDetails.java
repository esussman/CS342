package genericEventProcessor.util;

import genericEventProcessor.server.execution.RemoteExecution;
import genericEventProcessor.util.SerializableObject;
import genericEventProcessor.server.RemoteEvent;
import genericEventProcessor.util.ExecDetails;

public class ExecDetails extends SerializableObject
{
  private Integer data1;
  private Integer data2;

  public boolean equals(ExecDetails details)
  {
    if(data1.equals(details.getData1()) && data2.equals(details.getData2()))
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
