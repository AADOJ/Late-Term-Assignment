var turn;
var gameArray;
var round;
var boardLocked;
var xWins = 0;
var oWins = 0;


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

	$("#newGame").click(function() {
		newGame();
	});

	$("#chooseGame").click(function() {
		window.location.href = "index.html";
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
<<<<<<< HEAD

=======
			xWins++;
>>>>>>> b13c64acf8eb4cd896e5233653042a8487c9bc70
			messageToUser("You win!");
			$("#xwins").text(xWins0);
		} else if(response.winner == 2) {
<<<<<<< HEAD
			drawOnBoard(tileNum);
=======
			oWins++;
>>>>>>> b13c64acf8eb4cd896e5233653042a8487c9bc70
			messageToUser("Computer win!");
			$("#owins").text(oWins);
		} else {
			drawOnBoard(tileNum);
			messageToUser("It's a draw!");
		}

	}else{
<<<<<<< HEAD
		
=======
		var tileNum = response.computerMove;
>>>>>>> b13c64acf8eb4cd896e5233653042a8487c9bc70
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

function newGame() {
	xWins = 0;
	oWins = 0;
	restart();
	$("#xwins").html(xWins);
	$("#owins").html(oWins);
}