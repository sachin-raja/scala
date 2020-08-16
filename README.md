# Learning Scala
Scala is a general-purpose programming language. 
It supports object oriented, functional and imperative programming approaches. \ 
It is a strong static type language. \
In Scala, everything is an object whether it is a function or a number. \
It does not have concept of primitive data. \

File extension of scala source file may be either .scala or .sc \

You can create any kind of application like web application, enterprise application, mobile application, desktop based application etc.\

Creating the project: \
    - Open up IntelliJ and click File => New => Project \
    - On the left panel, select Scala. On the right panel, select IDEA.\
    - Name the project sample \
    - Assuming this is your first time creating a Scala project with IntelliJ, you’ll need to install a Scala SDK. To the right of the Scala SDK field, click the Create button. \
    - Select the highest version number (e.g. 2.13.3) and click Download. This might take a few minutes but subsequent projects can use the same SDK. \
    - Once the SDK is created and you’re back to the “New Project” window click Finish.

In intellij use the Scala plugin and sbt\

A typical Scala Directory Structure: \
  - .idea (IntelliJ files) \
  - project (plugins and additional settings for sbt) \
  - src (source files) \
      - main (application code) \
          - java (Java source files) \
          - scala (Scala source files) <-- This is all we need for now \
          - scala-2.13 (Scala 2.13 specific files) \
      - test (unit tests) \
  - target (generated files) \
  - build.sbt (build definition file for sbt) \
