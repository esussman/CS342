package genericEventProcessor.server.viz;

import genericEventProcessor.util.SerializableObject;
import genericEventProcessor.server.RemoteEvent;
import genericEventProcessor.util.VizDetails;

public interface RemoteViz extends RemoteEvent
{
  public void writeViz(VizDetails vizDetailsIn, int sequenceNo, String serializationFormat);
  public SerializableObject readViz(String wireFormat, String serializationFormat);

}
