// JQUERY
$(document).ready(function(){

	$(".button").click(function() {
		console.log(this.id);
		WebCall("/mark/"+this.id);
	});

	$("#newGame").click(function() {
		console.log("new game clicked");
		newGame("/newGame");
	});
	
});

// initial draw board
(function main() {
	for(var id = 1; id <= 9; id++) {
		document.getElementById(id).innerHTML=" ";
	}
	document.getElementById("whoseMove").innerHTML="Next move: X";
	//var audio = new Audio('audio_file.mp3');
	//audio.play();
})();

function drawBoard(data) {
	var object = JSON.parse(data);
	for(var id = 1; id <= 9; id++) {
		document.getElementById(id).innerHTML=object.board[id - 1];
	}
	console.log("fake status: " + object.status)
	if (object.status === "ongoing") {
		document.getElementById("whoseMove").innerHTML="Next move: " + object.nextMove;
	} 
	else {
		if (object.status === "winX") {
			document.getElementById("whoseMove").innerHTML= "X has won the game";
		}
		else if (object.status === "winO") {
			document.getElementById("whoseMove").innerHTML= "O has won the game1";
		}
		else if (object.status === "draw") {
			document.getElementById("whoseMove").innerHTML= "There is a draw!";
		}
		for(var id = 1; id <= 9; id++) {
			document.getElementById(id).disabled = true;
		}
	}
};

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
};

function newGame(URL) {
	$.ajax({
		type: "GET",
		data: null,
		url: URL,
		success: function(data) {
			console.log("succesfull");

			for(var id = 1; id <= 9; id++) {
				document.getElementById(id).disabled = false;
			}

			drawBoard(data);
		},
		error: function () {
			console.log("program crash sorry guys");
		}		 
	});
}

var gameOver = function(value) {
	
}



