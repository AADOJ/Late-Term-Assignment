package is.aadoj.TicTacToe;

public class TicTacToe
{
	private int round;
	private char[] board;
	boolean p1Won;
	boolean p2Won;

	public TicTacToe()
	{
		round = 1;
		board = new char[9];
		p1Won = false;
		p2Won = false;
	}

	// inserts a symbol at target location
	public char[] insertChar(int location)
	{
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
}
