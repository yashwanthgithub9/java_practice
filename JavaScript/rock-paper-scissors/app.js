let userScore=0;
let compScore=0;

let userScoreEditor=document.querySelector("#user-score");
let compScoreEditor=document.querySelector("#comp-score");
let msg=document.querySelector(".msg-box");
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
        drawGame(userChoice,compChoice);
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
        result(userWinCase,compChoice,userChoice);
    }
}

let genCompChoice=()=>{
    const options=["rock","paper","scissor"];
    let option=options[Math.floor(Math.random()*3)];
    // console.log("Computer generated ",option);
    return option;
}

let result=(userWinCase,compChoice,userChoice)=>{
    if(userWinCase) {
        userScore++;
        console.log("User won ",userScore," times");
        console.log("User Won");
        userScoreEditor.innerHTML=userScore;
        msg.innerHTML=`User Won this Game !!! ${userChoice} beats ${compChoice}`;
        msg.style.backgroundColor="green";
    }else{
        compScore++;
        console.log("Comp won ",compScore," times");
        console.log("Comp Won");
        compScoreEditor.innerHTML=compScore;
        msg.innerHTML=`Computer won this Game !!! ${compChoice} beats ${userChoice}`;
                msg.style.backgroundColor="red";

    }
}
let drawGame=(userChoice,compChoice)=>{
    console.log("Game Drawn")
    msg.innerHTML=`Match Drawn,both of you chose ${userChoice} click icons again !!!`;
    msg.style.backgroundColor="blue";

}