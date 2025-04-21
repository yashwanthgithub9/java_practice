console.log("one");
console.log("two");

setTimeout(()=>{ // timeout function to delay execution
    console.log("Timed out log")
},4000)//4sec =4000millisec

console.log("three");// js doesn't stop for timeout to execute, if we see console, one to four are 
//executed then after 4 sec timeout function is execute
//this is called asynchrounous way of execution
console.log("four");

function getData(dataId){
    setTimeout(()=>{
        console.log("data = ",dataId);
    },2000)
}

getData(2); //2s timer started 
getData(3); //2s timer started
getData(4); //2s timer started
// all the timers started at same time so after 2 sec all three will log output
// we need 6sec execution time but time we got is 2 sec

