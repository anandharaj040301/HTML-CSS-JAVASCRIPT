package com.anandh;

class Product{
	int pid;
	String pname;
	Product(int pid, String pname){ //pid=1111  pname="Samsung TV
		this.pid=pid;
		this.pname=pname;
	}
	
	void display() {
		System.out.println("Product id="+pid);
		System.out.println("Product name="+pname);
	}
}

public class Inheritance3 {

	
	public static void main(String[] args) {
		Product pob=new Product(1111,"Samsung TV");
            pob.display();
	}

}
