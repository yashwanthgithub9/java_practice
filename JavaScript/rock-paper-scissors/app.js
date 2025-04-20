let userScore=0;
let compScore=0;

let userScoreEditor=document.querySelector("#user-score");
let compScoreEditor=document.querySelector("#comp-score");
let msg=document.querySelector("#msg");
const choices=document.querySelectorAll(".choice");
choices.forEach((choice)=>{
    choice.addEventListener("click",()=>{
        // console.log(choice);
        const userChoice = choice.getAttribute("id");
        playGame(userChoice);
        // genCompChoice();
    })
})

let playGame=(userChoice)=>{
    console.log("User choice = ",userChoice);
    let compChoice=genCompChoice();
    console.log("Computer choice = ",compChoice);
    if (userChoice===compChoice) {
        drawGame();
        return;
    }
    else{
        let userWinCase=true;
        if(userChoice==="rock"){
            //paper,scissor
            userWinCase=compChoice==="paper"?false:true;
        }else if(userChoice==="paper")
        {
            //scissor,rock
            userWinCase=compChoice==="scissor"?false:true;
        }
        else{
            //rock,paper
            userWinCase=compChoice==="rock"?false:true;
        }
        result(userWinCase);
    }
}

let genCompChoice=()=>{
    const options=["rock","paper","scissor"];
    let option=options[Math.floor(Math.random()*3)];
    // console.log("Computer generated ",option);
    return option;
}

let result=(userWinCase)=>{
    if(userWinCase) {
        userScore++;
        console.log("User won ",userScore," times");
        console.log("User Won");
        userScoreEditor.innerHTML=userScore;
        msg.innerHTML="User Won this Game !!!"

    }else{
        compScore++;
        console.log("Comp won ",compScore," times");
        console.log("Comp Won");
        compScoreEditor.innerHTML=compScore;
        msg.innerHTML="Computer won this Game !!!"
    }
}
let drawGame=()=>{
    console.log("Game Drawn")
    msg.innerHTML="Matc Drawn, click icons again !!!"
}