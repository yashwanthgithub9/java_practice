const base_url="https://cdn.jsdelivr.net/npm/@fawazahmed0/currency-api@latest/v1/currencies/eur.json";

const dropdownS = document.querySelectorAll(".dropdown select");

// for (code in countryList) {
//     console.log(code,countryList[code]);
// }

// We are now linking all country code to dropdowns
for (let select of dropdownS) { // 2 selects in dropdowns "From" and "TO"
    for (let currCode in countryList) {// for each select we are assigning country code
        let newOption=document.createElement("option");
        newOption.innerText=currCode;
        newOption.value=currCode;
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
