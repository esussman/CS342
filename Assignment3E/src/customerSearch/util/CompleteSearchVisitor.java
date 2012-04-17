package customerSearch.util;


import customerSearch.algorithms.ExactMatchStrategy;
import customerSearch.algorithms.NaiveMatchStrategy;
import customerSearch.algorithms.SearchStrategy;
import customerSearch.algorithms.SemanticMatchStrategy;
import customerSearch.products.Version1.SeaGateDriveV1;
import customerSearch.products.Version2.SeaGateDriveV2;
import customerSearch.products.Version3.SeaGateDriveV3;
import customerSearch.products.Version4.SeaGateDriveV4;
import customerSearch.util.Debug;

public class CompleteSearchVisitor implements ProductVisitor
{
  public void visit(SeaGateDriveV1 drive)
  {
    Debug.dprint("Exact Match", 3);
    SearchStrategy exactMatch = new ExactMatchStrategy();
    exactMatch.search(drive.getDescription());

    Debug.dprint("Naive Match", 3);
    SearchStrategy naiveMatch = new NaiveMatchStrategy();
     naiveMatch.search(drive.getDescription());

    Debug.dprint("Semantic Match", 3);

    SearchStrategy semanticMatch = new SemanticMatchStrategy();
    semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV2 drive)
  {
    Debug.dprint("Exact Match", 3);
    SearchStrategy exactMatch = new ExactMatchStrategy();
    exactMatch.search(drive.getDescription());

    Debug.dprint("Naive Match", 3);

    SearchStrategy naiveMatch = new NaiveMatchStrategy();
     naiveMatch.search(drive.getDescription());

    Debug.dprint("Semantic Match", 3);

    SearchStrategy semanticMatch = new SemanticMatchStrategy();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV3 drive)
  {
    Debug.dprint("Exact Match", 3);
    SearchStrategy exactMatch = new ExactMatchStrategy();
    exactMatch.search(drive.getDescription());

    Debug.dprint("Naive Match", 3);

    SearchStrategy naiveMatch = new NaiveMatchStrategy();
     naiveMatch.search(drive.getDescription());

    Debug.dprint("Semantic Match", 3);

    SearchStrategy semanticMatch = new SemanticMatchStrategy();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV4 drive)
  {
    Debug.dprint("Exact Match", 3);
    SearchStrategy exactMatch = new ExactMatchStrategy();
    exactMatch.search(drive.getDescription());

    Debug.dprint("Naive Match", 3);

    SearchStrategy naiveMatch = new NaiveMatchStrategy();
     naiveMatch.search(drive.getDescription());

    Debug.dprint("Semantic Match", 3);

    SearchStrategy semanticMatch = new SemanticMatchStrategy();
     semanticMatch.search(drive.getDescription());
  }
}

