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

    Debug.dprint("Version 1", 1);
    Debug.dprint("Drive 1", 1);
    sg1.accept(visitor);
    Debug.dprint("Drive 2", 1);
    sg2.accept(visitor);
    Debug.dprint("Drive 3", 1);
    sg3.accept(visitor);

    Debug.dprint("Version 2", 1);
    Debug.dprint("Drive 4" , 1);
    sg4.accept(visitor);
    Debug.dprint("Drive 5", 1);
    sg5.accept(visitor);
    Debug.dprint("Drive 6", 1);
    sg6.accept(visitor);

    Debug.dprint("Version 3", 1);
    Debug.dprint("Drive 7", 1);
    sg7.accept(visitor);
    Debug.dprint("Drive 8", 1);
    sg8.accept(visitor);
    Debug.dprint("Drive 9", 1);
    sg9.accept(visitor);

    Debug.dprint("Version 4", 1);
    Debug.dprint("Drive 10", 1);
    sg10.accept(visitor);
    Debug.dprint("Drive 11", 1);
    sg11.accept(visitor);
    Debug.dprint("Drive 12", 1);
    sg12.accept(visitor);
  }





}
