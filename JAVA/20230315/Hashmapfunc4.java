package com.anandh;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Hashmapfunc4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer, String>student=new TreeMap<Integer, String>();
		int pid = 0, i;
		String pname = null;
		System.out.println("How many Teachers you want to add?");
		i=sc.nextInt();
		for(int n=1;n<=i;n++) {
			System.out.println("Enter Teacher ID: ");
			pid=sc.nextInt();
			System.out.println("Enter Teacher Name: ");
			pname=sc.next();
			student.put(pid, pname);
		}
		System.out.println("Teacher Id \t\t Teacher Name");
		
		for(Map.Entry<Integer,String> mapit: student.entrySet()) {
			System.out.println(mapit.getKey()+"\t\t"+mapit.getValue());
		}
		int c=sc.nextInt();
		boolean a=student.containsKey(c);
		if(a) {
			
		System.out.println("Student Id"+c+"is Exist");
		}
		else {
			System.out.println("Student Id"+c+"is Not Exist");
		}
		sc.close();
	}
}