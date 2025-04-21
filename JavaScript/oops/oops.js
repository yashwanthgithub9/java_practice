class Toyota {
  start() {
    console.log("start");
  }
  stop() {
    console.log("stop");
  }

  setBrand(brnd) {
    this.b = brnd; //b is object specific, variable belongs to object
  }
}

let fortuner = new Toyota;
fortuner.start();
fortuner.setBrand("Hero");
console.log(fortuner.b);


class Person{
    constructor(){
        console.log("Parent constructor")
    }
    eat(){
        console.log("Eaing");

    }
}

class engineer extends Person{
    work(){
        super.eat();//when super is called it will call the function from parent class
        //we cannot directly call parent class function from child class
        console.log("Working on something");
    }
}

let engObj=new engineer;
