CS542 Design Patterns
Spring 2011
PROJECT 3 README FILE

Due Date: Monday, April 16th, 2012
Submission Date: Monday, April 16th, 2012
Grace Period Used This Project: 0 Days
Grace Period Remaining: ??? Days
Author(s): Renan DelValle, Evan Sussman
e-mail(s): rdelval1@binghamton.edu, esussma1@binghamton.edu


PURPOSE:

The purpose of this program is correctly identify and 
implement the design patterns needed to create
a software troubleshooting program for hard drives.

PERCENT COMPLETE:

I believe I have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:


BUGS:

None.

FILES:

	SearchStrategy.java, contains interface for all search strategies.
	ExactMatchStrategy.java, contains an Exact Match search algorithm. Extends SearchStrategy.
	NativeMatchStrategy.java, contains a Native Match search algorithm. Extends SearchStrategy.
	SemanticMatchStrategy.java, contains a Semantic Match search algorithm. Extends SearchStrategy.
	Driver.java, contains driver code.
	SeaGateDrive[1-3].java, contain implementations of a V1 hard drive model.
	SeaGateDrive[4-6].java, contain implementations of a V2 hard drive model.
	SeaGateDrive[7-9].java, contain implementations of a V3 hard drive model.
	SeaGateDrive[10-12].java, contain implementations of a V4 hard drive model.
	ProductVistor.java, contains interface for creating product visitors.
	CompleteSearchVisitor.java, contains implementation of a visitor for all drives with all 3 searches. Implements ProductVisitor.java 
	Debug.java, defines debug number.
	FileEnums.java, defines names of text files that describe the hard drives.
	products[1-12].txt contain product descriptions.
	README.txt, the file that you're reading right now
	synonyms.txt, file that contains synonyms
	userInputs.txt,file that emulates multiple input made by a user

SAMPLE OUTPUT:

[
  Copy and paste a recent CORRECT output from your test runs, ALONG with the
  command line. Cut it short if more than 10 lines. Here is a sample:

  [erdil@the_caribbean:~erdil]$ ./a.out topaz 12345 binaenaleyh
  SOME OUTPUT
  SOME MORE
  WOW, IT DOES NOT END
  [snip here] (-> if too long)
  OH MY..
  FINALLY
  [erdil@the_caribbean:~erdil]$
]

TO COMPILE:

[
  Document here how your TA can build your program after extracting your
  gzipped-tarball. (Note: ideally, TA should just do a "make". Justify extra
  steps needed). Be as clear as possible, refer to "... FOR DUMMIES" book
  format. Assume your TA is completely lost, trying to save the universe.
  Here is a sample:

  Just extract the files and then do a "make".
]

TO RUN:

[
  Document here how your TA can test your program after extracting your gzipped-
  tarball. Be as clear as possible, refer to "... FOR DUMMIES" book format.
  Assume your TA is completely lost, there is another universe. Here is a
  sample:

  Please run as: ./a.out <REGHOST> <REGPORT> <UNIQNAME>
  For example:   ./a.out topaz 12345 binaenaleyh
]

EXTRA CREDIT:

N/A


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
<NAMES OF GROUP MEMBERS>

[
  Document here any sources, books, internet resources you have benefited from.

  Here are some samples:

  * http://spring2004.cs654.allprojectsolutions.binghamtonuniversity.com

  * Deitel, H. M., and Deitel P. J. Java How To Program 3/E. Upper Saddle River:
    Prentice Hall, 1999 (pp. 385-369)
]

ACKNOWLEDGEMENT:

