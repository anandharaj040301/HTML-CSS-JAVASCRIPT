package com.anandh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class Hashmapfunc3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer, String>student=new LinkedHashMap<Integer, String>();
		int pid = 0, i;
		String pname = null;
		System.out.println("How many product you want to add?");
		i=sc.nextInt();
		for(int n=1;n<=i;n++) {
			System.out.println("Enter Product ID: ");
			pid=sc.nextInt();
			System.out.println("Enter Product Name: ");
			pname=sc.next();
			student.put(pid, pname);
		}
		System.out.println(student);
	}
}