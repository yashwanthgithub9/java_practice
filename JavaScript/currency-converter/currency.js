const base_url="https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/";

const dropdownS = document.querySelectorAll(".dropdown select");
const btn = document.querySelector("button");
let out=document.querySelector(".msg #out");

// for (code in countryList) {
//     console.log(code,countryList[code]);
// }

// We are now linking all country code to dropdowns
for (let select of dropdownS) { // 2 selects in dropdowns "From" and "TO"
    for (let currCode in countryList) {// for each select we are assigning country code
        let newOption=document.createElement("option");
        newOption.innerText=currCode;
        newOption.value=currCode;
        // if (select.id==="from" && currCode==="IND") {
        //     newOption.selected="selected";
        //     newOption.value=currCode;
        // }
        // else if (elect.name==="To"&& currCode==="USD") {
        //     newOption.selected="selected";
        // }
        select.append(newOption);
    }
    select.addEventListener("change",(evt)=>{
        updateFlag(evt.target);//target is to which the flag has to change
    });
}

const updateFlag=(el)=>{
    console.log(el);
    let currCode=el.value;
    console.log(currCode);
    let countryCode=countryList[currCode];
    console.log(countryCode);
    let newSrc= `https://flagsapi.com/${countryCode}/flat/64.png`;
    let img=el.parentElement.querySelector("img");//.parentElement and .queryselector are not suggesting we had to type completely
    img.src=newSrc;
}
async function updateRate() {
    event.preventDefault();// default event like loading page will be disabled
    let amount=document.querySelector(".amount input");//amount gives html object have to convert it to value
    console.log(`Button clicked ${amount.value} times`);//converted from onject to value
    // if (amount.value<1) {
    //     alert("Enter correct amount");
    //     amount.value="0";
    //     amount=0;
    // }
    // placing below after select is fetching correct names
let fromCurr=document.querySelector(".from select").value;// its FROM and not FORM
let toCurr=document.querySelector(".to select").value;
    if (amount.value>0) {
        console.log(fromCurr);
        console.log(toCurr);
        const updated_url=`${base_url}${fromCurr.toLowerCase()}.json`;
        console.log(updated_url);
        let response= await fetch(updated_url);
        let data= await response.json();
        console.log(data["date"]);//date is not object
        let contry=data[fromCurr.toLowerCase()];
        let rate=contry[toCurr.toLowerCase()];
        let finalAmount=amount.value*rate; // if we mutiply with amount it will throw NaN error
        console.log(finalAmount);
        out.innerText=`${amount.value} ${fromCurr} = ${finalAmount} ${toCurr}`;
        // console.log(rate);
        // console.log(contry[toCurr.toLowerCase()]);
        // console.log(contry);
        // console.log(data[fromCurr.toLowerCase()]);
    }
    else{
        alert("Enter Correct value");
        amount.value=0;
        amount=0;
    }
}

btn.addEventListener("click",async (event)=>{
    event.preventDefault();
    updateRate();
});
window.addEventListener("load",()=>{
    // alert("Hehee");
    updateRate();
    // out.innerText=`${amount.value} ${fromCurr} = ${finalAmount} ${toCurr}`;

})
