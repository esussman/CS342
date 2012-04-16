package customerSearch.products.Version2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import customerSearch.util.FileEnums;
import java.util.ArrayList;

public class SeaGateDrive7 extends SeaGateDriveV2
{
  SeaGateDrive7()
  {
    description = new ArrayList();
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

