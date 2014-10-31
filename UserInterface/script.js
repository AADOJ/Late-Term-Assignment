var turn = iniz();


$(document).ready(function(){

	$("#status").hide();
	
	$(".tile").click(function(){
		//tile number is a type string
		var tileNum = $(this).attr("data-tile");
		var response = InsertIntoTile(tileNum);

		decideUpponResponse(response, tileNum);

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
	
	if(turn === 1){
		$(tileID).text("X");
	} else {
		$(tileID).text("O");
	}
}

function iniz(){
	//make ajax call to ask for header content
	var resp = "TicTacToe"
	$("#header").text();
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