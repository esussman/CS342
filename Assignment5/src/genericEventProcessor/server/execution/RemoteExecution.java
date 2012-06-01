package genericEventProcessor.server.execution;

import genericEventProcessor.util.SerializableObject;
import genericEventProcessor.server.RemoteEvent;
import genericEventProcessor.util.ExecDetails;

public interface RemoteExecution extends RemoteEvent {
      public void writeExecution(ExecDetails execDetailsIn, int sequenceNo, String serializationFormat);
      public SerializableObject readExecution(String wireFormat, String serializationFormat);
}
