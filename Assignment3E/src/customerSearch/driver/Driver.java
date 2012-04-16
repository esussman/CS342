package customerSearch.driver;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import customerSearch.algorithms.SearchStrategy;
import customerSearch.algorithms.SemanticMatch;

class Driver
{
	
	
	
	public static void main(String[] args)
	{
		
	    Scanner userInputScan;
	    ArrayList<String> userInput = new ArrayList<String>();
		try {
			userInputScan = new Scanner(new File(".\\userInputs.txt"));
			
		      while (userInputScan.hasNextLine()) {
		    	  
		    	  userInput.add(userInputScan.nextLine());
		      }
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			
		}

		
		SearchStrategy test = new SemanticMatch();
		
		test.search("processor", "If Windows 7 has a processor problem");
		
		//ArrayList userInput = new ArrayList();
		
	}
	
	
	
	
	
}