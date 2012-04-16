package customerSearch.algorithms;

public class NaiveMatching implements SearchStrategy
{
  public void search(String needle, String haystack)
  {

	  String result[] = needle.split(" ");
	  
	  //Debug
	  //System.out.println(result[0]);
	  
	  if(haystack.indexOf(result[0]) != -1)
	  {
		  System.out.println(haystack);
	  }
	  
	  
  }
}

