package com.anandh3;
import java.sql.SQLException;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("                           Database Operation Menu");
			System.out.println("************************************************************************************************");
			System.out.println("    1--> Display All Records");
			System.out.println("    2--> Display Record Based on Employee Id");
			System.out.println("    3--> Insert Record");
			System.out.println("    4--> Delete Record");
			System.out.println("    5--> Update Record");
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("                              Enter Your Choice");
			System.out.println("------------------------------------------------------------------------------------------------");
			int choice=sc.nextInt();
			switch(choice){
			case 1: DatabaseOperation.DisplayAll();
			break;
			case 2:DatabaseOperation.getRecordBasedOnId();
	        break;
			case 3:DatabaseOperation.insertRecord();
			break;
			case 4:DatabaseOperation.deleteRecord();
			break;
			case 5:DatabaseOperation.updateRecord();
			break;
	}
	
	System.out.println("                         Do you want to continue y/n");
	System.out.println("                        *****************************");
	char ch=sc.next().charAt(0);
	if(ch=='n') {
		break;
	}
	}
	System.out.println("------------------------------------------------------------------------------------------------");
	System.out.println("                    - - - - Program is terminated - - - -");
	System.out.println("------------------------------------------------------------------------------------------------");
	}

}
