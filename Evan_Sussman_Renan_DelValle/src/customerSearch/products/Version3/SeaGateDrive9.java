package customerSearch.products.Version3;

import java.io.File;
import java.io.FileNotFoundException;
import customerSearch.util.Debug;
import java.util.Scanner;
import customerSearch.util.FileEnums;
import java.util.ArrayList;
public class SeaGateDrive9 extends SeaGateDriveV3
{
  public SeaGateDrive9()
  {
  Debug.dprint("Inside " + this.getClass().getName() + " constructor.", 2);
	description = new ArrayList<String>();
    Scanner descriptionInput;
    String path = "src/customerSearch/util/productDescriptions/" + FileEnums.Product9.getCode();
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

