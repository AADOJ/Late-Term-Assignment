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
		
		if(board[0] == board[1] && board[1] == board[2])
		{
			if(board[0] != ' ')
			return true;
		}
		if(board[3] == board[4] && board[4] == board[5])
		{
			if(board[3] != ' ')
			return true;
		}
		if(board[6] == board[7] && board[7] == board[8])
		{
			if(board[6] != ' ')
			return true;
		}
		if(board[0] == board[4] && board[4] == board[8])
		{
			if(board[0] != ' ')
			return true;
		}
		if(board[2] == board[4] && board[4] == board[6])
		{
			if(board[2] != ' ')
			return true;
		}
		return false;
	}

	public static int whoWon(boolean player1, boolean player2)
	{
		if (player1) return 1;
		if (player2) return 2;
		return 0;
	}
}
