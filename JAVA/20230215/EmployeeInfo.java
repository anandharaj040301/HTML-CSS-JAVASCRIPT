package com.anandh1;
import java.util.Scanner;
class Employee{
	
	String ename;
    int eid;
    float esalary;
    
    void inputData() {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee name");
        ename=sc.nextLine(); 
        System.out.println("Enter employee id");
        eid=sc.nextInt();
        System.out.println("Enter employee salary");
        esalary=sc.nextFloat();
    }
    
    void display() {
    	 System.out.println("Employee Details");
         System.out.println("Employee Name="+ename);
         System.out.println("Employee id="+eid);
         System.out.println("Employee Salary="+esalary);
    }
}

public class EmployeeInfo {

	public static void main(String[] args) {
		
        System.out.println("Main method ");
        
        Employee eob=new Employee();
        eob.inputData();
        eob.display();
       
	}
}
