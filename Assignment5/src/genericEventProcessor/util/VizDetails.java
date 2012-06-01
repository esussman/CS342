package genericEventProcessor.util;

import genericEventProcessor.server.viz.RemoteViz;
import genericEventProcessor.util.SerializableObject;
import genericEventProcessor.server.RemoteEvent;
import genericEventProcessor.util.VizDetails;

public class VizDetails extends SerializableObject
{
  Integer data1;
  Integer data2;
  public boolean equals(VizDetails viz)
  {
    if(data1.equals(viz.getData1()) && data2.equals(viz.getData2()))
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
