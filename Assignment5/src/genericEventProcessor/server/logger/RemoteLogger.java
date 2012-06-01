
package genericEventProcessor.server.logger;

import genericEventProcessor.server.RemoteEvent;
import genericEventProcessor.util.SerializableObject;
import genericEventProcessor.util.LogStore;

public interface RemoteLogger extends RemoteEvent {

 public void writeLogger(LogStore logStoreIn, int sequenceNo, String serializationFormat);
 public SerializableObject readLogger(String wireFormat, String serializationFormat);

}

