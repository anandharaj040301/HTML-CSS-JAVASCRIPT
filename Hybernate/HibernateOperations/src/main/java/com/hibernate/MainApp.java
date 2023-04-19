package com.hibernate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

public class MainApp{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=HibernateUtil.getSessionFact();
		while(true) {
		System.out.println("***************Main Menu************");
		System.out.println("1.Add Records");
		System.out.println("2.Get AllRecords");
		System.out.println("3.Get Record By Employee Id");
		System.out.println("4.Update Employee Name");
		System.out.println("5.Delete Employee By Id");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1: HibernateOperations.addEmployee(sf);
		         break;
		case 2:HibernateOperations.getAllRecords(sf);
		        break;
		case 3:HibernateOperations.getEmployeeById(sf);
		        break;
		case 4:HibernateOperations.updateEmployeeName(sf);
		         System.out.println("update");
		          break;
		case 5:HibernateOperations.deleteEmployeeById(sf);
		        break;
		 default:System.out.println("Invalid input");
		            break;
		} //switch
		System.out.println("Do you want to continue ,press any key to continue and 'n' to stop");
		char choice=sc.next().charAt(0);
		if(choice=='n') {
			break;
		} //if
		
	}//while
		System.out.println("Program is terminated");
	}//main

}//mainclass
