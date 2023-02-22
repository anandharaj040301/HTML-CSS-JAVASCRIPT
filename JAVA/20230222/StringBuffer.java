package com.anandh;
import java.util.Scanner;
public class StringBuffer {

public static void main(String[] args) {
		
		String s="edubridge india pvt ltd";
		//StringBuffer b=new StringBuffer(s);
		//or
		StringBuilder b=new StringBuilder(s); //thread safe
		
		//b.reverse();
		//System.out.println("Reversed string is "+b);
		b.append("Bangalore");
		System.out.println("after append the string is "+b);
		
		b.insert(4, "Hello");
		System.out.println("after insert "+b);
		
		b.delete(4, 15);
		System.out.println("after delete "+b);
		
		
		
	}

}