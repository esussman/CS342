package customerSearch.algorithms;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class SemanticMatch implements SearchStrategy
{
  HashMap<String, String> synonyms;
  ArrayList<String> searchStrings;
  public SemanticMatch()
  {
    searchStrings = new ArrayList<String>();
    Scanner synonymScanner;
    Scanner userInput;
    String result[];

    synonyms = new HashMap<String,String>();
    try {
        synonymScanner = new Scanner(new File("synonyms.txt"));
          while (synonymScanner.hasNextLine()) {

            result = synonymScanner.nextLine().split(":");

            //Debug - Print synonym hash table out
           // System.out.println(result[0] + ":" + result[1]);
            synonyms.put(result[0], result[1]);

          }
        synonymScanner.close();
    }
    catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    finally{
    }

    try
    {
        userInput = new Scanner(new File("userInputs.txt"));
          while (userInput.hasNextLine())
          {
            searchStrings.add(userInput.nextLine());
          }
        userInput.close();
    }
    catch(FileNotFoundException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    finally
    {
    }
  }

  public  void search(ArrayList<String> description)
  {

    ArrayList<String> result = new ArrayList<String>();
    for(String first: searchStrings)
    {
      String splitSpace[] = first.split(":");
      String keyword = splitSpace[splitSpace.length-1];
      if(synonyms.containsKey(keyword))
      {
        for(String sentence: description)
        {
          if(sentence.indexOf(synonyms.get(keyword)) != -1)
            System.out.println(sentence);
        }
      }
    }
  }


}

