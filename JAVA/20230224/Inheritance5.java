package com.anandh;

class Parent{
	void display() {
		System.out.println("Display method of Parent");
	}
}

class Child extends Parent{
	void display() {
		super.display();
		System.out.println("Display method of Child");
		
	}
}

public class Inheritance5 {

	
	public static void main(String[] args) {
		Child pob=new Child();
            pob.display();
	}

}