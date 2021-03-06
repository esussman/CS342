
package toyThreads.driver;

import toyThreads.primeFactors.Factorizer;
import java.lang.Thread;
import toyThreads.util.Debug;
import toyThreads.primeFactors.Results;

public class Driver {

    public static void main(String args[]) {

  int primeToTest=0, numberOfThreads=0, debugValue=0;
  if (args.length != 3) {
      System.err.println("Usage is: ant compile [PRIME_NUMBER] [NUMBER_OF_THREADS] [DEBUG_LEVEL} \n");
      System.exit(-1);
  } // end args check
  try {
      primeToTest= Integer.parseInt(args[0]);
      numberOfThreads = Integer.parseInt(args[1]);
      debugValue = Integer.parseInt(args[2]);
      verifyInputs(primeToTest, numberOfThreads, debugValue);
  } catch (NumberFormatException e) {
      System.err.println("All arguments must be integers");
      System.exit(1);
  }
  finally
  {
  }

  // FIXME: set the DEBUG_VALUE in Debug.java
  Debug.DEBUG_VALUE = debugValue;
  // FIXME:
  // if DEBUG_LEVEL is greater than 2, print all the argument received
  printArguments(primeToTest, numberOfThreads, debugValue);

  // FIXME: create numberOfThreads and to each thread pass an instance of Factorizer as argument
  int start = 1;
  int end = primeToTest / numberOfThreads;
  Thread[] threads = new Thread[numberOfThreads];
  for(int threadNum = 0; threadNum < numberOfThreads; threadNum++)
  {
    if(threadNum == numberOfThreads - 1)
      end = primeToTest;
    threads[threadNum] = new Thread(new Factorizer(threadNum, primeToTest, start , end));
    threads[threadNum].start();
    start = end + 1;
    end += end;
  }

  try {
      // FIXME: wait for the threads to get done
      // adjust this sleep duration as needed
      for(int i = 0; i < numberOfThreads; i++)
      {
        threads[i].join();
      }
      //Thread.sleep(100);
  } catch (InterruptedException ie) {
      // interruption of the main thread is fatal, so exit
      ie.printStackTrace();
      System.exit(-1);
  }
  // FIXME; print the factors using the printFactors() method
        // of the Results class


  System.out.println("\n Good Bye \n");

    } // end main(...)
  private static void printArguments(int primeNum, int numThreads, int debugVal)
  {
    String message = "Prime number is " + primeNum +
      "\nNumber of threads to run is " + numThreads + "\nDebug value is " + debugVal;
    Debug.dprint(message, debugVal);
  }
  private static void verifyInputs(int primeToTest, int numberOfThreads, int debugValue)
  {
     if(primeToTest < 1){
       System.err.println("Please enter a positive number to be factored");
       System.exit(1);
      }
    if(numberOfThreads > 5 || numberOfThreads < 1){
      System.err.println("The number of threads must be between 1 and 5");
      System.exit(1);
    }
    if(debugValue > 10 || debugValue < 5){
      System.err.println("The debug value must be between 5 and 10");
      System.exit(1);
    }
  }
}

