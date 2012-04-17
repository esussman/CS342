package customerSearch.util;


import customerSearch.algorithms.ExactMatch;
import customerSearch.algorithms.NaiveMatching;
import customerSearch.algorithms.SearchStrategy;
import customerSearch.algorithms.SemanticMatch;
import customerSearch.products.Version1.SeaGateDriveV1;
import customerSearch.products.Version2.SeaGateDriveV2;
import customerSearch.products.Version3.SeaGateDriveV3;
import customerSearch.products.Version4.SeaGateDriveV4;

public class CompleteSearchVisitor implements ProductVisitor
{
  public void visit(SeaGateDriveV1 drive)
  {
    System.out.println("Exact Match");
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    System.out.println("Naive Match");
    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    System.out.println("Semantic Match");
    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV2 drive)
  {
    System.out.println("Exact Match");
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    System.out.println("Naive Match");
    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    System.out.println("Semantic Match");
    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV3 drive)
  {
    System.out.println("Exact Match");
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    System.out.println("Naive Match");
    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    System.out.println("Semantic Match");
    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
  public void visit(SeaGateDriveV4 drive)
  {
    System.out.println("Exact Match");
    SearchStrategy exactMatch = new ExactMatch();
    exactMatch.search(drive.getDescription());

    System.out.println("Naive Match");
    SearchStrategy naiveMatch = new NaiveMatching();
     naiveMatch.search(drive.getDescription());

    System.out.println("Semantic Match");
    SearchStrategy semanticMatch = new SemanticMatch();
     semanticMatch.search(drive.getDescription());
  }
}

