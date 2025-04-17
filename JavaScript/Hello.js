// console.log("Hello World");
// //alert("Stop");

// let a = 10;
// console.log(a + 5);

// let age1 = 19;
// console.log(age1 > 18 ? "Adult" : "Not Adult");
// let iceCream = "chocolate";
// // if (iceCream === "chocolate") {
// //   alert("Yay, I love chocolate ice cream!");
// // } else {
// //   alert("Awwww, but chocolate is my favorite…");
// // }

// /*const age = prompt("Please enter your age:");
// if (age !== null) {
//     console.log("Your age is:", age);
// } else {
//     console.log("User cancelled the prompt.");
// }*/

// let obj = {
//   item: "pen",
//   price: 15,
// };
// console.log("Cost of " + obj.item + " is " + obj.price + " Rupees "); //spaces are explicitly added, price is converted to string so not highlighted in console
// console.log("Cost of", obj.item, "is", obj.price, "Rupees"); //spaces are automatically added, price is still int so highlighted
// console.log(`Cost of ${obj.item} is ${obj.price} Rupees`); //spaces are expicitly added, price is converted to string so not highlighted in console

// // let fullName=prompt("Please enter your name:");
// // let username = "@"+fullName;
// // username+=fullName.length;
// // console.log("Userame generated based on entered name is : ",username);

// let companies = ["Bloomberg", "Microsoft", "Uber", "Google", "IBM", "Netflix"];
// console.log(companies.shift());
// companies.splice(1, 1, "Ola");
// companies.push("Amazon");
// console.log(companies);

// function countVowels(str) {
//   let count = 0;
//   for (let element of str) {
//     if (
//       element === "a" ||
//       element === "e" ||
//       element === "i" ||
//       element === "o" ||
//       element === "u"||
//       element === "A" ||
//       element === "E" ||
//       element === "I" ||
//       element === "O" ||
//       element === "U"
//     ) {
//       count++;
//     }
//   }
//   console.log(count);
// }
// countVowels("Aaa");

// let arr=[2,345,8,4,6];
// arr.forEach((val)=>console.log(val*val));

// let arr1=[1,234,3,4];
// const maxnum=arr1.reduce((p,c)=>p>c?p:c);
// console.log("Maxnum is: ",maxnum);
// let newarry=arr1.filter((val)=>{return val%2===0});
// console.log(newarry);
// const init=5;
// const sum=arr1.reduce((res,cur)=>res+cur,init);
// console.log(sum);

// let n=prompt("Enter a number");
// let array=[];
// for(let i=1;i<=n;i++){
//     array[i-1]=i;
// }
// console.log(array);

// console.log(`Sum of firt ${n} digits is : `,array.reduce((res,cur)=>res+cur));
// console.log(`Factorial of ${n} is : `,array.reduce((prev,cur)=>prev*cur));

// console.dir(document.body);
// console.log(document.body);
// // let heading1 = document.getElementById("heading");
// let heading1 = document.querySelector("#heading");
// heading1.innerText = "Hello World!";
// heading1.innerHTML = "<b>Hello World!</b>";
// heading1.style.color = "red";
// console.dir(heading1);
// let para = document.getElementById("content");

let divs=document.querySelectorAll(".box");
console.dir(divs);
divs[0].innerText="Hello World! from div1";
divs[1].innerText="Hello World! from div2";
divs[2].innerText="Hello World! from div3";