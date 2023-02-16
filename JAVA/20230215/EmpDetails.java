package com.anandh1;
import java.util.Scanner;
public class EmpDetails {

	public static void main(String[] args) {
		String ename; //to store name use String class
        int eid;
        float esalary;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee name");
        ename=sc.nextLine(); //to read string( one word)
        System.out.println("Enter employee id");
        eid=sc.nextInt();
        System.out.println("Enter employee salary");
        esalary=sc.nextFloat();
        
        System.out.println("Employee Details");
        System.out.println("Employee Name="+ename);
        System.out.println("Employee id="+eid);
        System.out.println("Employee Salary="+esalary);

	}

}
