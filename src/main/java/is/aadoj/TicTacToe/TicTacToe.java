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

	public int whoWon()
	{
		return 0;
	}
}
