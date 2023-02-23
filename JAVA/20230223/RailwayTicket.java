package com.anandh;

import java.util.Scanner;

public class RailwayTicket {
	String name, coach;
	long mobileno;
	int amount,TotalAmount;
	
	RailwayTicket(){
		name="";
		coach="";
		mobileno=0;
		amount=200;
		TotalAmount=0;
	}
	
	void accept() {
		Scanner myobj=new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=myobj.nextLine();
		System.out.println("Enter the Coach: ");
		coach=myobj.nextLine();
		System.out.println("Enter the Mobile no.: ");
		mobileno=myobj.nextLong();
		
		
	}
	
	void update() {
		if(coach.equals("First_AC")){
			TotalAmount=amount+700;
		}
		else if(coach.equals("Secont_AC")){
			TotalAmount=amount+500;
		}
		else if(coach.equals("Third_AC")){
			TotalAmount=amount+250;
		}
		else if(coach.equals("Sleeper")){
			TotalAmount=amount;
		}
	}


	void display() {
		System.out.println("Passenger Name: "+name);
		System.out.println("Passenger Mobile No.: "+mobileno);
		System.out.println("Selected Coach: "+coach);
		System.out.println("Total Amount to be paid: "+TotalAmount);
	}
	public static void main(String[] args) {
		RailwayTicket obj=new RailwayTicket();
		obj.accept();
		obj.update();
		obj.display();

	}

}
