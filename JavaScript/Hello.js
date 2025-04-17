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
divs[1].style.color="blue";
divs[1].style.fontSize="20px";
divs[1].style.fontWeight="bold";
divs[1].style.backgroundColor="yellow";
divs[2].innerText="Hello World! from div3";

let id=document.querySelector("div").getAttribute("class");//getattribute is used to get the value of attribute of an element
console.log(id);
let para=document.querySelector("p").getAttribute("id");//getattribute is used to get the value of attribute of an element
console.log(para);
document.querySelector("p").setAttribute("id","para1");//setattribute is used to set the value of attribute of an element
console.log(document.querySelector("p").getAttribute("id"));//getattribute is used to get the value of attribute of an element
let divstyle = document.querySelector("div");
divstyle.style.backgroundColor = "red"; //set the background color of div to red

let newButton = document.createElement("button"); //create a new button element
newButton.innerText = "Click Me"; //set the text of button
newButton.style.backgroundColor = "blue"; //set the background color of button to blue
newButton.style.color = "white"; //set the color of button to white
newButton.style.fontSize = "20px"; //set the font size of button to 20px
newButton.style.fontWeight = "bold"; //set the font weight of button to bold
newButton.style.border = "none"; //set the border of button to none
newButton.style.padding = "10px 20px"; //set the padding of button to 10px 20px
newButton.style.borderRadius = "5px"; //set the border radius of button to 5px
newButton.style.cursor = "pointer"; //set the cursor of button to pointer
newButton.style.height = "40px"; //set the height of button to 40px
divs[2].append(newButton); //append the button to div2, div 3 is not there
divs[2].style.backgroundColor = "green"; //set the background color of div to green
divs[2].style.color = "white"; //set the color of div to white  
divs[2].prepend(newButton); //append the button to div2
newButton.addEventListener("click", () => {
  alert("Hello World! from button");
});

let newPara = document.createElement("p"); //create a new paragraph element
newPara.innerText = "Hello World! from paragraph"; //set the text of paragraph
// document.querySelector("body").append(newPara); //append the paragraph to body
document.querySelector("body").appendChild(newPara); //append the paragraph to body

document.querySelector(".para").classList.add("newClass"); //add a new class to the paragraph