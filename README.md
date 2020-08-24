# About
This document details how to run and test the Java code on your local machine, including installing the necessary software dependencies.

## 1. Download and extract Java files
Either issue a `pull` request, or download the  mc_coding_challenge_1 repo to your local machine and extract the contents to a convenient location. 

## 2. Install a Java IDE (IntelliJ)
The code was written and tested using version 2018.2.6 of the [Community edition of IntelliJ for Windows](https://www.jetbrains.com/idea/download/#section=windows). 

When installing, accept all of the defaults.

Other IDEs are available, however the remainder of the instructions may be different.

## 3. Import the Java project into IntelliJ
1. Launch IntelliJ, selecting `Do not import settings` for the initial pop-up, and `Skip Remaining and Set Defaults` on the next screen.
2. When the IntelliJ home screen has launched, select `File`, `new`, `project from existing sources` and navigate to the `mc_coding_challenge_1` folder from step 1, which contains `src` immediately underneath it.
3. Accept all defaults until reaching the `Select SDK` screen. Here, click the `+` icon, JDK, and navigate to the JDK folder. This may be something like `C:\Program Files (x86)\Java\jdk-11.0.1`. If you do not have a JDK on your system, you can download one, e.g. [JDK 11](https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html).
4. Click `Finish`.

The `mc_coding_challenge_1` project should be visible in IntelliJ.

## 4. Download and import the library dependencies
To run the tests for this project you will need a number of client libraries in order to work. These are built into intelliJ and can be found in the lib folder for the install

For example they may be in the path below:

1. C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.2.6\lib\hamcrest-core-1.3.jar
2. C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2018.2.6\lib\junit-4.12.jar

### Importing
Only the following libraries are needed. The versions below are those used to originally test the code; later versions may also work.

To import these, select `File -> Project Structure -> Libraries` and select the `+` icon. `Ctrl+click` the below:

 1. `..\JetBrains\IntelliJ IDEA Community Edition 2018.2.6\lib\hamcrest-core-1.3.jar`
 2. `..\\JetBrains\IntelliJ IDEA Community Edition 2018.2.6\lib\junit-4.12.jar`

## 5. Build the project
1. Display `formatTimeMain.java` by navigating through the left-side project tree to `CodingChallenge/src/main/` and double-clicking on the file
2. Select `Build -> Build Project` from the toolbar, or press `Ctrl+F9`

## 6. Run the tests
1. Display `formatTimeTeests.java` by navigating through the left-side project tree to `CodingChallenge/src/main/` and double-clicking on the file
2. Select `Run -> Run formatTimeTests` from the toolbar, or press `Sft+F10`
