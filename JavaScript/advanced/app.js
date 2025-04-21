console.log("one");
console.log("two");

setTimeout(()=>{ // timeout function to delay execution
    console.log("Timed out log")
},4000)//4sec =4000millisec

console.log("three");// js doesn't stop for timeout to execute, if we see console, one to four are 
//executed then after 4 sec timeout function is execute
//this is called asynchrounous way of execution
console.log("four");

function getData(dataId,getNextData){
    setTimeout(()=>{
        if (getNextData) {
            getNextData();
        }
        console.log("data = ",dataId);
    },2000)
}

getData(2); //2s timer started 
getData(3); //2s timer started
getData(4); //2s timer started
// all the timers started at same time so after 2 sec all three will log output
// we need 6sec execution time but time we got is 2 sec

getData(5,getData(6));// we cannont pass this way as getdata(2) will get executed immediatly
getData(7,()=>{
    getData(8,()=>{// this nested Callback will wait 2sec for (1) to execute and go for (2)
        getData(9);// as we didn't mention any next funtoin it will stop here
    })
})