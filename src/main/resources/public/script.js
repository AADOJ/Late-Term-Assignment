var turn;
var gameArray = new Array(9,9,9,9,9,9,9,9,9);
var round = 0;


$(document).ready(function(){
	turn = iniz();
	$("#status").hide();
	
	$(".tile").click(function(){
		//tile number is a type string
		var tileNum = $(this).attr("data-tile");
		ifOccupied(tileNum);
		var response = InsertIntoTile(tileNum);
		decideUpponResponse(response, tileNum);

		$.ajax({
			type: "POST",
			url: "/id",
			data: 'id=' + JSON.stringify(gameArray),
			dataType: "json",
			success: function(){
				alert("Success");
			},
			failure: function(){
				alert("Fail");
			} 
		});

	});

	$("#restartButt").click(function(){
		restart();
	});

});

function InsertIntoTile(tileNum){
	//TODO: create ajax
	//TODO: Deside callback

	return "OK";
}

function messageToUser(message){

	$("#status").text(message);
	$("#status").slideDown();
}

function restart(){
	
	turn = 1;
	$("#status").text("");
	$("#status").slideUp();
	//ajax reset api board

	$(".tile").each(function(){
		$(this).html("&nbsp;");
	})
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
	
	if(ifOccupied(tileNum)){
		messageToUser("This slot is occupied");
		turn = turn - 1;
	}
	else{
		if(turn === 1){
			$(tileID).text("X");
			gameArray[round] = tileNum;
		} else {
			$(tileID).text("O");
			gameArray[round] = tileNum;
		}
		if(round >= 3)
			checkWin(gameArray);
		round++;
	}
}

function iniz(){
	//make ajax call to ask for header content
	var resp = "TicTacToe";
	$("#header").text(resp);
	return 1;

	//make ajax call to ask for header content
}

function decideUpponResponse(response, tileNum){
		if(response === "OK"){
			$("#status").slideUp();
			drawOnBoard(tileNum);
			changeTurn();
		} else {
			messageToUser(response);
		}
}

function ifOccupied(tileNum) {
	if($("#tile" + tileNum).html() != '&nbsp;')
		return true;
	else
		return false;
}