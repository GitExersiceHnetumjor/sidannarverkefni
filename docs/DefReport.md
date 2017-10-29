DefReport.md


# Design Report 

### Epli og hnetusmjör
##### Ellen Sigurðardóttir
##### Hannes Jóhannsson
##### Helgi Hallgrímsson
##### Ívar Örn Kristjánsson
##### Ketill Antoníus Ágústsson
##### Margrét Finnbogadóttir
##### Sigurður Jónsson
------------------------------

### About the project:

This repository contains a web application that plays the game TicTacToe. 

TicTacToe is an old and famous game that revolves around two players playing on a 3x3 board. Each player plays with an X or an O and take turn placing their character in one of the 3x3 Squares. A game can be won by either players or the game can be a draw. The game is won when a player has either 3 of his characters vertically or horizontally or incline. The game is a draw when all 9 squares have been filled and no wins are made. Two players can play in our game.

### Before we started coding the game we had to have github host these source codes 

* [Travis](http://travis-ci.org)
* [jUnit](http://junit.org/junit5/)
* [Spark](http://sparkjava.com/)
* [Heroku](http://heroku.com)
* [Gradle](https://gradle.org/install/)
* [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

### When designing the game we had to think about few fundamental details: 

* array of 9 to be able to make the board
* two players, X and O
* the players have to switch after each round
* the board has to take commands from the mouse to place the x's and o's in the valid places
* check for a winner or a draw
* decide to host locally or in a browser

To get a better vision of our design before coding, we decided to make a class diagram.
![klasarittictactoe](https://user-images.githubusercontent.com/24222814/32079450-2dfa82da-ba9a-11e7-9ce4-94013a5233a9.png)

#### Coding rules and methods
All classes start with a upper case letter and all following words, or pascal case. The functions and variables start with a lower case letter and all words after the first one start with a upper case letter, or camel case. When using brackets we leave the first one in the same line on the right and the other one in a new line at the bottom to the left.
The coding method that we used is TDD (test driven development). TDD is when we code one unit and make a test for it. The test for the unit should start by failing and then we write the test for the desired output. We used pair-programming, where two members would work together on one branch.
Every time we change something in the project we make a new branch and name it something descriptive. When the feature is ready we make a pull request and another member looks it over and accepts it. Everything is done in English.

#### Layers
Code is usually broken down into three layers, top layer (GUI), business layer and data layer. However in this project we only have two layers the top and business. We decided not to have a database in the design process and therefore we don't keep a score of how many times the players have won.

#### Top layer (GUI)

* TicTac.js
* index.html
* style.css 
	
The top layer is where the user interfaced is designed. 

#### Business layer

* TicServer.java 
* Tic.java
* TicServerTest.java
* TicTest.java 

The business layer is where the game and the unit tests are created.

After coding the game itself it turned out a bit different from the class diagram however that is what usually happens. What changed in Tic.java is we added the player function to make the code more readable. In the TicTest.java we made two tests for each function to test for valid and invalid input.
