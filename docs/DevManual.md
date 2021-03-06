# Developers Manual

About the project:

This repository contains a web application that plays the game TicTacToe. 

TicTacToe is an old and famous game that revolves around two players playing on a 3x3 board. Each player plays with an X or an O and take turn placing their character in one of the 3x3 Squares. A game can be won by either players or the game can be a draw. The game is won when a player has either 3 of his characters vertically or horizontally or incline. The game is a draw when all 9 squares have been filled and no wins are made. Two players can play in our game.

The source code is hosted on github

## Setting up

1. Install [Gradle](https://gradle.org/install/), 
2. Install git, see instructions on installing git [here](https://help.github.com/articles/set-up-git/) 
3. Install [Heroku Toolbelt](https://devcenter.heroku.com/articles/heroku-cli)
4. Configure git and gradle environmental variables. See instructions for configuring environment variables [here](http://www.chambaud.com/2013/07/08/adding-git-to-path-when-using-github-for-windows/)
5. If you want to contribute to the project then clone the repository and create a new branch. To merge please make a pull request.
6. If you want to create a seperate version then fork the repository. This requires a new setup of Travis-Ci and Heroku.

    1. Set up travis continuous intigration with [Travis](http://travis-ci.org). Just sign in with github, sync your account and add your repo to	travis. More information [here](https://docs.travis-ci.com/user/getting-started/)
	This automates the build and test process by building the project every time you push to github and evaluating tests.
	2. Sign up for Heroku and configure the .travis.yml file according to your Heroku account. You have to change your api_key and app name.
	3. Create a local Procfile referencing the same path as original Procfile with your systems URI syntax if required (WINDOWS).
	4. Sign up for [codecov](https://codecov.io) and add your repository.
 
If you set the project up correctly, Travis should build the project and push the newest version to Heroku.

Heroku command line commands:

Login to heroku `heroku login`
Manually push your local changes to heroku: `git push heroku master`

To run the game locally navigate to your local project directory and run `gradle clean build run`. Then go to your browser and enter localhost:4567.

The link to the Heroku app is: https://sidannar-tictactoe.herokuapp.com/


## Dependencies

* [Travis](http://travis-ci.org)
* [jUnit](http://junit.org/junit5/)
* [Spark](http://sparkjava.com/)
* [Heroku](http://heroku.com)
* [Gradle](https://gradle.org/install/)
* [Java JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Jacoco](http://www.eclemma.org/jacoco/)
