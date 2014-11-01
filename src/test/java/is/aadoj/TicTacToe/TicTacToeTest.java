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
	public void playerOneWon()
	{			
<<<<<<< HEAD
		assertEquals(1, TicTacToe.whoWon(true,false));
=======
		TicTacToe game = new TicTacToe();
		game.insertChar(0);
		game.insertChar(2);
		game.insertChar(4);
		game.insertChar(3);
		game.insertChar(8);
		game.gameFinished();
		assertEquals(1, game.whoWon());
	}

	@Test 
	public void playerTwoWonTest() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(2);
		game.insertChar(3);
		game.insertChar(1);
		game.insertChar(4);
		game.insertChar(8);
		game.insertChar(5);
		game.gameFinished();
		assertEquals(2, game.whoWon());
	}

	@Test 
	public void gameEndsInTie() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(1);
		game.insertChar(4);
		game.insertChar(2);
		game.insertChar(0);
		game.insertChar(8);
		game.insertChar(5);
		game.insertChar(3);
		game.insertChar(7);
		game.insertChar(6);
		game.gameFinished();
		assertEquals(0, game.whoWon());
	}
	

	@Test
	public void gameFinishedShouldReturnFalseAfterNoMove() 
	{
		TicTacToe game = new TicTacToe();
		assertFalse(game.gameFinished());
	}
	@Test
	public void gameFinishedShouldReturnFalseAfterSpecialCaseMove() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(0);
		game.insertChar(2);
		assertFalse(game.gameFinished());
	}
	@Test
	public void gameFinishedShouldReturnTrueForDiagonalX246() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		for(int i = 0; i < 7; i++)
		{
			game.insertChar(i);
		}
		assertTrue(game.gameFinished());
	}
	@Test
	public void gameFinishedShouldReturnTrueForDiagonalO246() throws TicTacToeException
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
	public void gameFinishedShouldReturnTrueForDiagonalX048() throws TicTacToeException
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
	public void gameFinishedShouldReturnTrueForDiagonalO048() throws TicTacToeException
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
	public void gameFinishedShouldReturnTrueForXLine0To2() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(2);
		game.insertChar(8);
		game.insertChar(0);
		game.insertChar(3);
		game.insertChar(1);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOLine0To2() throws TicTacToeException
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
	public void gameFinishedShouldReturnTrueForXLine3To5() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(4);
		game.insertChar(2);
		game.insertChar(5);
		game.insertChar(0);
		game.insertChar(3);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOLine3To5() throws TicTacToeException
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
	public void gameFinishedShouldReturnTrueForXLine6To8() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(6);
		game.insertChar(2);
		game.insertChar(7);
		game.insertChar(0);
		game.insertChar(8);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOLine6To8() throws TicTacToeException
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
	public void gameFinishedShouldReturnTrueForXVerticalLine036() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(0);
		game.insertChar(1);
		game.insertChar(3);
		game.insertChar(5);
		game.insertChar(6);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOVerticalLine036() throws TicTacToeException
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
	public void gameFinishedShouldReturnTrueForXVerticalLine147() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(7);
		game.insertChar(0);
		game.insertChar(4);
		game.insertChar(3);
		game.insertChar(1);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOVerticalLine147() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(5);
		game.insertChar(7);
		game.insertChar(0);
		game.insertChar(4);
		game.insertChar(3);
		game.insertChar(1);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForXVerticalLine258() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(2);
		game.insertChar(0);
		game.insertChar(5);
		game.insertChar(3);
		game.insertChar(8);
		assertTrue(game.gameFinished());
	}
	public void gameFinishedShouldReturnTrueForOVerticalLine258() throws TicTacToeException
	{
		TicTacToe game = new TicTacToe();
		game.insertChar(0);
		game.insertChar(2);
		game.insertChar(3);
		game.insertChar(5);
		game.insertChar(8);
		game.insertChar(7);
		assertTrue(game.gameFinished());
	}

	@Test
	public void printBoardTest() throws TicTacToeException
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
>>>>>>> 4d97cfd88b31b03f0f09b8b7ecc54aff79115465
	}
}
