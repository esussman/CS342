package customerSearch.util;

import customerSearch.products.Version1.SeaGateDriveV1;
import customerSearch.products.Version2.SeaGateDriveV2;
import customerSearch.products.Version3.SeaGateDriveV3;
import customerSearch.products.Version4.SeaGateDriveV4;

public interface ProductVisitor{

  public void visit(SeaGateDriveV1 drive);
  public void visit(SeaGateDriveV2 drive);
  public void visit(SeaGateDriveV3 drive);
  public void visit(SeaGateDriveV4 drive);

}
