package customerSearch.products.Version1;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import customerSearch.util.FileEnums;

public class SeaGateDrive3 extends SeaGateDriveV1
{
  SeaGateDrive3()
  {
    description = new ArrayList();
    Scanner descriptionInput;
    String path = ".\\" + FileEnums.Product3.getCode();
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
