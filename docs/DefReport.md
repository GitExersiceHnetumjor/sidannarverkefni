DefReport.md


# Design Report 

About the project:

This repository contains a web application that plays the game TicTacToe. 

TicTacToe is an old and famous game that revolves around two players playing on a 3x3 board. Each player plays with an X or an O and take turn placing their character in one of the 3x3 Squares. A game can be won by either players or the game can be a draw. The game is won when a player has either 3 of his characters vertically or horizontally or incline. The game is a draw when all 9 squares have been filled and no wins are made. Two players can play in our game.

Before we started coding the game we had to have github host these source code 

* [Travis](http://travis-ci.org)
* [jUnit](http://junit.org/junit5/)
* [Spark](http://sparkjava.com/)
* [Heroku](http://heroku.com)
* [Gradle](https://gradle.org/install/)
* [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

When finished, we could start coding the game. Before coding the game we wrote a class diagram.
![klasarittictactoe](https://user-images.githubusercontent.com/24222814/32079450-2dfa82da-ba9a-11e7-9ce4-94013a5233a9.png)

Code is usally broken down into three layers, top layer (GUI), business layer and data layer. However in this project we only have two layers the top and business, because we don't use a database. 
In the business layer we have 

* TicServer.java 
* Tic.java
* TicServerTest.java
* TicTest.java 

The business layer the game is created and the unit test with it.

In the top layer or graphic user interface layer we have

* TicTac.js
* index.html
* style.css 
	
The top layer is where the user interfaced is designed. 

After coding the game itself is turned out a bit different from the class diagram however that is what usally happens. What changed in Tic.java is we added the player function to make the code more readable. In the TicTest.java we made two tests for each function to test valid and invalid input. 






