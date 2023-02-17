package com.anandh;
import java.util.Scanner;

public class SwithCase1{
	
		public static void main(String[] args) {
			int num,sum;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number:");
			num = sc.nextInt();
			sum = num%10;
			 switch(sum) {
			 
			 case 0:System.out.println(+num+" is a Even Number");
			           break;
			 case 2:System.out.println(+num+" is a Even Number");
	         			break;
			 case 4:System.out.println(+num+" is a Even Number");
			 			break;
			 case 6:System.out.println(+num+" is a Even Number");
			 			break;
			 case 8:System.out.println(+num+" is a Even Number");
	 			break;
			 default:System.out.println(+num+" is a Odd Number");
	        
	         	  
			 }

		}

	}

