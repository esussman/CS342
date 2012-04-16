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
		Scanner synonymScanner;
		Scanner userInput;
		String result[];

		synonyms = new HashMap<String,String>();
		try {
			  synonymScanner = new Scanner(new File(".\\synonyms.txt"));
			  userInput = new Scanner(new File(".\\userInputs.txt"));

		      while (synonymScanner.hasNextLine()) {

		    	  result = synonymScanner.nextLine().split(":");

		    	  //Debug - Print synonym hash table out
		    	 // System.out.println(result[0] + ":" + result[1]);
		    	  synonyms.put(result[0], result[1]);

		      }
          while (userInput.hasNextLine()) {
            searchStrings.add(userInput.nextLine());
          }
        synonymScanner.close();
        userInput.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally{

		}
	}

  public  void search(ArrayList<String> description)
  {

		// String result[] = needle.split(" ");

		// //Debug
		// //System.out.println(result[0]);

		// String keyword = result[result.length-1];

		// if(synonyms.containsKey(keyword))
		// {

			// //Use
			// if(haystack.indexOf(synonyms.get(keyword)) != -1)
			// {
				// System.out.println(haystack);
			// }

		// }


  }
}

