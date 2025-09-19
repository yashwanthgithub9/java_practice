package com.oops;
class Demo {
    int num;
    Demo() {
        this(100); // Constructor chaining
        System.out.println("Default Constructor");
    }
    Demo(int n) {
        num = n;
        System.out.println("Parameterized Constructor");
    }
}
public class Constr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Demo obj = new Demo();

	}

}
