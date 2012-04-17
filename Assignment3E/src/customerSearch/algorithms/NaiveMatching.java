package customerSearch.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import customerSearch.util.Debug;

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
    	  String[] splitSentence = sentence.split(" ");

    	  for(String word: splitSentence)
    	  {
    	      if(word.compareToIgnoreCase(search) == 0)
              Debug.dprint(sentence, 1);
    	  }
      }
    }
  }
}

