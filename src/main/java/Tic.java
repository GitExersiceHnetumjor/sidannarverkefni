
public class Tic {
	private static char board[];
	private static int turns;
	private static char activePlayer;
	
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

	public static char[] board() {
		return board;
	}
	
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

	private static boolean checkInput(int c) {
		if (c < 0 || c > 9) {
			throw new IllegalArgumentException("Invalid Input");	
		}
		return true;
	}

	public static char player() {
		return activePlayer;
	}

	public static boolean isDraw() {
		if (turns == 9) {
			return true;
		}
		return false;
	}

	public static boolean isWinner() {
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

