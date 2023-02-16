package com.anandh1;

import java.util.Scanner;
class Student{
	
	String Sname;
    int Roll_Number;
    String S_F_Name;
    String S_M_Name;
    int Age;
    String Address;
    
    void inputData() {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        Sname=sc.nextLine(); 
        System.out.println("Enter Student Roll Number:");
        Roll_Number=sc.nextInt();
        System.out.println("Enter Father Name:");
        S_F_Name=sc.next();
        System.out.println("Enter Mother Name:");
        S_M_Name=sc.next();
        System.out.println("Enter Student Age:");
        Age=sc.nextInt();
        System.out.println("Enter Student Address:");
        Address=sc.next();
        
    }
    
    void display() {
    	 System.out.println("Student Details");
         System.out.println("Student Name: "+Sname);
         System.out.println("Student Roll Number: "+Roll_Number);
         System.out.println("Student's Father Name: "+S_F_Name);
         System.out.println("Student's Mother Name: "+S_M_Name);
         System.out.println("Student Age: "+Age);
         System.out.println("Student Address: "+Address);
    }
}

public class StudentInfo {

	public static void main(String[] args) {
		                
        Student Stu=new Student();
        Stu.inputData();
        Stu.display();
       
	}
}
