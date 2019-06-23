package example;

public class TicTacToe {
	public static void main(String[] args) {
		final int ROWS = 3; 
		final int COLUMNS = 3; 
		char[][] board = new char[ROWS][COLUMNS];
		
		board[1][1] = 'X';
		board[2][0] = 'O'; 
		
		for (int i = 0; i < ROWS; i++) {
			System.out.print("| ");
			for (int j = 0; j < COLUMNS; j++) {
				System.out.print(board[i][j] + " | "); 
			}
			System.out.println();
		}
	}
}
