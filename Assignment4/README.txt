CS542 Design Patterns
Spring 2011
PROJECT 4 README FILE

Due Date: Thursday, May 3rd, 2012
Submission Date: Thursday, May 3rd, 2012
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
	Performance.java - Creates a performance instance to be passed to the performance tab and then to the display.
	Process.java - Creates a process instance to be passed to the performance tab and then to the display.
	User.java - Creates a user instance to be passed to the user tab and then to the display.
	Display.java - Interface which defines requirements for a display.
	StandardOut.java - Implementation of standard out display. Observes all tab instances.
	Driver.java - Code for execution. Creates and runs the task manager.
	SubjectFileReader.java - Observable instance which parses input files and notifies specific observer tab there is an update.
	Tab.java - Interface class which defines what a tab is.
	ProcessTab.java - Implementation of tab to handle Process types. Observes file reader.
	PerformanceTab.java - Implementation of tab to handle Performance types. Observes file reader.
	UserTab.java - Implementation of tab to handle User types. Observes file reader.
	Debug.java - Defines static value for Debug level.

SAMPLE OUTPUT:

prepare:

TaskManager:

compile:

jar:

run:
     [java] sending info to user tab
     [java] Username Evan Status = active
     [java] sending info to Process tab
     [java] Process Name Photoshop User Name Renan CPU 1 Memory 65 Description Image editing software
     [java] sending info to Performance tab
     [java] Current Memory Usage 256 Current Cpu Usage 50 Total Physical Memory1024 Total Cached 128
     [java] sending info to user tab
     [java] Username Kenneth Status = inactive
     [java] sending info to Process tab
     [java] Process Name Firefox User Name Evan CPU 2 Memory 300 Description Web browser
     [java] sending info to Performance tab
     [java] Current Memory Usage 300 Current Cpu Usage 76 Total Physical Memory 1024 Total Cached 128
     [java] sending info to Process tab
     [java] Process Name Internet Explorer 6.0 User Name Anderew CPU 3 Memory 600 Description Horrible web browser
     [java] sending info to Performance tab
     [java] Current Memory Usage 256 Current Cpu Usage 50 Total Physical Memory 1024 Total Cached 128
     [java] sending info to Performance tab
     [java] Current Memory Usage 1024 Current Cpu Usage 90 Total Physical Memory 1024 Total Cached 128
     [java] sending info to user tab
     [java] Username Andrew Status = disconnected
     [java] sending info to Process tab
     [java] Process Name Gtalk User Name Kenneth CPU 4 Memory 20 Description Chat program
     [java] sending info to user tab
     [java] Username Renan Status = active

TO COMPILE:

  ant compile

TO RUN:


  ant run

EXTRA CREDIT:

N/A


BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
Renan DelValle
Evan Sussman

ACKNOWLEDGEMENT:
Kenneth Louie
Andrew Marshall

