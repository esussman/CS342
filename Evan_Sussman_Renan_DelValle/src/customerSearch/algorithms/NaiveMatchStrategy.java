package customerSearch.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import customerSearch.util.Debug;

public class NaiveMatchStrategy implements SearchStrategy
{
  ArrayList<String> searchStrings;
  public NaiveMatchStrategy()
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
    Debug.dprint("Entering Naive Match Search", 4);
    ArrayList<String> result = new ArrayList<String>();
    for(String first: searchStrings)
      result.add(first.split(" ")[0]);

    for (String search: result)
    {

      for(String sentence: description)
      {
    	  String[] splitSentence = sentence.split(" ");

    	  for(String word: splitSentence)
    	  {
    	      if(word.compareToIgnoreCase(search) == 0)
              Debug.dprint(sentence, 1);
    	  }
      }
    }
    Debug.dprint("Exiting Naive Match Search", 4);
  }
}

