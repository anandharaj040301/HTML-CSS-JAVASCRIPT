package com.anandh;

public class Student {
int rollno;
String Sname;
String Address;
Student(int rollno,String Sname,String Address){
	this.rollno=rollno;
	this.Sname=Sname;
	this.Address=Address;
	}
public void display() {
	System.out.println("Roll Number: "+rollno);
	System.out.println("Student Name: "+Sname);
	System.out.println("Student Address: "+Address);
}


}
