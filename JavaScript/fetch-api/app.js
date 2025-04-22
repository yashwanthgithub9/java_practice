let url="https://meowfacts.herokuapp.com/";
let para=document.querySelector("#para");
let btn=document.querySelector("#btn");


// Using Async await
// const getFacts=async ()=>{ //making this arrow function async
//     console.log("getting facts...!")
//     let response=await fetch(url); // fetch is an asynchronous operation so putting await
//     console.log(response); // JSON format
//     let datatext=await response.json(); //JSON to JS object conversion
//     console.log(datatext.data);// trying to print JS objects
//     para.innerText=datatext.data;
// }


// Using Promise chains
function getFacts(){
    fetch(url).then((respone)=>{
        return respone.json();
    }).then((d)=>{
        console.log(d.data);
        para.innerText=d.data;
    })

}

btn.addEventListener("click",getFacts);