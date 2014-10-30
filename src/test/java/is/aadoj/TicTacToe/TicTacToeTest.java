package is.aadoj.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest
{
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("is.aadoj.TicTacToe.TicTacToeTest");
	}

	@Test
	public void insertCharTest()
	{
		TicTacToe game = new TicTacToe();
		char[] result = new char[9];
		char[] expected = new char[9];
		for (int i = 0; i < 9; i++)
		{
			expected[i] = ' ';
		}

		result = game.insertChar(1);
		expected[1] = 'X';
		assertArrayEquals(expected, result);

		result = game.insertChar(4);
		expected[4] = 'O';
		assertArrayEquals(expected, result);

		result = game.insertChar(2);
		expected[2] = 'X';
		assertArrayEquals(expected, result);

		result = game.insertChar(0);
		expected[0] = 'O';
		assertArrayEquals(expected, result);

		result = game.insertChar(8);
		expected[8] = 'X';
		assertArrayEquals(expected, result);

		result = game.insertChar(5);
		expected[5] = 'O';
		assertArrayEquals(expected, result);

		result = game.insertChar(3);
		expected[3] = 'X';
		assertArrayEquals(expected, result);

		result = game.insertChar(7);
		expected[7] = 'O';
		assertArrayEquals(expected, result);

		result = game.insertChar(6);
		expected[6] = 'X';
		assertArrayEquals(expected, result);
	}

	@Test
	public void playerOneWon()
	{			
		assertEquals(1, TicTacToe.whoWon(true,false));
	}

	@Test
	public void gameFinishedShouldReturnFalseAfterNoMove()
	{
		TicTacToe game = new TicTacToe();
		assertFalse(game.gameFinished());
	}
	@Test
	public void gameFinishedShouldReturnTrueForDiagonalX246()
	{
		TicTacToe game = new TicTacToe();
		for(int i = 0; i < 7; i++)
		{
			game.insertChar(i);
		}
		assertTrue(game.gameFinished());
	}
	@Test
	public void gameFinishedShouldReturnTrueForDiagonalO246()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(8);
		for(int i = 0; i < 7; i++)
		{
			game.insertChar(i);
		}
		assertTrue(game.gameFinished());
	}

	@Test
	public void gameFinishedShouldReturnTrueForDiagonalX048()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(8);
		game.insertChar(2);
		game.insertChar(0);
		game.insertChar(6);
		game.insertChar(4);
		assertTrue(game.gameFinished());
	}
	@Test
	public void gameFinishedShouldReturnTrueForDiagonalO048()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(2);
		game.insertChar(8);
		game.insertChar(6);
		game.insertChar(0);
		game.insertChar(7);
		game.insertChar(4);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForXLine0To2()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(2);
		game.insertChar(8);
		game.insertChar(0);
		game.insertChar(3);
		game.insertChar(1);
		game.insertChar(4);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOLine0To2()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(4);
		game.insertChar(2);
		game.insertChar(8);
		game.insertChar(0);
		game.insertChar(3);
		game.insertChar(1);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForXLine3To5()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(4);
		game.insertChar(2);
		game.insertChar(5);
		game.insertChar(0);
		game.insertChar(3);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOLine3To5()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(0);
		game.insertChar(4);
		game.insertChar(2);
		game.insertChar(5);
		game.insertChar(7);
		game.insertChar(3);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForXLine6To8()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(6);
		game.insertChar(2);
		game.insertChar(7);
		game.insertChar(0);
		game.insertChar(8);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOLine6To8()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(0);
		game.insertChar(6);
		game.insertChar(1);
		game.insertChar(7);
		game.insertChar(5);
		game.insertChar(8);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForXVerticalLine036()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(0);
		game.insertChar(1);
		game.insertChar(3);
		game.insertChar(5);
		game.insertChar(6);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOVerticalLine036()
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(7);
		game.insertChar(0);
		game.insertChar(1);
		game.insertChar(3);
		game.insertChar(5);
		game.insertChar(6);
		assertTrue(game.gameFinished());
	}
	@Test
	public void printBoardTest()
	{
		TicTacToe game = new TicTacToe();
		String expected = " | | " + "\n" + "-----" + "\n" + " | | " + "\n" + "-----" + "\n" + " | | ";
		assertEquals(expected, game.printBoard());

		game.insertChar(1);
		game.insertChar(4);
		game.insertChar(2);
		game.insertChar(0);
		game.insertChar(8);
		game.insertChar(5);
		game.insertChar(3);
		game.insertChar(7);
		game.insertChar(6);

		expected = "O|X|X" + "\n" + "-----" + "\n" + "X|O|O" + "\n" + "-----" + "\n" + "X|O|X";
		assertEquals(expected, game.printBoard());

	}
}
