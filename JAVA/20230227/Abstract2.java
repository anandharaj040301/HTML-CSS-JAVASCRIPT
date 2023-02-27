package com.anandh1;

abstract class Shape{
	abstract void area();
	void display() {
		System.out.println("Display method of abstract class");
	}
	 static  void func() {
		System.out.println("static method");
	}
}
class Square extends Shape{

	@Override
	void area() {
		System.out.println("square area");
		
	}
	
}
public class Abstract2 {

	public static void main(String[] args) {
		
		Square sob=new Square();
		sob.area();
		sob.display();
		Shape.func();
		
		}
}