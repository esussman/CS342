package genericEventProcessor.eventDeSerialization;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.ClassNotFoundException;
import java.lang.NoSuchMethodException;
import genericEventProcessor.util.LogStore;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.IllegalArgumentException;
import java.lang.InstantiationException;
import java.lang.reflect.Constructor;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import genericEventProcessor.eventDeSerialization.strategy.DeserialStrategy;
import genericEventProcessor.eventDeSerialization.strategy.txtDeserializer;
import genericEventProcessor.eventDeSerialization.strategy.xmlDeserializer;
public class EventDeSerializer implements InvocationHandler
{
  public Object invoke(Object proxy, Method method, Object[] args)
  {
    DeserialStrategy strat = null;
    Object ret = null;
    if(args[1].equals("xml"))
    {
      strat = new xmlDeserializer();
      ret = strat.deserializeME(proxy, method, args);
    }
    else if(args[1].equals("plaintext"))
    {
      strat = new txtDeserializer();
      ret = strat.deserializeME(proxy, method, args);
    }
    else
    {
      System.out.println("Oops, what type of format would you like to serialize to");
      System.exit(99);
    }
    return ret;
  }
}
