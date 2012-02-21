
package toyThreads.primeFactors;
import java.util.Collections;
import java.util.List;
import toyThreads.util.Debug;
import java.util.ArrayList;
import java.util.Iterator;

public class Results {

    // FIXME: instantiate the arrayList here, instead of setting it to null;
    private static ArrayList<Integer> factorsFound = new ArrayList<Integer>();

    // FIXME: change this to a private constructor
    private Results() {}

    // FIXME: make this method thread-safe
    public static synchronized void addFactor(int newFactor) {
        factorsFound.add(newFactor);
    }

    public static void printFactors() {
	// FIXME: all the factors in the ArrayList should be printed here
      for(int fact = 0;  fact < factorsFound.size(); fact++)
        System.out.println(factorsFound.get(fact) + "\n");
    }
}
