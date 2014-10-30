package is.aadoj.TicTacToe;

public class TicTacToe
{
	private int round;
	private char[] board;
	boolean p1Won;
	boolean p2Won;

	public TicTacToe()
	{
		round = 0;
		board = new char[9];
		p1Won = false;
		p2Won = false;
		for (int i = 0; i < 9; i++)
		{
			board[i] = ' ';
		}
	}

	// inserts a symbol at target location
	public char[] insertChar(int location)
	{
		round++;
		char symbol;
		if (round % 2 == 1) symbol = 'X';
		else symbol = 'O';

		board[location] = symbol;

		return board;
	}

	public boolean gameFinished()
	{
		return false;
	}

	public static int whoWon(boolean player1, boolean player2)
	{
		if (player1) return 1;
		if (player2) return 2;
		return 0;
	}

	public String printBoard()
	{
		String boardString;
		String wall = "|";
		String floor = "-----";
		boardString = board[0] + wall + board[1] + wall + board[2] + "\n" +  floor + "\n"
			+ board[3] + wall + board[4] + wall + board[5] + "\n" +  floor  + "\n"
			+ board[6] + wall + board[7] + wall + board[8];
		return boardString;
	}
}
