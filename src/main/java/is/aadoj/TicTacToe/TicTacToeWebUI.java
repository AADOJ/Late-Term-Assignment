package is.aadoj.TicTacToe;

import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;
import com.google.gson.Gson;
import is.aadoj.TicTacToe.TicTacToe.TicTacToeException;

public class TicTacToeWebUI implements SparkApplication {
    public static void main(String[] args){
        staticFileLocation("/public");
        SparkApplication tictactoeweb = new TicTacToeWebUI();
        String port = System.getenv("PORT");
        if (port != null) {
            setPort(Integer.valueOf(port));
        }
        tictactoeweb.init(); 
    }

    public void init(){
        final TicTacToe game = new TicTacToe();
        

        post(new Route("/id"){
            @Override
            public Object handle(Request request, Response response){
                Integer number = Integer.valueOf(request.queryParams("id"));
                
                try
                {
                    char[] board = game.insertChar(number);
                    return new Gson().toJson(board);
                }
                catch(TicTacToeException ex)
                {
                    return ex.getMessage();
                }
                
            }
        });


    }
}