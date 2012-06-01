package genericEventProcessor.client;
import genericEventProcessor.util.ProxyCreator;
import genericEventProcessor.util.ExecDetails;
import genericEventProcessor.util.VizDetails;
import genericEventProcessor.server.RemoteEvent;
import genericEventProcessor.server.execution.RemoteExecution;
import genericEventProcessor.server.logger.RemoteLogger;
import genericEventProcessor.server.viz.RemoteViz;
import genericEventProcessor.util.LogStore;
import genericEventProcessor.eventSerialization.EventSerializer;
import genericEventProcessor.eventDeSerialization.EventDeSerializer;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Client
{
  public static String readFile(String filename)
  {
    String builder = "";
    try
    {
      Scanner scanner = new Scanner(new FileInputStream(filename));
      while(scanner.hasNextLine())
      {
        builder = builder.concat(scanner.nextLine()+"\n");
      }
    }
    catch(FileNotFoundException e)
    {
      System.exit(-1);
    }
    return builder;
  }

  public static void main(String[] args)
  {
    ProxyCreator pc = new ProxyCreator();

    RemoteEvent serializedEvent = pc.createProxy(new Class[] { RemoteExecution.class, RemoteLogger.class, RemoteViz.class }, new EventSerializer());

    LogStore store = new LogStore();
    store.setData1(777);
    store.setData2(21);
    ((RemoteLogger)serializedEvent).writeLogger(store, 777, "xml");

    RemoteEvent deserializedEvent = pc.createProxy(new Class[] { RemoteExecution.class, RemoteLogger.class, RemoteViz.class }, new EventDeSerializer());
    String builder = readFile("serialization.txt");
    LogStore anotherStore = (LogStore) ((RemoteLogger) deserializedEvent).readLogger(builder, "xml");
    if(store.equals(anotherStore))
      System.out.println("Match Log");

    ExecDetails details = new ExecDetails();
    details.setData1(4);
    details.setData2(5);
    ((RemoteExecution)serializedEvent).writeExecution(details, 777, "xml");
    builder = readFile("serialization.txt");
    ExecDetails moreDetails = (ExecDetails) ((RemoteExecution) deserializedEvent).readExecution(builder, "xml");
    if(details.equals(moreDetails))
      System.out.println("Match Exec");


    VizDetails viz = new VizDetails();
    viz.setData1(1000);
    viz.setData2(192);
    ((RemoteViz)serializedEvent).writeViz(viz, 777, "xml");
    builder = readFile("serialization.txt");
    VizDetails moreViz = (VizDetails) ((RemoteViz) deserializedEvent).readViz(builder, "xml");
    if(viz.equals(moreViz))
      System.out.println("Match Viz");
  }

}
