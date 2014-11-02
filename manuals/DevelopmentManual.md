Development Manual for TicTactoe
=========
 
 The source control client used for this project is GitHub. Our repository is public so anyone can access it at https://github.com/AADOJ/Late-Term-Assignment/
  
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
