package customerSearch.driver;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import customerSearch.algorithms.SearchStrategy;
import customerSearch.algorithms.SemanticMatch;

class Driver
{
	
	
	
	public static void main(String[] args)
	{
		
	    Scanner userInput;
		try {
			userInput = new Scanner(new File(".\\userInputs.txt"));
			
		      while (userInput.hasNextLine()) {
		    	  
		    	  System.out.println(userInput.nextLine());
		      }
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			
		}

		
		SearchStrategy test = new SemanticMatch();
		
		//test.search("problem detecting the drive", "If Windows 7 has a problem detecting the drive, it could be that the portable drive is not receiving enough power.");
		
		//ArrayList userInput = new ArrayList();
		
	}
	
	
	
	
	
}