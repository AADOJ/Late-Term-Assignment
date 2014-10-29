package is.aadoj.TicTacToe;

import static org.junit.Assert.*;
import org.junit.Test;

public class TicTacToeTest
{
	public static void main(String args[])
	{
		org.junit.runner.JUnitCore.main("is.aadoj.TicTacToe");
	}
	@Test
	public void exampleTest()
	{
		assertEquals(0, 0);
	}

	@Test
	public void gameFinishedShouldReturnFalse()
	{
		TicTacToe game = new TicTacToe();
		assertEquals(false, game.gameFinished());
	}
}