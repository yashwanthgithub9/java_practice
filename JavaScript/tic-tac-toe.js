let boxes=document.querySelectorAll(".btn");//this will create an array of all the buttons in the html file with index 0 to 8

let reset=document.querySelector("#reset-button");
let status = document.querySelector("#status-message");

let playerOscore = 0;
let playerXscore = 0;   
let playerOturn = true;
let playerXturn = false;
let playerX="X";
let playerO="O";

let winningCombinations = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
];
let gameActive = true;
let currentPlayer = playerOturn ? playerO : playerX; // Start with player O   
let gameState = ["", "", "", "", "", "", "", "", ""]

boxes.forEach((box, index) => {
    box.addEventListener("click", () =>{
        if (gameState[index] !== "" || !gameActive) {
            return; // Ignore click if box is already filled or game is over
        }
        if (playerOturn) {
            box.innerHTML = playerO; // Set the box to O
            gameState[index] = playerO; // Update game state
            currentPlayer = playerX; // Switch to player X
            playerOturn = false; // Switch to player X turn true
            playerXturn = true; // Switch to player O turn false
            status.innerHTML="Player X turn";
            console.log(gameState);
        }
        else {
            box.innerHTML = playerX; // Set the box to X
            gameState[index] = playerX; // Update game state
            currentPlayer = playerO; // Switch to player O
            playerXturn = false; // Switch to player O turn
            playerOturn = true; // Switch to player X turn
            status.innerHTML="Player O turn";
            console.log(gameState);
        }
        checkWinner();
        // console.log("Clicked box: " + index);
    });
}
);

checkWinner = () => {
    console.log("Checking winner...");

    for(let w=0; w<winningCombinations.length;w++){
        let [a,b,c]=winningCombinations[w];
        if (gameState[a] === "" || gameState[b] === "" || gameState[c] === "") {
             continue; // Skip if any of the boxes are empty
            //     
            }
        if (gameState[a]===gameState[b] && gameState[b]===gameState[c])
            gameActive=false;
        if (gameState[a]===playerO) {//matching string should be === not =
            console.log("Winner is ",playerO);
            status.innerHTML="Congratulation Player Player-O";
                }
        else{
            console.log("Winner is ",playerX);
            status.innerHTML="Congratulation Player Player-X";

        }
        
       }
       if (gameActive) {
            console.log("It's a draw")
       }

}
