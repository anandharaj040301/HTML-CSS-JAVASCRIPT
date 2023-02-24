package com.anandh;

class A {
	int a=10;
	A(){
	
	System.out.println("This is a parent Class Costructor");
	}
}

class B extends A {
	int b=40,sum;
	B(){
		System.out.println("This is a Child Class Costructor");
	}
	void sum() {
		sum=a+b;
	}
	
	void display() {
		System.out.println("Sum= "+sum);
	}
	}


public class Inheritance {

	public static void main(String[] args) {
		B ob=new B();
		ob.sum();
		ob.display();

	}

}
