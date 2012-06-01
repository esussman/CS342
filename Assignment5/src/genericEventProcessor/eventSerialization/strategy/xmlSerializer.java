package genericEventProcessor.eventSerialization.strategy;

import genericEventProcessor.util.SerializableObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;
import genericEventProcessor.util.LogStore;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class xmlSerializer implements strategy
{
  public void serializeME(Object proxy, Method method, Object[] args)
  {
    String methodName = method.getName();
    Class declaringClass = method.getDeclaringClass();
    SerializableObject serial = (SerializableObject)args[0];
        try
        {
          FileWriter fstream = new FileWriter("serialization.txt");
          BufferedWriter out = new BufferedWriter(fstream);
          out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
          out.write("<ClassName>"+serial.getClass().getName()+"</ClassName>\n");
          int argCount = 0;
          for(Object obj: args)
          {
            out.write("<arg"+argCount+">"+obj.getClass().getName()+"</arg"+argCount+">\n");
            argCount++;
          }
          out.write("<CallingMethod>"+methodName+"</CallingMethod>\n");
          out.write("<DeclaringClass>"+declaringClass.getName()+"</DeclaringClass>\n");
          int count = 0;
          for(Method methodMember : serial.getClass().getMethods())
          {
            if(methodMember.getName().startsWith("get"))
            {
            out.write("<Method"+count+">"+methodMember.getName()+"</Method"+count+">\n");
              try
              {
                Object value = methodMember.invoke(serial);
                out.write("<data"+count+">\n\t<ReturnType>"+methodMember.getReturnType().getName()+"</ReturnType>\n");
                out.write("\t<name>"+methodMember.getName().substring(3)+"</name\n");
                out.write("\t<value>"+value.toString()+"</value>\n</data"+count+">\n");
              }
              catch(IllegalAccessException e)
              {
                out.write("oops1");
                System.exit(-1);
              }
              catch(InvocationTargetException e2)
              {
                out.write("oops2");
                System.exit(-1);
              }
              finally
              {
              }
            }
            count++;
          }
          out.close();
        }
        catch(IOException e3)
        {

        }
        finally
        {
        }
  }
}

