# Developer Manual
This manual details how to get a developement environment going on a new machine as well as explaining how Travis, Heroku and other services relate to our solution.







About the project:

The project is a web application that plays the game TicTacToe. TicTacToe is an old and famous game that revolves around two players playing on a 3x3 board. Each player plays with an X or an O and take turn placing their character in one of the 3x3 Squares. A game can be won by either players or the game can be a draw. The game is won when a player has either 3 of his characters vertically or horizontally or incline. The game is a draw when all 9 squares have been filled and no wins are made. Two players can play in our game.


#Development manual: 
what is needed and how to get the project to
build on a fresh machine, Source control client and access to source
control Build environment, Other necessary dependencies for
development.




To get the project you can either fork it or clone it to your folder of choosing (https://github.com/GitExersiceHnetumjor/sidannarverkefni). To be able to run our program you must have the java developer kit installed. If you do not have it installed you can install it from (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). To be able to run our game you must also have a gradle wrapper since it runs all the tests and game. To run the game simply go to the root of the project and type “gradle build”. This will allow you to go to http://localhost:4567/ where you can play the game. 

Administration manual: How to set it up and get it to run, also on a
fresh machine. How to install and run the program on clients machine
(in case of simple desktop program). How to deploy, run and maintain
in case of client/server or web application.

Design report:


@@ -1 +1,41 @@
DefReport.md


# Developers Manual

In order to push changes to this project you must get permission from the project o


About the project:

This repository contains a web application that plays the game TicTacToe. 

//TicTacToe is an old and famous game that revolves around two players playing on a 3x3 board. Each player plays with an X or an O and take turn placing their character in one of the 3x3 Squares. A game can be won by either players or the game can be a draw. The game is won when a player has either 3 of his characters vertically or horizontally or incline. The game is a draw when all 9 squares have been filled and no wins are made. Two players can play in our game.

Development manual: 
what is needed and how to get the project to
build on a fresh machine, Source control client and access to source
control Build environment, Other necessary dependencies for
development.

The source code is hosted on github
	(https://github.com/GitExersiceHnetumjor/sidannarverkefni)

## Dependencies
..* [Travis](http://travis-ci.org)
..* [jUnit](http://junit.org/junit5/)
..* [Spark](http://sparkjava.com/)
..* [Heroku](http://heroku.com)


Setting up
1. Make sure you have java [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed,
2. Install git and configure git environmental variables. See instructions on installing git [here](https://help.github.com/articles/set-up-git/) and instructions for configuring environment variables [here](http://www.chambaud.com/2013/07/08/adding-git-to-path-when-using-github-for-windows/)
3.   

To get the project you can either fork it or clone it to your folder of choosing (https://github.com/GitExersiceHnetumjor/sidannarverkefni). To be able to run our program you must have the java developer kit installed. If you do not have it installed you can install it from (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html). To be able to run our game you must also have a gradle wrapper since it runs all the tests and game. To run the game simply go to the root of the project and type “gradle build”. This will allow you to go to http://localhost:4567/ where you can play the game. 

Administration manual: How to set it up and get it to run, also on a
fresh machine. How to install and run the program on clients machine
(in case of simple desktop program). How to deploy, run and maintain
in case of client/server or web application.