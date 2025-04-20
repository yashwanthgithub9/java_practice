let button1 = document.getElementById("button1");
let div1 = document.getElementById("div1");
let cickcount=0;
button1.addEventListener("click", function() {
    console.log("Button 1 clicked!");
    if (cickcount%2==0) {
        div1.style.backgroundColor = "#96c8fa";
    }
    else {
        div1.style.backgroundColor = "#ffcccb";
    }
    cickcount++;

})
div1.addEventListener("mouseover", function() {
    console.log("Mouse over div 1!");
}
)