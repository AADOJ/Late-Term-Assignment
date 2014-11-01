package is.aadoj.TicTacToe;

public class TicTacToe
{
<<<<<<< HEAD
=======
	public class TicTacToeException extends Exception
	{
		public TicTacToeException(String message)
		{
			super(message);
		}
	}
>>>>>>> 4d97cfd88b31b03f0f09b8b7ecc54aff79115465
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
<<<<<<< HEAD
=======
		if(checkLines())
		{
			if(round % 2 == 1)
			{
				p1Won = true;
			}
			else
				p2Won = true;
			return true;
		}
		else if(round == 9)
		{
			return true;
		}
		return false;

	}
	private boolean checkLines()
	{
		if(board[0] == board[1] && board[1] == board[2] && board[0] != ' ')
		{
			return true;
		}
		if(board[3] == board[4] && board[4] == board[5] && board[3] != ' ')
		{
			return true;
		}
		if(board[6] == board[7] && board[7] == board[8] && board[6] != ' ')
		{
			return true;
		}
		if(board[0] == board[4] && board[4] == board[8] && board[0] != ' ')
		{
			return true;
		}
		if(board[2] == board[4] && board[4] == board[6] && board[2] != ' ')
		{
			return true;
		}
		if(board[0] == board[3] && board[3] == board[6] && board[0] != ' ')
		{
			return true;
		}
		if(board[1] == board[4] && board[4] == board[7] && board[1] != ' ')
		{
			return true;
		}
		if(board[2] == board[5] && board[5] == board[8] && board[2] != ' ')
		{
			return true;
		}
>>>>>>> 4d97cfd88b31b03f0f09b8b7ecc54aff79115465
		return false;
	}

	public static int whoWon(boolean player1, boolean player2)
	{
		if (player1) return 1;
		if (player2) return 2;
		return 0;
	}
}
