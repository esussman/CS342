CS542 Design Patterns
Spring 2011
PROJECT 4 README FILE

Due Date: Thursday, May 3rd, 2012
Submission Date: Monday, April 16th, 2012
Grace Period Used This Project: 0 Days
Grace Period Remaining: ??? Days
Author(s): Renan DelValle, Evan Sussman
e-mail(s): rdelval1@binghamton.edu, esussma1@binghamton.edu


PURPOSE:

The purpose of this assignment was to create 
a pseudo task manager. The events are read from
an input file and the pertinent tabs are notified
that new information is available that pertains to them.

PERCENT COMPLETE:

We believe we have completed 100% of this project.

PARTS THAT ARE NOT COMPLETE:


BUGS:

None.

FILES:

	build.xml - File used to build the project through ANT.
	README.txt - The file that you are currently reading.
	Performance.java - Creates a performance instance to be passed to the performance tab.
	Process.java - Creates a process instance to be passed to the performance tab.
	User.java - Creates a user instance to be passed to the user tab.
	Display.java - Interface which defines requirements for a display.
	StandardOut.java - Implementation of standard out display.
	Driver.java - Code for execution. Creates and runs the task manager.
	SubjectFileReader.java - Observable instance which parses input files and notifies specific observer tab there is an update.
	
	

SAMPLE OUTPUT:

[
~/Code/CS342/Assignment3E[master]% ant run    
Buildfile: /Users/esussman/Code/CS342/Assignment3E/build.xml

jar:
      [jar] Building jar: /Users/esussman/Code/CS342/Assignment3E/build/jar/customerSearch.jar

run:
     [java] A dual core processor is needed to enable feature X on the hard drive.
     [java] A minimum of 128 MB of memory is needed to run feature X on hard drive.
     [java] A dual core processor is needed to enable feature X on the hard drive.
     [java] A minimum of 128 MB of memory is needed to run feature X on hard drive.
     [java] This product is compatible with Microsoft Windows XP.
     [java] This product is compatible with Microsoft Windows Vista.
     [java] This product is compatible with Microsoft Windows XP.
     [java] This product is compatible with Microsoft Windows Vista.
     [java] This product is compatible with Microsoft Windows XP.
     [java] This product is compatible with Microsoft Windows Vista.
     [java] This product carries a lifetime warranty.
     [java] The 160GB version of the V1 has 64MB cache memory.
     [java] This product carries a lifetime warranty.
     [java] The 160GB version of the V1 has 64MB cache memory.
     [java] This product has support for Thunderbolt interface.
     [java] This product has support for Firewire interface.
     [java] This product has support for Thunderbolt interface.
     [java] This product has support for Firewire interface.
     [java] This product is SATA III compatible.
     [java] This product is a 128GB portable drive.
     [java] This product is incompatible with the Mac operating system.
     [java] This product is compatible with the Ubuntu operating system.
     [java] The USB speeds of this devices top out at 300MB/s.
     [java] This product requires the motherboard to have a bus of at least 1GB/s.
     [java] The USB speeds of this devices top out at 300MB/s.
     [java] The USB speeds of this devices top out at 300MB/s.
     [java] This product is not compatible with the SCSI interface
     [java] This product uses 8W of power
     [java] This product is not compatible with the SCSI interface
     [java] This product is compatible with the universal serial bus specification.
     [java] This product has a speed rating of 7200 rotations per minute.
     [java] This product is compatible with the universal serial bus specification.
     [java] The speed of this product has no bearing on the random access memory speed.
     [java] The speed of this product has no bearing on the random access memory speed.
     [java] This product comes pre-formatted with File Allocation Table formatting.
     [java] This product is a 74GB Hard Drive Disk.
     [java] This device does not support the Integrated Drive Electronics interface.
     [java] This product is a 74GB Hard Drive Disk.
     [java] No specific central processing unit is necessary for this product.
     [java] This drive comes with no bundled applications.
]

TO COMPILE:

[

  ant compile
]

TO RUN:

[

  ant run
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

