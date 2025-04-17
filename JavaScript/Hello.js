console.log("Hello World");
//alert("Stop");

let a = 10;
console.log(a+5);

let age1= 19;
console.log(age1>18?"Adult":"Not Adult");
let iceCream = "chocolate";
// if (iceCream === "chocolate") {
//   alert("Yay, I love chocolate ice cream!");
// } else {
//   alert("Awwww, but chocolate is my favorite…");
// }

/*const age = prompt("Please enter your age:");
if (age !== null) {
    console.log("Your age is:", age);
} else {
    console.log("User cancelled the prompt.");
}*/

let obj={
    item:"pen",
    price:15
}
console.log("Cost of " +obj.item+" is "+obj.price+" Rupees ");//spaces are explicitly added, price is converted to string so not highlighted in console
console.log("Cost of",obj.item,"is",obj.price,"Rupees");//spaces are automatically added, price is still int so highlighted
console.log(`Cost of ${obj.item} is ${obj.price} Rupees`);//spaces are expicitly added, price is converted to string so not highlighted in console

// let fullName=prompt("Please enter your name:");
// let username = "@"+fullName;
// username+=fullName.length;
// console.log("Userame generated based on entered name is : ",username);

let companies = ["Bloomberg","Microsoft","Uber","Google","IBM","Netflix"];
console.log(companies.shift());
companies.splice(1,1,"Ola");
companies.push("Amazon");
console.log(companies);

function countVowels(str){
    let count=0;
    for (let element of str) {
        if (element==='a'||element==='e'||element==='i'||element==='o'||element==='u') {
            count++
        }
    }
    console.log(count);
}
countVowels("Aaa");