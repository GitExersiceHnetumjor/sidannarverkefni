
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

	public static boolean updateBoard(int t) {
		checkInput(t);
		if (board[t - 1] == 'X' || board[t - 1] == 'O' ) {
			return false;
		}
		turns++;
		if (activePlayer == 'X') {
			board[t - 1] = 'X';
			
			activePlayer = 'O';
			
		} else {
			board[t - 1] = 'O';
			
			activePlayer = 'X';
			
		}
		return true;
	}

	private static boolean checkInput(int c) {
		if (c < 0 || c > 9) {
			throw new IllegalArgumentException("Invalid Input");	
		}
		return true;
	}
}

