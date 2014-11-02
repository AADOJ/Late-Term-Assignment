Administration Manual for TicTacToe
=========
 
Our application is hosted as an open repository on github.com on the following url: https://github.com/AADOJ/Late-Term-Assignment. You will need jdk 1.7 installed on your machine in order to deploy and run our application.
  
You can use the native git command to clone the repository to your machine from the console by running the following command:
```sh
git clone https://github.com/AADOJ/Late-Term-Assignment.git
```
Or you can go the above url and download a zip file containing the application.
   
After having cloned the repository or download the zip file and unzipped it on your machine you can run the following command from the root folder of the repository.
    
For osx and linux users:
```sh
./gradlew installApp
```
For Windows users:
```sh
gradlew installApp
```

Upon receiving a message from the command line prompting you of an successful install you will need to run the following script which is located at:

For osx and linux users:
```sh
*project root*/build/install/Late-Term-Assignment/bin/LateTermAssignment
```
For Windows users:
```sh
*project root*/build/install/Late-Term-Assignment/bin/LateTermAssignment
```

This will run the application as a localhost server on the following url :
```sh
http://localhost:4567
```

You can now go this address and play our TicTacToe application.

Note when terminating the application from the command line you can still play in the browser but the application will not stop when a player has won a game.

###Heroku Deployment

To deploy the application you need the heroku toolbelt https://toolbelt.heroku.com/ and a heroku account. Make sure to create a ssh key for your computer if you haven´t already.

To begin with you need to clone the git repository (it is not sufficient to download the zip file)
You then need to input the following commands in the root of the project:
```sh
Heroku login
```
```sh
Heroku create appname
```
where appname is what you want your heroku app to be called. Note that you can skipp adding a name for the app and heroku will provide you with a random one

```sh
./gradlew installApp // for *nix
gradlew installApp   // for windows
```
```sh
git push heroku master
```

Version
----

2.0
