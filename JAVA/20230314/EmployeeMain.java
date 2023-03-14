package com.anandh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

class student{
	int sid;
	int sage;
	String sname;
	float sfees;
	public student(int sid, int sage, String sname, float sfees) {
		super();
		this.sid = sid;
		this.sage = sage;
		this.sname = sname;
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sage=" + sage + ", sname=" + sname + ", sfees=" + sfees + "]";
	}
	
	}
class AgeSort implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		if(o1.sage>o2.sage) 
			return 1;
		
		else if(o1.sage<o2.sage) 
			return -1;
		
		else
		return 0;
	}
	
}
class IdSort implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		if(o1.sid>o2.sid) 
			return 1;
		
		else if(o1.sid<o2.sid) 
			return -1;
		
		else
		return 0;
	}
	
}
class FeesSort implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		if(o1.sfees>o2.sfees) 
			return 1;
		
		else if(o1.sfees<o2.sfees) 
			return -1;
		
		else
		return 0;
	}
	
}

public class EmployeeMain {

	public static void main(String[] args) {
		student s1=new student(1,22,"Anandharaj",50000.5f);
		student s2=new student(2,22,"Vijay",50020.5f);
		student s3=new student(3,20,"Arun",50022.5f);
		student s4=new student(4,21,"Jaya",50002.5f);
		
		System.out.println("Age Based Sorting");
   TreeSet<student> st=new TreeSet<student>(new AgeSort());
  st.add(s1);
  st.add(s2);
  st.add(s3);
  st.add(s4);
  System.out.println(st);
 	 
  System.out.println("Id Based Sorting");
  TreeSet<student> st1=new TreeSet<student>(new IdSort());
  st1.add(s1);
  st1.add(s2);
  st1.add(s3);
  st1.add(s4);
  System.out.println(st1);
  System.out.println("Fees Based Sorting");
  TreeSet<student> st2=new TreeSet<student>(new FeesSort());
  st2.add(s1);
  st2.add(s2);
  st2.add(s3);
  st2.add(s4);
  System.out.println(st2);
	}

}