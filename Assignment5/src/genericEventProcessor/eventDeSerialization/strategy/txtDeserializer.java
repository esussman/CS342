package genericEventProcessor.eventDeSerialization.strategy;

import java.lang.reflect.InvocationHandler;
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
import java.lang.reflect.Method;
public class txtDeserializer implements DeserialStrategy
{
  public Object deserializeME(Object proxy, Method method, Object[] args)
  {
    Class serialObject = null;
    String fileList[] = ((String)args[0]).split("\n");
    Object logStore = null;
    try
    {
      serialObject = Class.forName(fileList[0]);
      logStore = serialObject.newInstance();
    }
    catch(IllegalAccessException e)
    {
      System.exit(3);
    }
    catch(InstantiationException e)
    {
      System.exit(2);
    }
    catch(ClassNotFoundException ex)
    {
      System.exit(1);
    }
    for(int i = 0; i < fileList.length; i++)
    {
      if(fileList[i].contains("ReturnType:"))
      {
        Class params = null;
        String name = "set"+fileList[i+1];
        String type = fileList[i].substring(fileList[i].indexOf(' ')+1);
        String value = fileList[i+2];
        try
        {
          if(!type.equals("java.lang.Class"))
          {
            // System.out.print("1");
            Class typeClass = Class.forName(type);
            Constructor c = typeClass.getConstructor(name.getClass());
            Object integer = c.newInstance(value);
            Method setMethod = serialObject.getMethod(name, typeClass);
            setMethod.invoke(logStore, integer);
          }
        }
        catch(IllegalArgumentException dfs)
        {
          System.exit(1);
        }
        catch(IllegalAccessException e1)
        {
          System.exit(2);
        }
        catch(InvocationTargetException a)
        {
          System.exit(3);
        }
        catch(InstantiationException e)
        {
          System.exit(4);
        }
        catch(NoSuchMethodException e2)
        {
          System.exit(5);
        }
        catch(ClassNotFoundException ex)
        {
          System.exit(6);
        }
      }
    }
    return logStore;
  }
}
