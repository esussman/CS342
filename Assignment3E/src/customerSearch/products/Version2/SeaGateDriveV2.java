package customerSearch.products.Version2;

import java.util.ArrayList;

import customerSearch.util.ProductVisitor;

public abstract class SeaGateDriveV2
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

