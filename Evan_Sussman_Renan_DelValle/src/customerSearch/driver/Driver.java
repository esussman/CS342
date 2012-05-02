package customerSearch.driver;


import customerSearch.products.Version1.SeaGateDrive1;
import customerSearch.products.Version1.SeaGateDrive2;
import customerSearch.products.Version1.SeaGateDrive3;
import customerSearch.products.Version1.SeaGateDriveV1;
import customerSearch.products.Version2.SeaGateDrive4;
import customerSearch.products.Version2.SeaGateDrive5;
import customerSearch.products.Version2.SeaGateDrive6;
import customerSearch.products.Version2.SeaGateDriveV2;
import customerSearch.products.Version3.SeaGateDrive7;
import customerSearch.products.Version3.SeaGateDrive8;
import customerSearch.products.Version3.SeaGateDrive9;
import customerSearch.products.Version3.SeaGateDriveV3;
import customerSearch.products.Version4.SeaGateDrive10;
import customerSearch.products.Version4.SeaGateDrive11;
import customerSearch.products.Version4.SeaGateDrive12;
import customerSearch.products.Version4.SeaGateDriveV4;
import customerSearch.util.CompleteSearchVisitor;
import customerSearch.util.ProductVisitor;
import customerSearch.util.Debug;

class Driver
{



  public static void main(String[] args)
  {
    int debug_value = 0;
    if(args.length != 1)
    {
      System.err.println("Bad number of arguments");
      System.exit(-1);
    }
    try
    {
      debug_value = Integer.parseInt(args[0]);
    }
    catch (NumberFormatException e)
    {
      System.err.println("invalid input");
      System.exit(1);
    }
    finally
    {

    }
    Debug.DEBUG_VALUE = debug_value;
    //V1
    SeaGateDriveV1 sg1 = new SeaGateDrive1();
    SeaGateDriveV1 sg2 = new SeaGateDrive2();
    SeaGateDriveV1 sg3 = new SeaGateDrive3();

    //V2
    SeaGateDriveV2 sg4 = new SeaGateDrive4();
    SeaGateDriveV2 sg5 = new SeaGateDrive5();
    SeaGateDriveV2 sg6 = new SeaGateDrive6();

    //V3
    SeaGateDriveV3 sg7 = new SeaGateDrive7();
    SeaGateDriveV3 sg8 = new SeaGateDrive8();
    SeaGateDriveV3 sg9 = new SeaGateDrive9();

    //V4
    SeaGateDriveV4 sg10 = new SeaGateDrive10();
    SeaGateDriveV4 sg11 = new SeaGateDrive11();
    SeaGateDriveV4 sg12 = new SeaGateDrive12();

    //Visitor
    ProductVisitor visitor = new CompleteSearchVisitor();

    Debug.dprint("Version 1", 2);
    Debug.dprint("Drive 1", 2);
    sg1.accept(visitor);
    Debug.dprint("Drive 2", 2);
    sg2.accept(visitor);
    Debug.dprint("Drive 3", 2);
    sg3.accept(visitor);

    Debug.dprint("Version 2", 2);
    Debug.dprint("Drive 4" , 2);
    sg4.accept(visitor);
    Debug.dprint("Drive 5", 2);
    sg5.accept(visitor);
    Debug.dprint("Drive 6", 2);
    sg6.accept(visitor);

    Debug.dprint("Version 3", 2);
    Debug.dprint("Drive 7", 2);
    sg7.accept(visitor);
    Debug.dprint("Drive 8", 2);
    sg8.accept(visitor);
    Debug.dprint("Drive 9", 2);
    sg9.accept(visitor);

    Debug.dprint("Version 4", 2);
    Debug.dprint("Drive 10", 2);
    sg10.accept(visitor);
    Debug.dprint("Drive 11", 2);
    sg11.accept(visitor);
    Debug.dprint("Drive 12", 2);
    sg12.accept(visitor);
  }





}
