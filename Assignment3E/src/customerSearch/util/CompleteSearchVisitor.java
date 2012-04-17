package customerSearch.util;


import customerSearch.algorithms.ExactMatch;
import customerSearch.algorithms.NaiveMatching;
import customerSearch.algorithms.SearchStrategy;
import customerSearch.algorithms.SemanticMatch;
import customerSearch.products.Version1.SeaGateDriveV1;
import customerSearch.products.Version2.SeaGateDriveV2;
import customerSearch.products.Version3.SeaGateDriveV3;
import customerSearch.products.Version4.SeaGateDriveV4;
import customerSearch.util.Debug;

public class CompleteSearchVisitor implements ProductVisitor
{
  public void visit(SeaGateDriveV1 drive)
  {
    Debug.dprint("Exact Match", 1);
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    Debug.dprint("Naive Match", 1);
    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    Debug.dprint("Semantic Match", 1);

    SearchStrategy semanticMatch = new SemanticMatch();
    semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV2 drive)
  {
    Debug.dprint("Exact Match", 1);
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    Debug.dprint("Naive Match", 1);

    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    Debug.dprint("Semantic Match", 1);

    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV3 drive)
  {
    Debug.dprint("Exact Match", 1);
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    Debug.dprint("Naive Match", 1);

    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    Debug.dprint("Semantic Match", 1);

    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV4 drive)
  {
    Debug.dprint("Exact Match", 1);
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    Debug.dprint("Naive Match", 1);

    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    Debug.dprint("Semantic Match", 1);

    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
}

