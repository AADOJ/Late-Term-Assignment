package is.aadoj.TicTacToe;

public class Result
    {
        private boolean gameFinished;
        private int winner;
        private int computerMove;
        public Result(boolean gameFin, int whoWon, int computerMov)
        {
            gameFinished = gameFin;
            winner = whoWon;
            computerMove = computerMov;

        }
    }