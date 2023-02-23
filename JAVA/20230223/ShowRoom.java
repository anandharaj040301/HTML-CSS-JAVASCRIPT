package com.Showroom;

import java.util.Scanner;

public class ShowRoom {
	String name;
	long mobileno;
	double cost;
	double discount;
	double amount;
	ShowRoom(){
		name="";
		mobileno=0;
		cost=0;
		discount=0;
		amount=0;
	}
	
	void input() {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the Customer Name: ");
		name=myObj.nextLine();
		System.out.println("Enter the Mobile Number: ");
		mobileno=myObj.nextLong();
		System.out.println("Enter the Cost: ");
		cost=myObj.nextDouble();
	}
	
	void calculate() {
		if(cost<=10000) {
			discount=(cost*5)/100;
		}
		else if(cost>10000 && cost<=20000) {
			discount=(cost*10)/100;	
		}
		else if(cost>20000 && cost<=35000) {
			discount=(cost*15)/100;	
		}
		else if(cost>35000) {
			discount=(cost*20)/100;	
		}
		amount=cost-discount;
	}
	
	void display() {
		System.out.println("Customer Name: "+name);
		System.out.println("Customer Mobile No. :" +mobileno);
		System.out.println("Sales Amount: "+cost);
		System.out.println("After Discount: "+amount);
	}

	public static void main(String[] args) {
		ShowRoom obj=new ShowRoom();
		obj.input();
		obj.calculate();
		obj.display();

	}

}
