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
      userInput = new Scanner(new File("userInputs.txt"));
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

    ArrayList<String> result = new ArrayList<String>();
    for(String first: searchStrings)
      result.add(first.split(" ")[0]);

    for (String search: result)
    {
      for(String sentence: description)
      {
        if(sentence.indexOf(search) != -1)
          System.out.println(sentence);
      }
    }
		// if(haystack.indexOf(result[0]) != -1)
		// {
			// System.out.println(haystack);
		// }


  }
}

