package customerSearch.products.Version1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import customerSearch.util.FileEnums;
import java.util.ArrayList;
import customerSearch.util.Debug;

public class SeaGateDrive2 extends SeaGateDriveV1
{
  public SeaGateDrive2()
  {
  Debug.dprint("Inside " + this.getClass().getName() + " constructor.", 2);
	description = new ArrayList<String>();
    Scanner descriptionInput;
    String path = "src/customerSearch/util/productDescriptions/" + FileEnums.Product2.getCode();
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
