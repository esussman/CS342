package customerSearch.util;


import customerSearch.algorithms.ExactMatch;
import customerSearch.algorithms.NaiveMatching;
import customerSearch.algorithms.SearchStrategy;
import customerSearch.algorithms.SemanticMatch;
import customerSearch.products.Version1.SeaGateDriveV1;
import customerSearch.products.Version2.SeaGateDriveV2;
import customerSearch.products.Version3.SeaGateDriveV3;

public class CompleteSearchVisitor implements ProductVisitor
{
  public void visit(SeaGateDriveV1 drive)
  {
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV2 drive)
  {
    SearchStrategy exactMatch = new ExactMatch();
     exactMatch.search(drive.getDescription());

    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV3 drive)
  {
    SearchStrategy exactMatch = new ExactMatch();
     exactMatch.search(drive.getDescription());

    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
}
