package genericEventProcessor.eventSerialization;

import genericEventProcessor.util.SerializableObject;
import genericEventProcessor.eventSerialization.strategy.strategy;
import genericEventProcessor.eventSerialization.strategy.xmlSerializer;
import genericEventProcessor.eventSerialization.strategy.txtSerializer;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import genericEventProcessor.util.LogStore;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class EventSerializer implements InvocationHandler
{
  public Object invoke(Object proxy, Method method, Object[] args)
  {
    strategy parse;
    if(args[2].equals("xml"))
    {
      parse = new xmlSerializer();
      parse.serializeME(proxy, method, args);
    }
    else if(args[2].equals("plaintext"))
    {
      parse = new txtSerializer();
      parse.serializeME(proxy, method, args);
    }
    else
    {
      System.out.println("Oops, what type of format would you like to serialize to");
      System.exit(99);
    }
    return null;
  }
}
