# Admin Manual
## Heroku (external serving)
Each push command to git automatically runs tests and deploys to Heroku. The app is therefore always up and running on the
[Heroku App Server](https://sidannar-tictactoe.herokuapp.com/). 

## Local hosting
To host locally, follow developer setup and enter `gradle build clean run` into your command line interface. The app will
then be hosted on port 4567 by default, accessible through `localhost:4567` in your browser of choice.
