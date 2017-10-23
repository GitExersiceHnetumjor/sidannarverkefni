// JQUERY
$(document).ready(function(){

	$(".button").click(function() {
		console.log(this.id);
		WebCall("/mark/"+this.id);
	});
	
});

// initial draw board
(function main() {
	for(var id = 1; id <= 9; id++) {
		document.getElementById(id).innerHTML=" ";
	}
	document.getElementById(whoseMove).innerHTML="Next move: x";
})();

function WebCall(URL) {
	$.ajax({
		type: "GET",
		data: null,
		url: URL,
		success: function(data) {
			console.log("succesfull");
			drawBoard(data);
		},
		error: function () {
			console.log("program crash sorry guys");
		}		 
	});
}

var drawBoard = function(data) {
	var object = JSON.parse(data);
	for(var id = 1; id <= 9; id++) {
		document.getElementById(id).innerHTML=object.board[id - 1];
	}
	if (object.gameStatus === "onging") {
		document.getElementById(whoseMove).innerHTML="Next move: " + object.nextMove;
	} 
	else {
		gameOver(object.gameStatus);
	}
};

var gameOver = function(value) {
	if (value === draw) {
		
	}
}



