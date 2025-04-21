let url="https://meowfacts.herokuapp.com/";


const getFacts=async ()=>{ //making this arrow function async
    console.log("getting facts...!")
    let response=await fetch(url); // fetch is an asynchronous operation so putting await
    console.log(response); // JSON format
    let datatext=await response.json(); //JSON to JS object conversion
    console.log(datatext.data);// trying to print JS objects
}