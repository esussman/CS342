package customerSearch.products.Version1;

import java.util.ArrayList;
import customerSearch.util.ProductVisitor;


public abstract class SeaGateDriveV1
{
  ArrayList<String> description;
  public ArrayList<String> getDescription()
  {
    return description;
  }
  void accept(ProductVisitor visitor)
  {
    visitor.visit(this);
  }
}

