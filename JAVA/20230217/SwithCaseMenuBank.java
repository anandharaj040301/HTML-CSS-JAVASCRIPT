package com.anandh;
import java.util.Scanner;
class Bank{
	Bank(){
		amount=100000;
	}
	Scanner myObj = new Scanner(System.in);
double deposite,widthdraw,amount;
	public void Deposite() {
		System.out.println("Enter Deposite Amount : ");
		deposite=myObj.nextInt();
				amount=amount+deposite;
		System.out.println("Updated Balance = "+amount);
	}
	public void Widthdraw() {
		System.out.println("Enter Widthdrawal Amount : ");
		widthdraw=myObj.nextInt();
		if(amount>=widthdraw) {
		amount=amount-widthdraw;
		System.out.println("Updated Balance = "+amount);
		}
		else {
			System.out.println("Insufficient Balance");
			
		}
		
	}
	public void Display() {
		System.out.println("Account Balance = "+amount);
		
	}
	
	
	
	
	
}
public class SwithCaseMenuBank{

	
	public static void main(String[] args) {
		char option;
		do {
		Scanner myObj = new Scanner(System.in);
		System.out.println("To Deposite Enter 1");
		System.out.println("To Widthdraw Enter 2");
		System.out.println("To Check Balance Enter 3");
		System.out.println("---------------------------------");
		System.out.println("Enter Your Choice:");
	    int a = myObj.nextInt();
	    Bank read=new Bank();
	    switch(a){
	    case 1:
	    	read.Deposite();
	    		    	break;
	    case 2:
	    	read.Widthdraw();
	    	break;
	    case 3:
	    	read.Display();
	    	break;
	        
	    	default:
	    		System.out.println("Enter the Correct Choice");
	    		break;
	        
	         	  
			 }
	    
	    System.out.println("Do You Want to Continue. Press y/n");
	    option = myObj.next().charAt(0);
		}while(option!='n');
		System.out.println("Program is terminated");
		}

	}

