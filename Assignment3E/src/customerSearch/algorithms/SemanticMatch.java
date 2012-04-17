package customerSearch.algorithms;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import customerSearch.util.Debug;

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

    //Gets the last word from each sentence
    //and puts it into an array list
    for(String first: searchStrings)
    {
    	String[] split = first.split(" ");
        result.add(split[split.length-1]);
    }

    //Takes every last word found found
    //and checks if it exists as a key
    //inside the hashmap
    for(String keyword : result)
    {

    	if(synonyms.containsKey(keyword))
    	{
    		//If it does, we search the description
    		//of the object with the value matching the key found
    		for(String sentence : description)
    		{

    			if(sentence.indexOf(synonyms.get(keyword)) != -1)
    	    	          Debug.dprint(sentence, 1);

    		}


  	}


    }
  }


}

