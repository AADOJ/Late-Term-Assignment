var turn;
var gameArray;
var round;
var boardLocked;


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

	messageToUser("It's player-X turn!");
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
		messageToUser("It's player-O turn!");
	} else {
		$(tileID).text("O");
		gameArray[round] = tileNum;
		messageToUser("It's player-X turn!");
	}
	changeTurn();
	round++;
}

function iniz(){
	messageToUser("It's player-X turn!");
	gameArray = new Array("9","9","9","9","9","9","9","9","9");
	round = 0;
	boardLocked = false;
	turn = 1;
}

function decideUpponResponse(response){
	
	if(response.gameFinished){
		boardLocked = true;
		if(response.winner == 1){
			messageToUser("Winner is X!");
		} else if(response.winner == 2) {
			messageToUser("Winner is O!");
		} else {
			messageToUser("It's a draw!");
		}

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

	 $.post("player/id", 'id=' + JSON.stringify(gameArray) )
        .done(function(data) {
            decideUpponResponse(jQuery.parseJSON(data));
        }); 
}