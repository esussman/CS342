package customerSearch.products.Version3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import customerSearch.products.Version2.SeaGateDriveV2;
import customerSearch.util.FileEnums;
import java.util.ArrayList;
import customerSearch.util.Debug;

public class SeaGateDrive7 extends SeaGateDriveV3
{
  public SeaGateDrive7()
  {
  Debug.dprint("Inside " + this.getClass().getName() + " constructor.", 2);
	description = new ArrayList<String>();
    Scanner descriptionInput;
    String path = "src/customerSearch/util/productDescriptions/" + FileEnums.Product7.getCode();

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

