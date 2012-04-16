package customerSearch.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class NaiveMatching implements SearchStrategy
{
  ArrayList<String> searchStrings;
  public NaiveMatching()
  {
    searchStrings = new ArrayList<String>();
    Scanner userInput;
    try {
      userInput = new Scanner(new File(".\\userInputs.txt"));
          while (userInput.hasNextLine()) {
            searchStrings.add(userInput.nextLine());
          }
    }
    catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    finally{

    }
  }
  public void search(ArrayList<String> description)
  {

		// String result[] = needle.split(" ");

		// //Debug
		// //System.out.println(result[0]);

		// if(haystack.indexOf(result[0]) != -1)
		// {
			// System.out.println(haystack);
		// }


  }
}

