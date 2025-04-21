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


class User{
    constructor(name,email){
        this.name=name;
        this.email=email;
    }
    viewData(){
        console.log("Name is = ",this.name);
        console.log("Email is = ",this.email);
    }

}

class Admin extends User{
    editData(newName,newEmail,User){
        User.name=newName;
        User.email=newEmail;
    }
}

let user1= new User("Yash","yash@gmail.com");
let user2= new User("reddy","reddy@gmail.com");

let admin = new Admin();
admin.editData("Purra","purra@gmail.com",user1);//edit function that takes data and user to edit details

