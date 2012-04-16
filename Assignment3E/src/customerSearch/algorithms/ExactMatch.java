package customerSearch.algorithms;

public class ExactMatch implements SearchStrategy
{
  public void search(String needle, String haystack)
  {
	
	  
	  if(haystack.indexOf(needle) != -1 )
	  {
		  System.out.println(haystack);
	  }
	  
  }
}
