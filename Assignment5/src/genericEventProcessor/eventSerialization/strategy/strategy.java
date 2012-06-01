package genericEventProcessor.eventSerialization.strategy;

import java.lang.reflect.Method;
public interface strategy
{
  public void serializeME(Object proxy, Method method, Object[] args);
}
