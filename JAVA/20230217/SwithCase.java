package com.anandh;
import java.util.Scanner;

public class SwithCase{
	
		public static void main(String[] args) {
			char grade;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter grade (ex:A, B, C, D");
			grade = sc.next().charAt(0); //read a character
			 switch(grade) {
			 
			 case 'A':System.out.println("Marks range 90-100");
			           break;
			 case 'B':System.out.println("Marks range 70-89");
	         			break;
			 case 'C':System.out.println("Marks range 40-69");
			 			break;
			 case 'D':System.out.println("Marks range 0-39");
			 			break;
			 default:System.out.println("Invalid input");
	        
	         
			  
			 }

		}

	}

