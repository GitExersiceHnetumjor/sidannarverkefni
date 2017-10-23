
public class Tic {
	private static char board[];
	private static int turns;
	private static char activePlayer;
	
	/**
	* Tic() is a constructor that doesn't take in any 
	* parameters and doesn't return anything. 
	* It initializes the variables and creates the board.
	*/

	public Tic() {
		turns = 0;
		activePlayer = 'X';
		board = new char[9];

		for (int i = 0; i < 9; i++) {
			int k = i + 1;
			char b = (char)(k + '0');
			board[i] = b;
		}
	}

	/**
	 * board() is an array of chars that keeps track of
	 * what squares the players have chosen.
	 * @return the board
	 */

	public static char[] board() {
		return board;
	}
	
	/**
	 * updateBoard() checks if the square the player chose
	 * already has been chosen, if not it marks it with the
	 * players sign, makes the other player the active one and 
	 * increases the turn counter by one.
	 * @param t is the square the player chooses
	 * @return true when the square has been marked
	 */

	public static boolean updateBoard(int t) {
		checkInput(t);
		if (board[t - 1] == 'X' || board[t - 1] == 'O' ) {
			return false;
		}
		turns++;
		if (activePlayer == 'X') {
			board[t - 1] = 'X';
			if (!(isWinner())) {
				activePlayer = 'O';
			}
		} else {
			board[t - 1] = 'O';
			if (!(isWinner())) {
				activePlayer = 'X';
			}
		}
		return true;
	}

	/**
	 * checkInput() is a function that checks if the
	 * input is valid. The input can be a number from
	 * 0 to 9.
	 * @param c is the place a player chooses on the board 
	 * @exception IllegalArgumentException if the char isn't 
	 * between 0 and 9.
	 */

	private static boolean checkInput(int c) {
		if (c < 0 || c > 9) {
			throw new IllegalArgumentException("Invalid Input");	
		}
		return true;
	}

	/**
	 * checkInput() is a function that checks if the
	 * input is valid. The input can be a number from
	 * 0 to 9.
	 * @return the active player (X or O)
	 */

	public static char player() {
		return activePlayer;
	}

	/**
	 * isDraw() is a boolean function that checks if 
	 * the game is a draw. If a player has had nine 
	 * turns and still hasn't won, the game is a draw
	 * and returns true.
	 * @return true if the game is a draw
	 */

	public static boolean isDraw() {
		if (turns == 9) {
			return true;
		}
		return false;
	}

	/**
	 * isWinner() is a function that checks after each turn if 
	 * the player has won the game.
	 * @return true if a player wins the game
	 */
	
	public static boolean isWinner() {
		// horizontal win for X and O 
		if (board[0] == 'X' && board[1] == 'X' && board[2] == 'X'){
			return true;
	    } else if (board[0] == 'O' && board[1] == 'O' && board[2] == 'O') {
	    	return true;
	    } else if (board[3] == 'X' && board[4] == 'X' && board[5] == 'X') {
	    	return true;
	    } else if (board[3] == 'O' && board[4] == 'O' && board[5] == 'O') {
	    	return true;
	    } else if (board[6] == 'X' && board[7] == 'X' && board[8] == 'X') {
	    	return true;
	    } else if (board[6] == 'O' && board[7] == 'O' && board[8] == 'O') {
	    	return true;

	    // vertical win for X and O
	    } else if (board[0] == 'X' && board[3] == 'X' && board[6] == 'X') {
	    	return true;
	    } else if (board[0] == 'O' && board[3] == 'O' && board[6] == 'O') {
	    	return true;
	    } else if (board[1] == 'X' && board[4] == 'X' && board[7] == 'X') {
	    	return true;
	    } else if (board[1] == 'O' && board[4] == 'O' && board[7] == 'O') {
	    	return true;
	    } else if (board[2] == 'X' && board[5] == 'X' && board[8] == 'X') {
	    	return true;
	    } else if (board[2] == 'O' && board[5] == 'O' && board[8] == 'O') {
	    	return true;

	    // diagonal win for X and O
	    } else if (board[0] == 'X' && board[4] == 'X' && board[8] == 'X') {
	    	return true;
	    } else if (board[0] == 'O' && board[4] == 'O' && board[8] == 'O') {
	    	return true;
	    } else if (board[2] == 'X' && board[4] == 'X' && board[6] == 'X') {
	    	return true;
	    } else if (board[2] == 'O' && board[4] == 'O' && board[6] == 'O') {
	    	return true;
	    }

		return false;
	}
}

