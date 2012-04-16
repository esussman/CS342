package customerSearch.driver;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

		
		
		//ArrayList userInput = new ArrayList();
		
	}
	
	
	
	
	
}