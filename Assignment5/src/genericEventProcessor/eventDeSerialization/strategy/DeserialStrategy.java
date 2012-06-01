package genericEventProcessor.eventDeSerialization.strategy;

import java.lang.reflect.Method;
public interface DeserialStrategy
{
  public Object deserializeME(Object proxy, Method method, Object[] args);
}
