package customerSearch.products.Version4;

import java.util.ArrayList;

import customerSearch.util.ProductVisitor;

public abstract class SeaGateDriveV4 {
		
	ArrayList description;
		
	  public ArrayList<String> getDescription()
	  {
	    return description;
	  }
	  public void accept(ProductVisitor visitor)
	  {
	    visitor.visit(this);
	  }
}
