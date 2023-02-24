package com.anandh;

class Product1{
	int pid;
	String pname;
	Product1(int pid, String pname){
		this(pid);
		System.out.println("Two argument constructor");
		this.pname=pname;
	}
	Product1(int pid){
		this.pid=pid;
		System.out.println("One argument constructor");
	}
	
	void display() {
		System.out.println("Product id="+pid);
		System.out.println("Product name="+pname);
	}
}

public class Inheritance4 {

	
	public static void main(String[] args) {
		Product1 pob=new Product1(401,"Iphone 13");
            pob.display();
	}

}