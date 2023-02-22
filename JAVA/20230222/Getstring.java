package com.anandh;
import java.util.Scanner;
public class Getstring {

	public static void main(String[] args) {
		//getChars()
		String s="edubridge india pvt ltd";
		char ch[]=new char[10];
		
		s.getChars(10, 15, ch, 0);
		System.out.println("Extracted string=");
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
	}

}

