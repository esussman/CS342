package genericEventProcessor.util;

import genericEventProcessor.server.RemoteEvent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyCreator
{
  public RemoteEvent createProxy(Class<?>[] interfaceArray, InvocationHandler handler)
  {
    RemoteEvent remoteEvent = (RemoteEvent) Proxy.newProxyInstance( getClass().getClassLoader(), interfaceArray,handler);
    return remoteEvent;
  }
}
