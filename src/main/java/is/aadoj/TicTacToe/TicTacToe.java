package is.aadoj.TicTacToe;

public class TicTacToe
{
	public class TicTacToeException extends Exception
	{
		public TicTacToeException(String message)
		{
			super(message);
		}
	}
	private int round;
	private char[] board;
	private boolean p1Won;
	private boolean p2Won;

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
	public char[] insertChar(int location) throws TicTacToeException
	{
		if(location < 0 || location > 8)
			throw new TicTacToeException("Location out of bounds!");
		round++;
		char symbol;
		if (round % 2 == 1) symbol = 'X';
		else symbol = 'O';

		if(board[location] == 'X' || board[location] == 'O') 
		{
			round--;
			throw new TicTacToeException("This slot is occupied!");	
		}
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
		if(board[0] == board[3] && board[3] == board[6])
		{
			if(board[0] != ' ')
			return true;
		}
		if(board[1] == board[4] && board[4] == board[7])
		{
			if(board[1] != ' ')
			return true;
		}
		if(board[2] == board[5] && board[5] == board[8])
		{
			if(board[2] != ' ')
			return true;
		}
		return false;
	}

	public int whoWon()
	{
		if (p1Won) return 1;
		if (p2Won) return 2;
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
