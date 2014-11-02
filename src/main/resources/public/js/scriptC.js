var turn;
var gameArray;
var round;
var boardLocked;
var xWins;
var yWins;


$(document).ready(function(){
	iniz();

	$(".tile").click(function(){
		//tile number is a type string
		var tileNum = $(this).attr("data-tile");
		if(!boardLocked && !ifOccupied(tileNum)){
			drawOnBoard(tileNum);
			ajaxCall();
		} else if(!boardLocked && ifOccupied(tileNum)) {
			messageToUser("Tile is occupied!");
		}


	});

	$("#restartButt").click(function(){
		restart();
	});

});

function messageToUser(message){
	$("#status").text(message);
}

function restart(){

	messageToUser("Your turn!");
	$(".tile").each(function(){
		$(this).html("&nbsp;");
	});

	iniz();
}

function changeTurn(){
	
	if(turn === 1){
		turn = 2;
	} else {
		turn = 1;
	}
}

function drawOnBoard(tileNum){
	
	var tileID = "#tile" + tileNum;

	if(turn === 1){
		$(tileID).text("X");
		gameArray[round] = tileNum;
		messageToUser("Computer turn!");
	} else {
		$(tileID).text("O");
		gameArray[round] = tileNum;
		messageToUser("Your turn!");
	}
	changeTurn();
	round++;
}

function iniz(){
	messageToUser("Your turn!");
	gameArray = new Array("9","9","9","9","9","9","9","9","9");
	round = 0;
	boardLocked = false;
	turn = 1;
}

function decideUpponResponse(response){
	var tileNum = response.computerMove;
	if(response.gameFinished){
		boardLocked = true;
		if(response.winner == 1){

			messageToUser("You win!");
		} else if(response.winner == 2) {
			drawOnBoard(tileNum);
			messageToUser("Computer win!");
		} else {
			drawOnBoard(tileNum);
			messageToUser("It's a draw!");
		}

	}else{
		
		drawOnBoard(tileNum);
	}
}

function ifOccupied(tileNum) {
	if($("#tile" + tileNum).html() != '&nbsp;')
		return true;
	else {
		return false;
	}
}

function ajaxCall(){
	boardLocked = true;
	 $.post("/computer/id", 'id=' + JSON.stringify(gameArray) )
        .done(function(data) {
        	var response = jQuery.parseJSON(data);
            decideUpponResponse(response);
            if(!response.gameFinished)
            	boardLocked = false;
        }); 
}