
public class Tic {
	private static char board[];
	
	public Tic() {
		board = new char[9];

		for (int i = 0; i < 9; i++) {
			int k = i + 1;
			char b = (char)(k + '0');
			board[i] = b;
		}
	}
}

