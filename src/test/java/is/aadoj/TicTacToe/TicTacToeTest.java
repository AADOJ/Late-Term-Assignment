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
		assertEquals(1, TicTacToe.whoWon(true,false));
	}
}