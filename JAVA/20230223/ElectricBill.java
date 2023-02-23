package com.anandh;

import java.util.Scanner;

public class ElectricBill {
	String Name;
	int units;
	double bill;
	double surcharg;
	ElectricBill(){
		Name="";
		units=0;
		bill=0;
	}
	
	void accept() {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter the  Customer name: ");
		Name=myobj.nextLine();
		System.out.println("Units Consumed: ");
		units=myobj.nextInt();
	}
	
	void calculate() {
		if(units<=100) {
			bill=units*2.0;
		}
		else if(units>100 && units<=300) {
			bill=100*2.0+(units-100)*3.0;
		}
		else if(units>300) {
			bill=100*2.0+200*3.0+(units-300)*5;
			surcharg=(bill*2.5)/100;
			bill=bill+surcharg;
		}
		
	}
	void display() {
		System.out.println("Name of the Customer : " +Name);
		System.out.println("Number Of units consumed : " +units);
		System.out.println("Bill Amount : " +bill);
	}
	public static void main(String[] args) {
		ElectricBill obj=new ElectricBill();
		obj.accept();
		obj.calculate();
		obj.display();

	}

}
