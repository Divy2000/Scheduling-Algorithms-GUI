# Scheduling-Algorithms-GUI
This is a small college project regarding the visualization of the scheduling algorithms with GUI input and output. It is also have visualization in graph. 
Programming Language - JAVA
Development kit - Java Development Kit (JDK)
Development IDE - Netbeans
Minimum requirement to run the program :-
JRE 8 or higher.
Minimum requirements to open the project and review the code :-
JDK 8 or higher and Netbeans

Installing JRE :-
https://java.com/en/download/
Download and run the installer from the given link.
Installing JDK and Netbeans :-
Only required if you want to review the code of the program.
1. Installing JDK :-
● https://www.oracle.com/java/technologies/javase-jdk15-downloads.html
Download the JDK exe file from this link and run the installer.
● Setting path variable :-
To set the PATH variable on Microsoft Windows:
1. Select Control Panel and then System.
2. Click Advanced and then Environment Variables.
3. Add the location of the bin folder of the JDK installation to the PATH variable in System
Variables.
● The following is a typical value for the PATH variable:
C:\WINDOWS\system32;C:\WINDOWS;"C:\Program Files\Java\jdk-10\bin"
Put your jdk version in jdk-xx if it's not 10.

2. Installing Netbeans :-
● https://netbeans.apache.org/download/index.html , download and run the Netbeans
installer(LTS version) from this site, it will automatically select the java installation path
and you can choose the workspace of your choice or let it be the default one.

Instructions to launch and use our program and use it :-

● You can open netbeans IDE,
● Files > Import project > From ZIP > go to the downloaded zip file, select
and import.
● You will also be able to review different code files in the GUI package.
● Run the project by clicking F6.

B. After you have opened the program you can select the algorithm you want to run, give
inputs in the text fields above the table and click add to add in the table.
(you can leave the text field as it is or blank if you want that input to be zero)
C. After you have entered all the desired inputs and added them to the table, click execute
to get CT, TAT and WT according to the scheduling algorithm you choose.
D. You can also edit the entries after adding it to the table and double-clicking the cell you
want to edit, then click execute to get the output according to the new edited entries.

Instructions Guiding through our code :-

A. Once you import the project and open it in the IDE as mentioned above in poin
number A.(2.). You will get two packages in the code named GUI and
Resources.
B. GUI contains the main .java files and the code of jframes, while resources
contains one image which we have used in our main page.
C. In GUI, mainPage.java is our main file you can double click it and go to the
design section, there you can double click any button to review the code which
directs you to the respective jFrame.
D. When you review the code of the particular jFrames, you can review the code of
each button there by double clicking it from the design tab.
E. Text Fields : Each text field is having its behavioral code in onFocusGain and
onFocusLost methods, which you will find in the events section in properties, you
can double click and review that code there.

F. Add button has the code to add each row to the table according to the input, it
also has code to automatically set zero as default value, if no input is given.
G. Remove button is having the code to remove the last entry of the table.
H. Clear button is having the code to remove all entries from the table and clear the
data.
I. Execute button of each JFrame is having the main algorithm to take the data
from the table and give the output to the table.
In the case of Round Robin, this is having the code to set Time Quantum to 1
by default if no value is given.
J. Back button is having the code to direct you back to the main algorithm
selection page.
K. Fetch Data button by clicking this button you will be able to fetch the data
executed previously, to implement this, we made a custom class named
dataMobility.java and overridden constructors of every jForm to pass the variable
throughout the execution of the project.
L. Remove I/O button by clicking this button, all the I/O time of all processes
automatically becomes zero, so there is no need for manual input.
M. Remove B.T. 2 button using this button you can turn burst times after I/O to
zero of all processes present in the table.
N. After clicking any of the two buttons, the data of the table will not be saved in the
memory to fetch for that particular execution.
