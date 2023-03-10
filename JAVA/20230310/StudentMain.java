package com.anandh;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int studentid;
	String studentname;
	float studentfees;
	public Student(int studentid, String studentname, float studentfees) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentfees = studentfees;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentfees=" + studentfees
				+ "]";
	}
	
	
}
public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student(001,"Anand",100000f);
		Student s2=new Student(002,"Arun",100001.1f);
		Student s3=new Student(003,"Vijay",200000f);
		Student s4=new Student(004,"Arul",300000f);
		Student s5=new Student(005,"Jaya",500000f);
		ArrayList<Student> Slist=new ArrayList<Student>();
		Slist.add(s1);
		Slist.add(s2);
		Slist.add(s3);
		Slist.add(s4);
		Slist.add(s5);
		System.out.println(Slist);
		System.out.println("Student ID \t Student Name \t Student Fees");
		Iterator<Student> sit=Slist.iterator();
		while(sit.hasNext()) {
			Student s=sit.next();
			System.out.println(s.studentid+"\t\t"+s.studentname+"\t\t"+s.studentfees);
			
		}
		
	}

}
