package customerSearch.algorithms;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExactMatch implements SearchStrategy
{
  ArrayList<String> searchStrings;
  public ExactMatch()
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

    for (String search: searchStrings)
    {
      for(String sentence: description)
      {
        if(sentence.indexOf(search) != -1)
          System.out.println(sentence);
      }
    }
    /*
    if(haystack.indexOf(needle) != -1 )
    {
      System.out.println(haystack);
    }
    */
  }
}
