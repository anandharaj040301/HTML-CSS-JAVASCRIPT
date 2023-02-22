package com.anandh;

class Display{
	void display(){
	   System.out.println("No arg display");
	}
	void display(int i){
		System.out.println("one int arg "+i);
	}

	void display(float i){
		System.out.println("one float arg "+i);
	}
	void display(double i){
		System.out.println("one double arg "+i);
	}
	void display(float i, float j){
		System.out.println("two float arg "+i +" and "+j);
	}

	void display(int i, float j){
		System.out.println("one int and one  float arg "+i+ " and "+j);
	}
}
public class FunctionOverloading2 {

	public static void main(String[] args) {
		Display dob=new Display();

		dob.display();
		dob.display(2);
		dob.display(2.2f);
		dob.display(3.2);
		dob.display(3.2f,2.9f);
		dob.display(3,4.2f);
		}

}