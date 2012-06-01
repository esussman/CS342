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

public class txtSerializer implements strategy
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
          out.write(serial.getClass().getName()+"\n");
          for(Object obj: args)
          {
            out.write(obj.getClass().getName()+"\n");
          }
          out.write(methodName+"\n");
          out.write(declaringClass.getName()+"\n");
          for(Method methodMember : serial.getClass().getMethods())
          {
            out.write(methodMember.getName()+"\n");
            if(methodMember.getName().startsWith("get"))
            {
              try
              {
                Object value = methodMember.invoke(serial);
                out.write("ReturnType:"+methodMember.getReturnType().getName()+"\n");
                out.write(methodMember.getName().substring(3)+"\n");
                out.write(value.toString()+"\n");
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
