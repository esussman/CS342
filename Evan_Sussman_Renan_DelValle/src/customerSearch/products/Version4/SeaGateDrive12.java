package customerSearch.products.Version4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import customerSearch.util.Debug;

import customerSearch.products.Version3.SeaGateDriveV3;
import customerSearch.util.FileEnums;
import java.util.ArrayList;
public class SeaGateDrive12 extends SeaGateDriveV4
{
  public SeaGateDrive12()
  {
  Debug.dprint("Inside " + this.getClass().getName() + " constructor.", 2);
    description = new ArrayList<String>();
    Scanner descriptionInput;
    String path = "src/customerSearch/util/productDescriptions/" + FileEnums.Product12.getCode();

    try {
      descriptionInput = new Scanner(new File(path));
          while (descriptionInput.hasNextLine()) {
            description.add(descriptionInput.nextLine());
          }
    }
    catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    finally{

    }

  }
}

