Development Manual for TicTactoe
=========
 
Our application is hosted as an open repository on github.com on the following url: https://github.com/AADOJ/Late-Term-Assignment. You will need jdk 1.7 installed on your machine in order to deploy and run our application.
  
You can use the native git command to clone the repository to your machine from the console by running the following command:
```sh
git clone https://github.com/AADOJ/Late-Term-Assignment.git
```
Or you can go the above url and download a zip file containing the application.
  
The workflow is based on everyone having their own branch, so if you work on this project you should do the following:
 
1. Make changes to code, run gradle check (compiles and runs all unit tests) by writing either:
```sh
./gradlew check // for *nix
gradlew check   // for windows
```

2. If you see “BUILD SUCCESSFUL” on the screen you should commit your changes.

3. In order to merge your changes with the ‘develop’ branch, push your commits onto the remote branch, log into github.com and create pull request. Then some other team member must view your changes and wait for a response from Travis before your changes are merged with the ‘develop’ branch.
     
4. You don’t really need Gradle to build the project, the gradle wrapper (“./gradlew”) contains all the necessary commands you need. But you do need jdk 7 (java development kit). You can build the project by running either of the following commands on the command line:
```sh
./gradlew build // for *nix
gradlew build   // for windows
```
      
Version
----

2.0
