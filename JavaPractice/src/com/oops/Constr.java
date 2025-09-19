package com.oops;
class Demo {
    int num;
//    Demo() {
//        this(100); // Constructor chaining
//        System.out.println("Default Constructor");
//    }
    Demo(int n) {
        num = n;
        System.out.println("Parameterized Constructor");
    }
}
public class Constr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	        Demo obj = new Demo(); 
	        Demo obj1 =new Demo(0);// when obj is created it will search for default constructor, if there is 
	        // a parameterized constructor java will not provide a default constructor

	}

}
