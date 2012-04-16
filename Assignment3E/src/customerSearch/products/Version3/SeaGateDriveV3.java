package customerSearch.products.Version3;

import java.util.ArrayList;

import customerSearch.util.ProductVisitor;

public abstract class SeaGateDriveV3
{
  ArrayList description;
  public ArrayList<String> getDescription()
  {
    return description;
  }
  void accept(ProductVisitor visitor)
  {
    visitor.visit(this);
  }
}

