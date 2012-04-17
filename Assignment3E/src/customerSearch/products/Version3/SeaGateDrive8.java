package customerSearch.products.Version3;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import customerSearch.products.Version2.SeaGateDriveV2;
import customerSearch.util.FileEnums;

public class SeaGateDrive8 extends SeaGateDriveV3
{
  SeaGateDrive8()
  {
    description = new ArrayList();
    Scanner descriptionInput;
    String path = "src/customerSearch/util/productDescriptions/" + FileEnums.Product8.getCode();

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

