// console.log("one");
// console.log("two");

// setTimeout(()=>{ // timeout function to delay execution
//     // console.log("Timed out log")
// },4000)//4sec =4000millisec

// console.log("three");// js doesn't stop for timeout to execute, if we see console, one to four are 
// //executed then after 4 sec timeout function is execute
// //this is called asynchrounous way of execution
// console.log("four");

// // function getData(dataId,getNextData){
// //     setTimeout(()=>{
// //         if (getNextData) {
// //             getNextData();
// //         }
// //         // console.log("data = ",dataId);
// //     },2000)
// // }

// getData(2); //2s timer started 
// getData(3); //2s timer started
// getData(4); //2s timer started
// // all the timers started at same time so after 2 sec all three will log output
// // we need 6sec execution time but time we got is 2 sec

// //Callback Hell or Pyramid of doom
// getData(5,getData(6));// we cannont pass this way as getdata(2) will get executed immediatly


// let promise = new Promise((resolve,reject)=>{ // we are explicitly creating promise objects, practically other APIs create promise

//     console.log("promise");
//     resolve("Success");// without this, promise state ="pending", result="undefined"
//     //with resolve it changes to "fulfilled", "success"
//     reject("Error"); // it will throws uncaught error
// });
// const getPromise=()=>{
//     return new Promise((resolve,reject)=>{
//         console.log("I'm a promise");
//         resolve("Yes");
//     });
// }
// let promiseThen = getPromise();
// promiseThen.then(()=>{
//     console.log("Promise success")
// })



// //Callback hell
// function getData(dataId,getNextData){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             console.log("Data = ",dataId);
//             resolve("Data resolved");
//             if (getNextData) {
//                 getNextData();
//             }
//             // console.log("data = ",dataId);
//         },5000);
//     })

// }

// // getData(7,()=>{
// //     getData(8,()=>{// this nested Callback will wait 2sec for (1) to execute and go for (2)
// //         getData(9);// as we didn't mention any next funtoin it will stop here
// //     })
// // })

// function async1(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             console.log("Data1..");
//             resolve("data1 resolved");
//         },4000);
//     })
// }

// function async2(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             console.log("Data2..");
//             resolve("data2 resolved");
//         },4000);
//     })
// }



// //declaring p1,p2 separately makes this to execute asynchronously
// console.log("fetching data1");
// async1().then((res)=>{
//     console.log(res);
//     console.log("fetching data2");
//     async2().then((res)=>{
//         console.log(res);
//     })

// })

// //promises chain
// function getData(dataId){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             console.log("Data = ",dataId);
//             resolve("Data resolved");
//             // console.log("data = ",dataId);
//         },3000);
//     })

// }
// getData(1)
//     .then((res)=>{
//         return getData(2);
//     }).then((res)=>{
//         console.log(res);
//     });




//Async-await
function getData(dataId){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            console.log("Data = ",dataId);
            resolve("Data resolved");
            // console.log("data = ",dataId);
        },3000);
    })

}
(async function getAllData() {// on this is we have to explicitly call this function
    // else the below await wont execute
    await getData(10);
    await getData(11);
    await getData(12);
})(); // this will execute the function automatically