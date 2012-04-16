package customerSearch.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class SemanticMatch implements SearchStrategy
{
	HashMap<String, String> synonyms;
	public SemanticMatch()
	{
		
	  
		Scanner userInput;
		String result[];
		
		synonyms = new HashMap<String,String>();
		try {
			  userInput = new Scanner(new File(".\\synonyms.txt"));
			
		      while (userInput.hasNextLine()) {
		    	  
		    	  result = userInput.nextLine().split(":");
		    	  
		    	  //Debug - Print synonym hash table out
		    	 // System.out.println(result[0] + ":" + result[1]);
		    	  synonyms.put(result[0], result[1]);
		    	  
		      }
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			
		}
	}
	
  public  void search(String needle, String haystack)
  {

	  String result[] = needle.split(" ");
	  
	  //Debug
	  //System.out.println(result[0]);
	  
	  String keyword = result[result.length-1];
	  
	  if(synonyms.containsKey(keyword))
	  {
		  
		  //Use 
		  if(haystack.indexOf(synonyms.get(keyword)) != -1)
		  {
			  System.out.println(haystack);
		  }
		  
	  }
	  

  }
}

