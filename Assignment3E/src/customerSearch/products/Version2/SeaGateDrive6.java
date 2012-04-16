package customerSearch.products.Version2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import customerSearch.util.FileEnums;
import java.util.ArrayList;

public class SeaGateDrive6 extends SeaGateDriveV2
{
  SeaGateDrive6()
  {
    description = new ArrayList();
    Scanner descriptionInput;
    String path = ".\\" + FileEnums.Product6.getCode();
    System.out.println("THIS IS THE PATH   " + path);
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

